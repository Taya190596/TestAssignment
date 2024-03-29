package com.company.Parser;

import com.company.Number.UNumber;
import com.company.NumberType.NumberType;
import com.company.Operator.Operator;
import com.company.OperatorType.OperatorType;
import com.company.RomNumbersConverter.RomNumbersConverter;
import com.company.OperatorTypeDetector.OperatorTypeDetector;

public class Parser {
    private final RomNumbersConverter converter = new RomNumbersConverter();
    private final OperatorTypeDetector detector = new OperatorTypeDetector();

    private boolean IsOperator(char c){
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    private String[] split(String source, char separator) throws Exception {
        String[] result = new String[2];
        for (int i = 0; i < 2; ++i){
            result[i] = "";
        }
        for (int i = 0, n = source.length(), index = 0; i < n; ++i){
            if (source.charAt(i) == separator){
                ++index;
                if (index > 1)
                    throw new Exception("More than one operator found.");
                continue;
            }
            else{
                result[index] += String.valueOf(source.charAt(i));
            }
        }
        return result;
    }

    public Operator getOperator(String input) throws Exception {
        input = input.replace(" ", "");
        String[] parts = new String[0];
        char operator = (char)0;
        boolean operatorFound = false;
        for (int i = 0, n = input.length(); i < n; ++i){
            if (IsOperator(input.charAt(i))) {
                operatorFound = true;
                operator = input.charAt(i);
                parts = split(input, input.charAt(i));
                break;
            }
        }
        if (!operatorFound)
            throw new Exception("Operator is not found.");
        if (parts.length != 2)
            throw new Exception("Invalid operands count.");

        int operand1;
        int operand2;
        NumberType op1type;
        NumberType op2type;
        try{
            operand1 = Integer.parseInt(parts[0]);
            op1type = NumberType.Arabic;
        }
        catch (Exception ex){
            operand1 = converter.getValue(parts[0]);
            op1type = NumberType.Rom;
        }
        try{
            operand2 = Integer.parseInt(parts[1]);
            op2type = NumberType.Arabic;
        }
        catch (Exception ex){
            operand2 = converter.getValue(parts[1]);
            op2type = NumberType.Rom;
        }

        OperatorType opType = detector.GetOperatorType(operator);

        UNumber op1 = new UNumber(operand1, op1type);
        UNumber op2 = new UNumber(operand2, op2type);

        return new Operator(op1, op2, opType);
    }

    public String getResult(int number, NumberType numberType) throws Exception {
        switch (numberType){
            case Arabic:
                return String.valueOf(number);
            case Rom:
                return converter.setValue(number);
            default: throw new Exception("Unsupported number type");
        }
    }
}