package org.example.Exday3.ProjectTxtFile;
import java.io.*;
import java.util.*;


public class CharacterCounter {


    public static Map<Character, Integer> countCharacters(String fileName) {
        Map<Character, Integer> c1 = new HashMap<>();

        try (Scanner sc = new Scanner(new File(fileName))) {
            while (sc.hasNext()) {
                String line = sc.nextLine();
                for (char cha : line.toCharArray()) {
                    if (!Character.isWhitespace(cha)) {
                        c1.put(cha, c1.getOrDefault(cha, 0) + 1);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Not Found!!");
        }

        return c1;
    }
}
