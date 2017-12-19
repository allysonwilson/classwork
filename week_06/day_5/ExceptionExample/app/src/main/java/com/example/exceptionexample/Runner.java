package com.example.exceptionexample;

/**
 * Created by allysonwilson on 9/11/17.
 */

public class Runner {
    public static void main(String[] args) {
        try {
            int one = 1;
            int zero = 0;
            System.out.println(one / zero);
//            below code won't print as the exception happens above and triggers catch block
            System.out.println("Hello");
        } catch (ArithmeticException e) {
            System.out.println("ERROR" + e.getMessage());

        } catch (Exception e) {
            System.out.println("Unsepcified error");
//            generally not good idea to use above catch method
        }
    }
}