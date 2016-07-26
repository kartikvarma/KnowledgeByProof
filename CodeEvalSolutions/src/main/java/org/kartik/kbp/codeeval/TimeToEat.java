package org.kartik.kbp.codeeval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Created by kartikbvarma on 7/22/16.
 */
public class TimeToEat {

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();

            String[] giveTimes = line.split(" ");

            HashMap<Integer, String> timeMap = new HashMap<>();

            for (int i=0; i<giveTimes.length;i++){

                String[] integerArray = giveTimes[i].split(":");

                StringBuffer intBuffer = new StringBuffer();

                for(int j=0; j<integerArray.length;j++){
                    intBuffer.append(integerArray[j]);
                }

                timeMap.put(Integer.parseInt(intBuffer.toString().trim()),giveTimes[i]);
            }

            Map<Integer,String> sortedMap = new TreeMap<>(
                    new Comparator<Integer>() {
                        @Override
                        public int compare(Integer o1, Integer o2) {
                            return o2.compareTo(o1);
                        }
                    }
            );

            sortedMap.putAll(timeMap);

            StringBuffer stb = new StringBuffer();

            for(Map.Entry<Integer, String> entry : sortedMap.entrySet()){
                stb.append(entry.getValue()+" ");
            }

            System.out.println(stb.toString().trim());


        }
    }
}
