package com.company.Number;

import com.company.NumberType.NumberType;

public class UNumber {
    private NumberType _numberType;
    private int _number;

    public UNumber(int number, NumberType numberType){
        _numberType = numberType;
        _number = number;
    }

    public int getNumber(){
        return _number;
    }

    public NumberType getNumberType(){
        return _numberType;
    }
}