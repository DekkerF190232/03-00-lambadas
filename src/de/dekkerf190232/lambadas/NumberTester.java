package de.dekkerf190232.lambadas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NumberTester {

    public static final int TEST_EVEN = 1;
    public static final int TEST_PRIME = 2;
    public static final int TEST_PALINDROME = 3;

    private final String fileName;

    private NumberTest oddTester;
    private NumberTest primeTester;
    private NumberTest palindromeTester;

    public NumberTester(String fileName) {
        this.fileName = fileName;
    }

    public void setOddEvenTester(NumberTest oddTester) {
        this.oddTester = oddTester;
    }

    public void setPrimeTester(NumberTest primeTester) {
        this.primeTester = primeTester;
    }

    public void setPalindromeTester(NumberTest palindromeTester) {
        this.palindromeTester = palindromeTester;
    }

    public void testFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            int count = 0;
            while ((line = br.readLine()) != null) {
                String[] split = line.split(" ");
                if (split.length == 1) {
                    count = Integer.parseInt(line);
                    continue;
                }
                int n1 = Integer.parseInt(split[0]);
                int n2 = Integer.parseInt(split[1]);
                switch (n1) {
                    case TEST_EVEN:
                        System.out.println("even(" + n2 + ") = " + oddTester.testNumber(n2));
                        break;
                    case TEST_PRIME:
                        System.out.println("prime(" + n2 + ") = " + palindromeTester.testNumber(n2));
                        break;
                    case TEST_PALINDROME:
                        System.out.println("palindrome(" + n2 + ") = " + palindromeTester.testNumber(n2));
                        break;
                    default:
                        throw new RuntimeException();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
