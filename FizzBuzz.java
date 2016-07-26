package org.kartik.kbp.codeeval;

import java.io.*;

/**
 * Created by kartikbvarma on 7/21/16.
 */
public class FizzBuzz {

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();

            StringBuffer stBuff = new StringBuffer();

            String[] arrayOfChars = line.split(" ");

            int xNumber = Integer.parseInt(arrayOfChars[0]);

            int yNumber = Integer.parseInt(arrayOfChars[1]);

            int nNumber = Integer.parseInt(arrayOfChars[2]);

            for (int i = 1; i <= nNumber; i++) {

                if(i % xNumber == 0 && i % yNumber != 0){
                    stBuff.append(" "+i);
                }

                else if (i % yNumber == 0 && i %xNumber != 0)  {
                    stBuff.append(" "+i);
                }

                else if (i % xNumber == 0 && i % yNumber == 0) {
                    stBuff.append(" "+i);
                }
                else {
                    stBuff.append(" "+i);
                }
            }

            System.out.println(stBuff.toString().trim());


        }
    }

}
