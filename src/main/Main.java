package main;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;


public class Main {

    public static void main(String[] args){

        System.out.println("Введите число");

        Scanner scan = new Scanner(System.in);

        String UserInputString = scan.nextLine();

        System.out.println(Sum(0, UserInputString));

    }

    static int Sum(int i, @NotNull String s) {
        int result = Integer.parseInt(String.valueOf(s.charAt(i)));

        if (i == s.length() - 1){
            System.out.println("Сумма элементов равна:");
            return result;
        }
        else{
            return result + Sum( i + 1,  s);
        }
    }
}