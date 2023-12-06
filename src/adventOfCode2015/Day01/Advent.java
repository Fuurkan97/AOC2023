package adventOfCode2015.Day01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Advent {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\Furkan\\Desktop\\AdventofCode\\Advent-of-Code\\src\\adventOfCode2015\\Day01\\advent";

        BufferedReader reader = new BufferedReader(new FileReader(path));

        String line;

        int answer = 0;
        int answer2 = 0;

        while((line=reader.readLine()) !=null){
          int length;
          int width;
          int height;

            String[] advent = line.split("x");
            length = Integer.parseInt(advent[0]);
            width = Integer.parseInt(advent[1]);
            height = Integer.parseInt(advent[2]);
            answer +=(((2*length*width)+ (2*width*height)+ (2*height*length)));
            answer +=Math.min(length * width, Math.min(width* height, height * length));
            answer2 +=2 * (length + width + height - Math.max(Math.max(length, width), height))+(length*width*height);
        }
        System.out.println(answer);
        System.out.println(answer2);
    }
}
