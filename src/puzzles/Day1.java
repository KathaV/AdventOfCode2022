package puzzles;

import java.io.*;

public class Day1 implements IDay{
    private BufferedReader br;

    public Day1(BufferedReader br){
        this.br = br;
    }
    
    public String solve() throws IOException{
        String line;
        Integer calories;
        Integer maxCal=0;
        while ((line = br.readLine()) != null){
            calories = Integer.parseInt(line);
            if (calories > maxCal){
                maxCal = calories;
            }
        }
        return Integer.toString(maxCal);
    }
}