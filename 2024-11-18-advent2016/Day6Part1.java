import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day6Part1 {
    public static void main(String[] args) {
      System.out.println(message());
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

    public static String message() {
      String s = parse("day6Directions.txt");
      String encodedMSG[] = s.split(",");
      String total = "";
      ArrayList<ArrayList<Character>> arrList = new ArrayList<ArrayList<Character>>();
      for (int col = 0; col < encodedMSG[0].length(); col++) {
        arrList.add(new ArrayList<Character>());
        for (int row = 0; row < encodedMSG.length; row++) {
            arrList.get(col).add(encodedMSG[row].charAt(col));
        }
      }
      for (int i = 0; i < arrList.size(); i++) {
        ArrayList<Integer> counter = new ArrayList<Integer>();
        ArrayList<Character> letters = new ArrayList<Character>();
        char largest = 'c';
        int maxCount = 0;
        for (int j = 0; j < arrList.get(i).size(); j++) {
          char c = arrList.get(i).get(j);
          if (!letters.contains(c)) {
            letters.add(c);
            counter.add(1);
          } else {
            int index = letters.indexOf(c);
            counter.set(index, counter.get(index)+1);
          }
        }
        System.out.println(letters.toString());
        System.out.println(counter.toString());
        for (int k = 0; k < counter.size(); k++) {
          if (counter.get(k) > maxCount) {
            maxCount = counter.get(k);
            largest = letters.get(k);
          }
        }
        total += largest;
      }
      return total;
    }
}
