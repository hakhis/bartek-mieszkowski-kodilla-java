package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        /* Wyrażenia lambda
        Processor processor = new Processor();
        Executor codeToExecute = () -> System.out.println("This is an example text.");
        processor.execute(codeToExecute);
        processor.execute(() -> System.out.println("This is an example text 2."));
        //*/

        /* Wyrażenia lambda i referencje do metod
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
        //*/

        /* Zadanie 7.1
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String sampleText = "Szedł Sasza suchą szosą";
        System.out.println(poemBeautifier.beautify(sampleText, txt -> "ABC " + sampleText + " ABC"));
        System.out.println(poemBeautifier.beautify(sampleText, txt -> sampleText.toUpperCase()));
        System.out.println(poemBeautifier.beautify(sampleText, txt -> sampleText.toLowerCase()));
        System.out.println(poemBeautifier.beautify(sampleText, txt -> "( ͡° ͜ʖ ͡°) " + sampleText + " ( ͡° ͜ʖ ͡°)"));
        //*/

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
