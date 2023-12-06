package adventOfCode2023.adventOfCodeDay01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class adventOfCodeDay01 {
    public static void adventOfCodePart01() throws IOException {

        String filePath = "C:\\Users\\Furkan\\Desktop\\AdventofCode\\Advent-of-Code\\src\\adventOfCode2023.adventOfCodeDay01\\advent01";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int totalSum = 0;

            while ((line = reader.readLine()) != null) {
                int firstDigit = -1;
                int lastDigit = -1;

                for (int i = 0; i < line.length(); i++) {
                    if (Character.isDigit(line.charAt(i))) {
                        firstDigit = Character.getNumericValue(line.charAt(i));
                        break;
                    }
                }
                for (int j = line.length() - 1; j >= 0; j--) {
                    if (Character.isDigit(line.charAt(j))) {
                        lastDigit = Character.getNumericValue(line.charAt(j));
                        break;
                    }
                }
                if (firstDigit != -1 && lastDigit != -1) {
                    String holder = firstDigit + "" + lastDigit;
                    int number = Integer.parseInt(holder);
                    totalSum += number;
                }
            }
            System.out.println("Total sum for adventOfCode2023.adventOfCodeDay01 Part1 Challange : " +totalSum);
        }
    }
}
