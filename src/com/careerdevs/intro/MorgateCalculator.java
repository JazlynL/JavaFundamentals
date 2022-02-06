package com.careerdevs.intro;

import java.text.NumberFormat;
import java.util.Scanner;

public class MorgateCalculator {
    public static void main(String[] args) {
       final byte monthInYear = 12;
        final byte  percentage = 100;
        Scanner scan = new Scanner(System.in);
        System.out.println("Principal: ");
        int principal = scan.nextInt();
        System.out.println("Annual Interest: ");
        float annualInterest = scan.nextFloat();
        float monthlyInterest = annualInterest/monthInYear/percentage;

        System.out.println("Period (years): ");
        byte years = scan.nextByte();
        int overallYear = years*monthInYear;

        double mortgage =principal *(monthlyInterest * Math.pow(1 + monthlyInterest,overallYear))/(Math.pow(1+monthlyInterest, overallYear)-1);

        String mortgageFormat = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormat);


    }
}
