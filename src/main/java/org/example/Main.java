package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Task1();
//        Task2();
//        Task3();
//        Task4();
//        Task5();
//        Task6();
//        Task7();
//        Task8();
//        Task9();
//        Task10();
//        System.out.println("Sum number = " + Task11(1, 9));

        int[] task12 = Task12(new int[]{1, 2, 3, 4, 5});
        System.out.println(Arrays.toString(task12));
    }

    private static void Task1() {
        System.out.println("Fall seven times \nand \nstand up eight");
    }

    private static void Task2() {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[2];
        for (int i = 1; i <= 2; i++) {
            System.out.println("Input" + i + "number: ");
            boolean isInt = scanner.hasNextInt();
            if (isInt) {
                numbers[i - 1] = scanner.nextInt();
            }
        }
        System.out.println(numbers[0] + " + " + numbers[1] + " = " + (numbers[0] + numbers[1]));
        System.out.println(numbers[0] + " - " + numbers[1] + " = " + (numbers[0] - numbers[1]));
        System.out.println(numbers[0] + " * " + numbers[1] + " = " + (numbers[0] * numbers[1]));
        System.out.println(numbers[0] + " / " + numbers[1] + " = " + (numbers[0] / numbers[1]));
    }

    private static void Task3() {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Input XXXX number: ");

        boolean isInt = scanner.hasNextInt();
        if (isInt) {
            number = scanner.nextInt();
            System.out.println(number);
        } else {
            System.out.println("It's not a number!");
            return;
        }

        String tmp = String.valueOf(number);

        if (tmp.length() != 4) {
            System.out.println("It's not a XXXX number!");
            return;
        } else {
            tmp = new StringBuilder(tmp).reverse().toString();
            number = Integer.parseInt(tmp);
            System.out.println("Reverce number: " + number);
        }
    }

    private static void Task4() {
        Scanner scanner = new Scanner(System.in);

        int hour;
        System.out.println("Input time in hour: ");

        boolean isInt = scanner.hasNextInt();

        if (isInt) {
            hour = scanner.nextInt();
            System.out.println(hour);
        } else {
            System.out.println("Error!");
            return;
        }

        if (hour >= 0 && hour <= 6) {
            System.out.println("Good Night!");
        } else if (hour >= 7 && hour <= 13) {
            System.out.println("Good Morning!");
        } else if (hour >= 14 && hour <= 17) {
            System.out.println("Good Day!");
        } else if (hour >= 18 && hour <= 23) {
            System.out.println("Good Evening!");
        } else {
            System.out.println("You input non-existing hour");
        }

    }

    private static void Task5() {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Input XXXXXX number: ");

        boolean isInt = scanner.hasNextInt();
        if (isInt) {
            number = scanner.nextInt();
        } else {
            System.out.println("It's not a number!");
            return;
        }

        String tmp = String.valueOf(number);

        if (tmp.length() != 6) {
            System.out.println("It's not a XXXXXX number!");
            return;
        } else {
            int firstPart = 0, secondPart = 0;
            firstPart += number / 100000;
            firstPart += (number / 10000) % 10;
            firstPart += (number / 1000) % 10;

            secondPart += (number / 100) % 10;
            secondPart += (number / 10) % 10;
            secondPart += number % 10;

            if (firstPart == secondPart)
                System.out.println("It's a lucky number!");
            else
                System.out.println("It's not a lucky number!");
        }
    }

    private static void Task6() {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Input number from 1 to 100: ");

        boolean isInt = scanner.hasNextInt();
        if (isInt) {
            number = scanner.nextInt();
        } else {
            System.out.println("It's not a number!");
            return;
        }

        if (number >= 0 && number <= 100) {
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("Fizz Buzz");
            } else if (number % 3 == 0) {
                System.out.println("Fizz");
            } else if (number % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(number);
            }
        }
    }

    private static void Task7() {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Input number: ");

        boolean isInt = scanner.hasNextInt();
        if (isInt) {
            number = scanner.nextInt();
            System.out.println("Factorial of " + number + " = " + factorial(number));
        } else {
            System.out.println("It's not a number!");
            return;
        }
    }

    private static void Task8() {
        Scanner scanner = new Scanner(System.in);
        int start = 0, end = 0;
        System.out.println("Input start number");
        boolean isInt = scanner.hasNextInt();
        if (isInt) {
            start = scanner.nextInt();
            if (start <= 1) {
                System.out.println("Error!");
                return;
            }
        }
        System.out.println("Input end number");
        boolean isInt1 = scanner.hasNextInt();
        if (isInt1) {
            end = scanner.nextInt();
        }

        System.out.println("Prime number in range from " + start + " to " + end + " : ");

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    private static void Task9() {
        Scanner scanner = new Scanner(System.in);

        int n = 10;
        int[] arr = new int[n];
        int sum = 0, average = 0;

        System.out.println("Input elements of array:");
        for (int i = 0; i < n; i++) {
            boolean isInt = scanner.hasNextInt();
            if (isInt) {
                arr[i] = scanner.nextInt();
            } else return;

            sum += arr[i];
        }
        average = sum / n;

        System.out.print("Elements of array: ");
        for (int elem : arr) {
            System.out.print(elem + " ");
        }
        System.out.println("\nSum of elements = " + sum);
        System.out.println("Average number = " + sum);

    }

    private static void Task10() {
        Scanner scanner = new Scanner(System.in);

        int n = 10;
        int[] arr = new int[n];
        int count = 0;
        int number;
        boolean isInt;

        System.out.println("Input elements of array:");
        for (int i = 0; i < n; i++) {
            isInt = scanner.hasNextInt();
            if (isInt) {
                arr[i] = scanner.nextInt();
            } else return;
        }
        System.out.println("Input number for checking:");
        isInt = scanner.hasNextInt();
        if (isInt) {
            number = scanner.nextInt();
        } else return;

        for (int elem : arr) {
            if (elem == number)
                count++;
        }
        System.out.println("Your number is found " + count + " times");
    }

    private static int Task11(int start, int end) {
        Scanner scanner = new Scanner(System.in);

        int n = 10;
        int sum = 0;

        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }

    private static int[] Task12(int[] arr) {
        int[] factorialArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            factorialArr[i] = factorial(arr[i]);
        }
        return factorialArr;
    }

    private static boolean isPrime(int num) {
        //тут встановлюємо діапазон до Math.sqrt(num), бо далі шукати немає сенсу
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static int factorial(int n) {
        if (n <= 1) return 1;
        else return n * factorial(n - 1);
    }
}