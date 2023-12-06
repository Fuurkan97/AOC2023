package adventOfCode2023.adventOfCodeDay04;

import java.io.*;

public class fileWriter {
    public static void write(){


        String filePath = "C:\\Users\\Furkan\\Desktop\\AdventofCode\\Advent-of-Code\\src\\adventOfCode2023.adventOfCodeDay04\\advent04";

        String[] stringsToReplace = {" 1 ", " 2 ", " 3 ",
                " 4 ", " 5 ", " 6 ", " 7 ", " 8 ", " 9 ",
                "  1","  2","  3","  4","  5","  6","  7","  8","  9"};

        String[] replacements = {"01 ", "02 ", "03 ", "04 ",
                "05 ", "06 ", "07 ", "08 ", "09 ",
                " 01"," 02"," 03"," 04"," 05"," 06"," 07"," 08"," 09"};

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Furkan\\Desktop\\" +
                     "AdventofCode\\Advent-of-Code\\src\\adventOfCode2023.adventOfCodeDay04\\advent04Writed"))) {
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


