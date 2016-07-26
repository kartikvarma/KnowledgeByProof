package org.kartik.kbp.codeeval;

import java.util.*;

/**
 * Created by kartikbvarma on 7/24/16.
 */
public class PrimePalindrome {

    public static void main(String[] args) {

        List<Integer> listOfPrimes = new ArrayList<>();

        for (int i = 2; i <= 1000; i++) {
            if (listOfPrimes.size() < 1000) {
                boolean isPrime = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    if (isPalindrome(String.valueOf(i))) {
                        listOfPrimes.add(i);
                    }
                }
            }else {
                break;
            }
        }

        Collections.sort(listOfPrimes,Collections.reverseOrder());

        System.out.println(listOfPrimes.get(0));

    }

    public static boolean isPalindrome(String s){
        boolean palindrome =false;
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb = sb.reverse();
        for (int i=0;i < s.length();i++){
            if (sb.charAt(i) == s.charAt(i)){
                palindrome = true;
            }else {
                palindrome = false;
                break;
            }

        }
        return palindrome;
    }
}
