package com.company.Number;

public class Number{
    private com.company.NumberType.NumberType _numberType;
    private int _number;

    public Number(int number, com.company.NumberType.NumberType numberType){
        _numberType = numberType;
        _number = number;
    }

    public int getNumber(){
        return _number;
    }

    public com.company.NumberType.NumberType getNumberType(){
        return _numberType;
    }
}