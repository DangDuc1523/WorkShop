
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hoang Dang Duc
 */
public class MyString implements IString {

    @Override
    public int f1(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (isPrimeDigit(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    private boolean isPrimeDigit(char c) {
        int digit = Character.getNumericValue(c);
        return Arrays.asList(2, 3, 5, 7).contains(digit);
    }
    @Override
    public String f2(String str) {
        String[] words = str.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }
} 