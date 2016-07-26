package org.kartik.kbp.codeeval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * Created by kartikbvarma on 7/22/16.
 */
public class DecodeNumbers {

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();

            List<String> numbers = Arrays.asList(line.split("(?<=.)"));
            List<String> combinations;



        }
    }

}
