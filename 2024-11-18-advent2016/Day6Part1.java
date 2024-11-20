import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
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

    public static String message() {
      String s = parse("day6Directions.txt");
      String encodedMSG[] = s.split(",");
      ArrayList<String> arrList = new ArrayList<String>();
      for (int i = 0; i < encodedMSG.length; i++) {
        ArrayList<Integer> counter  = new ArrayList<Integer>();
        ArrayList<String> letters = new ArrayList<String>();
        char largest = '';
        for (int j = 0; j < encodedMSG[i].length(); j++) {
          char c = encodedMSG[i].charAt(j);
          if (!letters.contains(c)) {
            letters.add(c);
            counter.add(c);
          } else {
            int index = letters.indexOf(c);
            counter.set(index, counter.get(index));
          }
        }
        for (int k = 0; k < counter.size()-1; k++) {
          if (counter.get(k) > counter.get(k+1)) {
            largest = letters.get(k);
          }
        }
      }
    }
  }
