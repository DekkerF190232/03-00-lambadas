package de.dekkerf190232.lambadas;

public class Main {

    public static void main(String[] args) {
//        HalloJavaMitForEach.example1();

//        NumberTester tester = new NumberTester("tests.txt");
//        tester.setOddEvenTester(n -> n % 2 == 0);
//        tester.setPrimeTester(n -> {
//            if (n <= 1) return false;
//            for (int i = 2; i * i <= n; i++) {
//                if (n % i == 0) return false;
//            }
//            return true;
//        });
//        tester.setPalindromeTester(n -> {
//            int palindrome = n;
//            int reverse = 0;
//            while (palindrome != 0) {
//                int remainder = palindrome % 10;
//                reverse = reverse * 10 + remainder;
//                palindrome = palindrome / 10;
//            }
//            return n == reverse;
//        });
//        tester.testFile();

        RationalCalculator c = new RationalCalculator();
        System.out.println(c.add(new Numbers(1,4), new Numbers(3,8)));
    }

}
