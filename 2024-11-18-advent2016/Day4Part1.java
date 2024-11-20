import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Day4Part1 {
    public static void main(String[] args) {
    System.out.println(sumID());
    }

    public static String parse(String filename) {
    try {
      File file = new File(filename);
      Scanner scan = new Scanner(file);
      String s = "";
      while (scan.hasNextLine()) {
        s = s + scan.nextLine() + ",";
      }
      return s;
    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
      return "nope";
    }
  }

  public static int sumID() {
    String s = parse("day4Directions.txt");
    String[] instructions = s.split(",");
    int sum = 0;

    for (int i = 0; i < instructions.length; i++) {
        int sectorID = Integer.parseInt(instructions[i].substring(instructions[i].lastIndexOf('-') + 1, instructions[i].indexOf('[')));
        String checksum = instructions[i].substring(instructions[i].indexOf('[') + 1, instructions[i].indexOf(']'));

        ArrayList<Integer> count = new ArrayList<>();
        ArrayList<Character> characters = new ArrayList<>();
        for (int j = 0; j < instructions[i].substring(0, instructions[i].lastIndexOf('-')).length(); j++) {
            char c = instructions[i].charAt(j);
            if (c == '-') continue;
            if (!characters.contains(c)) {
                characters.add(c);
                count.add(1);
            } else {
                int index = characters.indexOf(c);
                count.set(index, count.get(index) + 1);
            }
        }

        ArrayList<Character> max = new ArrayList<>();
        for (int k = 0; k < 5; k++) {
            int maxFreq = -1;
            char maxChar = 'z' + 1; // Start with a value outside valid range
            int maxIndex = -1;

            for (int m = 0; m < characters.size(); m++) {
                int freq = count.get(m);
                char c = characters.get(m);
                if (freq > maxFreq || (freq == maxFreq && c < maxChar)) {
                    maxFreq = freq;
                    maxChar = c;
                    maxIndex = m;
                }
            }

            if (maxIndex != -1) {
                max.add(maxChar);
                count.set(maxIndex, -1); // Mark as processed by setting frequency to -1
            }
        }

        String calculatedChecksum = "";
        for (int l = 0; l < 5 && l < max.size(); l++) {
            calculatedChecksum += max.get(l);
        }

        // Validate checksum and update sum if real room
        if (calculatedChecksum.equals(checksum)) {
            sum += sectorID;
        }
    }

    return sum;
}

}
