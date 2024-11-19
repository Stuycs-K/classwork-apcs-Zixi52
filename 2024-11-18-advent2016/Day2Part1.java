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
    String total = "";
    for (int i = 0; i < instructions.length; i++) {
      for (int j = 0; j < instructions[i].length(); j++) {
        if (instructions[i].charAt(j) == 'U') {
          if (num <= 3) {
            num = num;
          } else {
            num -= 3;
          }
        }
        if (instructions[i].charAt(j) == 'D') {
          if (num >= 7) {
            num = num;
          } else {
            num += 3;
          }
        }
        if (instructions[i].charAt(j) == 'L') {
          if (num % 3 == 1) {
            num = num;
          } else {
            num -= 1;
          }
        }
        if (instructions[i].charAt(j) == 'R') {
          if (num % 3 == 0) {
            num = num;
          } else {
            num += 1;
          }
        }
      }
      arrList.add(num);
    }
    for (int i = 0; i < arrList.size(); i++) {
      total += arrList.get(i);
    }
    return Integer.valueOf(total);
  }
}
