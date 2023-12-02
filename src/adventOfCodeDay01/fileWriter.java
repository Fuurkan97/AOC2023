package adventOfCodeDay01;

import java.io.*;

public class fileWriter {

    public static void fileWriter(){

        String filePath = "C:\\Users\\Furkan\\Desktop\\AdventofCode" +
                "\\Advent-of-Code\\src\\adventOfCodeDay01\\advent01";

        String[] stringsToReplace = {"one", "two", "three",
                "four", "five", "six", "seven", "eight", "nine"};

        String[] replacements = {"one1one", "two2two", "three3three", "four4four",
                "five5five", "six6six", "seven7seven", "eight8eight", "nine9nine"};

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Furkan\\Desktop" +
                     "\\" + "AdventofCode\\" + "Advent-of-Code\\src\\adventOfCodeDay01\\advent01ReWrited"))) {
            String line;
            while ((line = reader.readLine()) != null) {

                for (int i = 0; i < stringsToReplace.length; i++) {
                    line = line.replace(stringsToReplace[i], replacements[i]);
                }

                writer.write(line+ "\n");
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
      }
    }


