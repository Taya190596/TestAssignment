package com.company.RomNumbersConverter;

public class RomNumbersConverter{
    public int getValue(String romNumber) throws Exception {
        switch (romNumber){
            case "I":
                return 1;
            case "II":
                return 2;
            case "III":
                return 3;
            case "IV":
                return 4;
            case "V":
                return 5;
            case "VI":
                return 6;
            case "VII":
                return 7;
            case "VIII":
                return 8;
            case "IX":
                return 9;
            case "X":
                return 10;
            default: throw new Exception("Unsupported or invalid value.");
        }
    }

    public String setValue(int number) throws Exception {
        if (number == 0)
            return "Zero. Has not roman value.";
        boolean isNegative = number < 0;
        number = Math.abs(number);

        int numbers[]  = {1, 4, 5, 9, 10, 50, 100, 500, 1000 };
        String letters[]  = { "I", "IV", "V", "IX", "X", "L", "C", "D", "M"};
        String romanValue = "";
        int n = number;
        while (n > 0){
            for (int i = 0, len = numbers.length; i < len; ++i){
                if (n < numbers[i]){
                    n -= numbers[i - 1];
                    romanValue += letters[i - 1];
                    break;
                }
            }
        }
        if (isNegative)
            romanValue = "-" + romanValue;
        return romanValue;
    }
}