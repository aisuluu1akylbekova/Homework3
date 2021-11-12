package com.company;

import java.util.Arrays;


public class Main {

    public static void main(String[] args) {

        double[] number = {1.2,3.4,5.6,-1.2,-7.1,6.6,9.6,-90.9,50.5,30.5,-25.6,60.0,7.9,3.3,-15.0};
        double sum=0;
        double amount=0;
        boolean isNegative = false;
        for (double tempValue : number){
            if (tempValue < 0){
                isNegative=true;
            }else { if (isNegative){
                amount++;
                sum += tempValue;
            }
            }
        }
        System.out.println(Arrays.toString(number));
        System.out.println("Среднее арифметическое значение: " + sum/amount);

        sortingOfNumbers(number);
        System.out.println(Arrays.toString(number));

    }
}

    public static void sortingOfNumbers (double[] abu){
        for (int i = 0; i < abu.length; i++) {
            double minValue = abu[i];
            for (int j = i; j < abu.length; j++) {
                if (minValue > abu[j]){
                    double d = minValue;
                    minValue = abu[j];
                    abu[j]=d;
                }
            }
            abu[i] = minValue;
        }
    }
