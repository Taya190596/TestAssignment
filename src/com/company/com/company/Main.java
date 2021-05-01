package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
	    com.company.Engine.ExpressionProcessor.ExpressionProcessor expressionProcessor = new com.company.Engine.ExpressionProcessor.ExpressionProcessor();

        String input;
        boolean noExit = false;
        Scanner sc = new Scanner(System.in);
	    do{
            input = sc.nextLine();
            noExit = expressionProcessor.process(input);
        }
	    while (noExit);
    }
}
