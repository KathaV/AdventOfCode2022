package puzzles;

import java.io.*;

/***
 * class for running puzzle code given input file location
 */
public class RunCode {
    private static String inputPath = "src/res/Day1.txt";
    private static IDay puzzle;

    public static void main(String[] args) throws FileNotFoundException, IOException{
        BufferedReader br = feedInput(inputPath);
        puzzle = new Day1(br);
        puzzle.solve();
        System.out.println();
    }

    public static BufferedReader feedInput(String filepath) throws FileNotFoundException{ 
        File input = new File(filepath);
        BufferedReader br = new BufferedReader(new FileReader(input));
        return br;
    }
}
