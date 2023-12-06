package adventOfCode2023.adventOfCodeDay02;

import java.io.*;

import java.util.Scanner;


public class Main {
    static int blue = 14;
    static int green = 13;
    static int red = 12;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int number2 = 1;
        int total1 = 0;
        int total2 = 0;
        String filePath = "C:\\Users\\Furkan\\Desktop\\AdventofCode\\Advent-of-Code\\src\\adventOfCode2023.adventOfCodeDay02\\advent02";

        try (Scanner sc = new Scanner(new FileReader(filePath))) {
            while(sc.hasNext()) {
                String line = sc.nextLine();
                if(isWorks(line))
                    total1 += number2;
                    total2+= isWorks2(line);
                    number2++;
            }
        }
        System.out.println("Answer for adventOfCode part1 : " +total1);
        System.out.println("Answer for adventOfCode part12 : " +total2);
    }


    public static boolean isWorks(String line) {
        line = line.split(":")[1].trim().replace(';', ',');
        String[] game = line.split(",");


        for (String game2 : game) {
            sc = new Scanner(game2);

            if (game2.contains("red")) {
                int number = sc.nextInt();
                if (number > red) {
                    return false;
                }

            } else if (game2.contains("green")) {
                int number = sc.nextInt();
                if (number > green){
                    return false;
                }

            } else if (game2.contains("blue")) {
                int number = sc.nextInt();
                if (number > blue) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int isWorks2(String line){
        line = line.split(":")[1].trim().replace(';', ',');
        String[] game = line.split(",");

        int maxRed = 0;
        int maxGreen = 0;
        int maxBlue = 0;
        for (String game2 : game) {
            sc = new Scanner(game2);

            if (game2.contains("red")) {
                int number = sc.nextInt();
                if (number > maxRed)
                    maxRed= number;
            } else  if (game2.contains("green")) {
                int number = sc.nextInt();
                if (number > maxGreen)
                    maxGreen= number;

            } else  if (game2.contains("blue")) {
                int number = sc.nextInt();
                if (number > maxBlue)
                    maxBlue = number;
            }
        }
      return maxRed * maxGreen * maxBlue;
    }


}





























