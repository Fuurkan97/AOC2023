package adventOfCode2023.adventOfCodeDay06;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class AOCPart01 {

    public static void part01() throws IOException {
        String path = "C:\\Users\\Furkan\\Desktop\\AdventofCode\\Advent-of-Code\\src\\adventOfCode2023\\adventOfCodeDay06\\advent";

        BufferedReader reader = new BufferedReader(new FileReader(path));

        String line = Files.readAllLines(Paths.get(path)).get(0);
        line = line.split(":")[1].trim().replaceAll("\\s+"," ");
        String[] oldTime = line.split(" ");

        String line2 = Files.readAllLines(Paths.get(path)).get(1);
        line2 = line2.split(":")[1].trim().replaceAll("\\s+"," ");
        String[] oldDistance = line2.split(" ");

        int size = oldTime.length;
        int[] time = new int[size];
        for (int i = 0; i < size; i++) {
            time[i] = Integer.parseInt(oldTime[i]);
        }
        int size2 = oldDistance.length;
        int[] distance = new int[size2];
        for (int i = 0; i < size2; i++) {
            distance[i] = Integer.parseInt(oldDistance[i]);

        }
        int totalSum = 1;
        int finish=0;
        int time2;
        int destination2;
        int holdTime;

        int[] finishes = new int[time.length];
        for (int i = 0; i < time.length; i++) {
            time2 = time[i];
            destination2 = distance[i];
            for(int k = 1 ; k<time[i];k++){
                holdTime =k;
                if(destination2 <= (holdTime*(time2-holdTime))){
                    finish++;
                }
                finishes[i] = finish;
            }
            finish=0;
        }
        for(int i = 0; i<finishes.length;i++){
            totalSum*=finishes[i];
        }
        System.out.println("Answer for part 1 :" +totalSum);

    }
}




