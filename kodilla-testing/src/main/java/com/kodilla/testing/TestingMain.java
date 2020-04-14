package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        //Test for SimpleUser
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        //Tests for Calculator
        Calculator calculator = new Calculator();
        //Adding
        if(calculator.add(1, 14) == 15){
            System.out.println("Test for add OK");
        } else {
            System.out.println("add Error!");
        }
        //Subtracting
        if(calculator.subtract(10, 4) == 6){
            System.out.println("Test for subtract OK");
        } else {
            System.out.println("subtract Error!");
        }
    }
}