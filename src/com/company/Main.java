package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s1 = "звезда";
        String s2 = "месяц";
        String s3 = "луна";
        System.out.println("Введите 4 строку: ");
        String s4 = scn.nextLine();
        System.out.println("Введите 5 строку: ");
        String s5 = scn.nextLine();
        if (s4.equals(s5)){



                System.out.print("\nРезультат сложения строк \""+s1+"\" и "+"\""+s2+"\": ");
             }

else {

            System.out.print("\nРезультат сложения строк \""+s1+"\" и "+"\""+s3+"\": ");
        }
    }
}