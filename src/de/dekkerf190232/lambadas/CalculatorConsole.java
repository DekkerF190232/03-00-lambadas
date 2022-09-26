package de.dekkerf190232.lambadas;

import java.util.Scanner;

public class CalculatorConsole {

    public static final Scanner scanner = new Scanner(System.in);

    public static void run() {
        while (true) {
            System.out.println("Choose Calculator");
            System.out.println("  1 Rational");
            System.out.println("  2 Vector");
            System.out.println("  9 EXIT");
            String line = scanner.nextLine();

            int option = -1;
            try {
                option = Integer.parseInt(line);
            } catch (NumberFormatException t) {
            }
            if (option == 1) {
                RationalCalculator rational = new RationalCalculator();
                while (true) {
                    System.out.println("[Fractions] Enter <+|-|*|/> <num1/den1> <num2/den2> e.g. + 3/4 4/5");
                    String command = scanner.nextLine();
                    String[] split = command.split(" ");
                    if (split.length != 3) {
                        System.out.println("Invalid syntax!");
                        break;
                    }
                    Numbers n1, n2;
                    try {
                        String[] s1 = split[1].split("/");
                        n1 = new Numbers(Integer.parseInt(s1[0]), Integer.parseInt(s1[1]));
                        String[] s2 = split[2].split("/");
                        n2 = new Numbers(Integer.parseInt(s2[0]), Integer.parseInt(s2[1]));
                    } catch (NumberFormatException | IndexOutOfBoundsException e) {
                        System.out.println("Invalid syntax!");
                        break;
                    }
                    if (split[0].equals("+")) {
                        System.out.println(fractionToString(rational.add(n1, n2)));
                    } else if (split[0].equals("-")) {
                        System.out.println(fractionToString(rational.subtract(n1, n2)));
                    } else if (split[0].equals("*")) {
                        System.out.println(fractionToString(rational.multiply(n1, n2)));
                    } else if (split[0].equals("/")) {
                        System.out.println(fractionToString(rational.divide(n1, n2)));
                    } else {
                        System.out.println("Invalid syntax!");
                        break;
                    }
                }
            } else if (option == 2) {
                VectorCalculator rational = new VectorCalculator();
                while (true) {
                    System.out.println("[Vectors] Enter <+|-|*|/> <x1,y1> <x2,y2> e.g. + 3,4 4,5");
                    String command = scanner.nextLine();
                    String[] split = command.split(" ");
                    if (split.length != 3) {
                        System.out.println("Invalid syntax!");
                        break;
                    }
                    Numbers n1, n2;
                    try {
                        String[] s1 = split[1].split(",");
                        n1 = new Numbers(Integer.parseInt(s1[0]), Integer.parseInt(s1[1]));
                        String[] s2 = split[2].split(",");
                        n2 = new Numbers(Integer.parseInt(s2[0]), Integer.parseInt(s2[1]));
                    } catch (NumberFormatException | IndexOutOfBoundsException e) {
                        System.out.println("Invalid syntax!");
                        break;
                    }
                    if (split[0].equals("+")) {
                        System.out.println(rational.add(n1, n2));
                    } else if (split[0].equals("-")) {
                        System.out.println(rational.subtract(n1, n2));
                    } else if (split[0].equals("*")) {
                        System.out.println(rational.multiply(n1, n2));
                    } else if (split[0].equals("/")) {
                        System.out.println(rational.divide(n1, n2));
                    } else {
                        System.out.println("Invalid syntax!");
                        break;
                    }
                }
            } else if (option == 9) {
                break;
            } else {
                System.out.println("Invalid option!");
            }
        }
    }

    private static String fractionToString(Numbers numbers) {
        return (int) numbers.getA() + "/" + (int) numbers.getB();
    }
}
