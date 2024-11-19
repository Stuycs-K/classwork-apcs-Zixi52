import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Day2Part1 {

  public static void main(String[] args) {
    System.out.println(keypad());
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

  public static int keypad() {
    String s = parse("day2Directions.txt");
    String[] instructions = s.split(",");
    int num = 5;
    ArrayList<Integer> arrList = new ArrayList<Integer>();
    for (int i = 0; i < instructions.length; i++) {
      for (int j = 0; j < instructions[i].length; j++) {
        if (instructions[i].get(j).equals("U")) {
          num =
        }
      }
    }
  }
}
