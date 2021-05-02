package com.company.Operator;

import com.company.Number.UNumber;
import com.company.OperatorType.OperatorType;

public class Operator{
    private final UNumber _operand1;
    private final UNumber _operand2;
    private final OperatorType _operatorType;

    public Operator(UNumber operand1, UNumber operand2, OperatorType operatorType){
        _operand1 = operand1;
        _operand2 = operand2;
        _operatorType = operatorType;
    }

    public UNumber getOperand1(){
        return _operand1;
    }

    public UNumber getOperand2(){
        return _operand2;
    }

    public int getResult() throws Exception {
        switch (_operatorType) {
            case Add:
                return _operand1.getNumber() + _operand2.getNumber();
            case Sub:
                return _operand1.getNumber() - _operand2.getNumber();
            case Mul:
                return _operand1.getNumber() * _operand2.getNumber();
            case Div:
                return _operand1.getNumber() / _operand2.getNumber();
            default:
                throw new Exception("Undefined operator.");
        }
    }
}