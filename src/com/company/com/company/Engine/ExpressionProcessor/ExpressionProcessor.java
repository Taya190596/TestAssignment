package com.company.Engine.ExpressionProcessor;

import com.company.NumberType.NumberType;

public class ExpressionProcessor {
    private final com.company.Parser.Parser parser = new com.company.Parser.Parser();
    private final com.company.Validator.Validator validator = new com.company.Validator.Validator();
    private final com.company.Writer.Writer writer = new com.company.Writer.Writer();

    public boolean process(String input) throws Exception {
        if (input.compareToIgnoreCase("exit") == 0)
            return false;

        com.company.Operator.Operator operator = parser.getOperator(input);
        NumberType numberType = validator.validate(operator.getOperand1(), operator.getOperand2());
        int result = operator.getResult();
        String output = parser.getResult(result, numberType);
        writer.write(output);

        return true;
    }
}