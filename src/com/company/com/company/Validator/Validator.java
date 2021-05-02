package com.company.Validator;

import com.company.Number.UNumber;
import com.company.NumberType.NumberType;

public class Validator{
    public NumberType validate(UNumber operand1, UNumber operand2) throws Exception {
        if (operand1.getNumberType() != operand2.getNumberType())
            throw new Exception("Different number types.");
        if (operand1.getNumber() < 1 || operand1.getNumber() > 10)
            throw new Exception("Invalid operand 1 value.");
        if (operand2.getNumber() < 1 || operand2.getNumber() > 10)
            throw new Exception("Invalid operand 2 value.");
        return operand1.getNumberType();
    }
}