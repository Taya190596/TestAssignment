package com.company;

import java.util.Scanner;
import com.company.Engine.ExpressionProcessor.ExpressionProcessor;

public class Main {

    public static void main(String[] args) throws Exception {
	    ExpressionProcessor expressionProcessor = new ExpressionProcessor();
        Scanner sc = new Scanner(System.in);

        for (String input = sc.nextLine(); expressionProcessor.process(input); input = sc.nextLine());
    }
}
