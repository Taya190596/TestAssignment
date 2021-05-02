package com.company.OperatorTypeDetector;

import com.company.OperatorType.OperatorType;

public class OperatorTypeDetector {
    public OperatorType GetOperatorType(char operator) throws Exception {
        switch (operator){
            case '+':
                return OperatorType.Add;
            case '-':
                return OperatorType.Sub;
            case '*':
                return OperatorType.Mul;
            case '/':
                return OperatorType.Div;
            default: throw new Exception("Invalid operator");
        }
    }
}