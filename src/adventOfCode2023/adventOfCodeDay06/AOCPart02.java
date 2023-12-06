package adventOfCode2023.adventOfCodeDay06;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class AOCPart02 {

    public static void part02() throws IOException {

        String path = "C:\\Users\\Furkan\\Desktop\\AdventofCode\\Advent-of-Code\\src\\adventOfCode2023\\adventOfCodeDay06\\advent";

        BufferedReader reader = new BufferedReader(new FileReader(path));

        String line = Files.readAllLines(Paths.get(path)).get(0);
        line = line.split(":")[1].trim().replaceAll("\\s+", "");

        String line2 = Files.readAllLines(Paths.get(path)).get(1);
        line2 = line2.split(":")[1].trim().replaceAll("\\s+", "");

        int time = Integer.parseInt(line);
        long distance = Long.parseLong(line2);

        int lastFinish = 0;
        int firstFinish = 0;

        for (int i = time; i > 0; i--) {
            if ((long) (time - i) * i > distance) {
                lastFinish = i;
                break;
            }

        }
        for (int i = 0; i < time; i++) {
            if ((long) (time - i) * i > distance) {
                firstFinish = i;
                break;
            }
        }
            System.out.println("Answer for part 2 : "+ (lastFinish-firstFinish+1));
    }
}





