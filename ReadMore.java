package org.kartik.kbp.codeeval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by kartikbvarma on 7/21/16.
 */
public class ReadMore {

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();

//            System.out.println("line length :: "+line.length());
            if (line.length() <= 55){
                System.out.println(line);
            }
            else {
                String shortLine = (String) line.subSequence(0,40);
                System.out.println(shortLine.trim().concat("... <Read More>"));
//                System.out.println("line length :: "+shortLine.trim().length());
            }

        }
    }
}
