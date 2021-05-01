package com.company.Operator;

public class Operator{
    private com.company.Number.Number _operand1;
    private com.company.Number.Number _operand2;
    private com.company.OperatorType.OperatorType _operatorType;

    public Operator(com.company.Number.Number operand1, com.company.Number.Number operand2, com.company.OperatorType.OperatorType operatorType){
        _operand1 = operand1;
        _operand2 = operand2;
        _operatorType = operatorType;
    }

    public com.company.Number.Number getOperand1(){
        return _operand1;
    }

    public com.company.Number.Number getOperand2(){
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
                if (_operand2.getNumber() == 0)
                    throw new Exception("Positive infinity exception");
                return _operand1.getNumber() / _operand2.getNumber();
            default: throw new Exception("Undefined operator.");
        }
    }
}