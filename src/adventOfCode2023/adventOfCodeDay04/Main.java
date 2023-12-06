package adventOfCode2023.adventOfCodeDay04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        fileWriter.write();
        adventOfCodeDay04Part01();


    }
    public static void adventOfCodeDay04Part01() throws IOException {

        int pointCalculator = 0;

        String path = "C:\\Users\\Furkan\\Desktop\\AdventofCode\\Advent-of-Code\\src\\adventOfCode2023.adventOfCodeDay04\\advent04Writed";
        String line;
        BufferedReader reader = new BufferedReader(new FileReader(path));

        while ((line = reader.readLine()) != null) {
            int matchCounter = 0;
            int matchMultiplier=0;
            line = line.split(":")[1].trim().replace('|', ',').replace(" ", "");
            String[] game = line.split(",");
            for (int i = 0; i < game[0].length(); i += 2) {
                String firsTwoAt0 = game[0].substring(i, i + 2);
                for (int j = 0; j < game[1].length(); j += 2) {
                    String firstTwoAt1 = game[1].substring(j, j + 2);
                    if (firsTwoAt0.equals(firstTwoAt1)) {
                        matchCounter++;
                    }
                }
            }
            if(matchCounter==1){
                pointCalculator+=matchCounter;
            }else{
                matchMultiplier=(int) Math.pow(2,matchCounter-1);
                pointCalculator+=matchMultiplier;
            }
        }
        System.out.println(pointCalculator);

    }

 }















