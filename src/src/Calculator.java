package src;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 10;
        int b = 5;
        int input = scanner.nextInt();
        switch (input){
            case 1 -> System.out.println(a + b);
            case 2 -> System.out.println(a - b);
            case 3-> {
                int i = a * b;
                System.out.println(i);
            }

            case 4-> {
                int i = a / b;
                System.out.println(i);
            }

        }
    }
}
