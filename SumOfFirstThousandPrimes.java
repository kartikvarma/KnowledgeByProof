package org.kartik.kbp.codeeval;

import java.util.*;

/**
 * Created by kartikbvarma on 7/23/16.
 */
public class SumOfFirstThousandPrimes {

    public static void main(String[] args) {
        int x = 2;

        List<Integer> listOfPrimes = new ArrayList<>();

        for (int i = 2; i <= x; i++) {
            if (listOfPrimes.size() < 1000) {
                 boolean isPrime = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                x++;
                if (isPrime) {
                    listOfPrimes.add(i);
                }
            }else {
                break;
            }

        }
        System.out.println("Prime number are : "+Arrays.asList(listOfPrimes));
        if (listOfPrimes.size() == 1000) {
            System.out.println(listOfPrimes.stream().mapToInt(Integer::intValue).sum());
        }
    }
}
