package com.company.Engine.ExpressionProcessor;

import com.company.NumberType.NumberType;
import com.company.Parser.Parser;
import com.company.Validator.Validator;
import com.company.Writer.Writer;
import com.company.Operator.Operator;

public class ExpressionProcessor {
    private final Parser parser = new Parser();
    private final Validator validator = new Validator();
    private final Writer writer = new Writer();

    public boolean process(String input) throws Exception {
        if (input.compareToIgnoreCase("exit") == 0)
            return false;

        Operator operator = parser.getOperator(input);
        NumberType numberType = validator.validate(operator.getOperand1(), operator.getOperand2());
        int result = operator.getResult();
        String output = parser.getResult(result, numberType);
        writer.write(output);

        return true;
    }
}