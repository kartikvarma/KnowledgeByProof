package org.kartik.kbp.codeeval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.regex.Matcher;

/**
 * Created by kartikbvarma on 7/23/16.
 */
public class CleanUpWords {

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] newLine = (line.replaceAll("[\\P{L}]", " ").trim().toLowerCase()).split("\\s+");
            StringBuffer stb = new StringBuffer();
            for (int i = 0;i < newLine.length;i++){
                stb.append(newLine[i]+" ");
            }
            System.out.println(stb.toString().trim());

        }
    }
}


