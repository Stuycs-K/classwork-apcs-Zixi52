// Partner: Henry Santos Hendricks

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class TriangleTester {
  public static void main(String[] args) {
    System.out.println(countTrianglesA("inputTri.txt"));
    System.out.println(countTrianglesB("inputTri.txt"));
  }

  public static int countTrianglesA(String filename) {
    ArrayList<ArrayList<Integer>> lengths = new ArrayList<ArrayList<Integer>>();
    int total = 0;
    try {
      File file = new File(filename);//1
      Scanner scan = new Scanner(file);
      //CODE THAT SCANS THE FILE.
      int count=0;
      while (scan.hasNextInt()) {
        lengths.add(new ArrayList<Integer>());
        for (int i = 0; i < 3; i++) {
            lengths.get(count).add(scan.nextInt());
        }
        count++;
      }
      for (int i = 0; i < lengths.size(); i++) {
        int a = lengths.get(i).get(0);
        int b = lengths.get(i).get(1);
        int c = lengths.get(i).get(2);
        if ((a < b + c) && (b < a + c) && (c < a + b)) {
          total++;
        }
      }
      scan.close();//releases the file from your program

    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
      return -1; //you can return from a void function just don't put a value.
    }
    return total;

  }

  public static int countTrianglesB(String filename) {
    ArrayList<ArrayList<Integer>> lengths = new ArrayList<ArrayList<Integer>>();
    int total = 0;
    try {
      File file = new File(filename);//1
      Scanner scan = new Scanner(file);
      //CODE THAT SCANS THE FILE.
      int count=0;
      while (scan.hasNextInt()) {
        lengths.add(new ArrayList<Integer>());
        for (int i = 0; i < 3; i++) {
            lengths.get(count).add(scan.nextInt());
        }
        count++;
      }

      for (int col = 0; col < 3; col++) {
        for (int row = 0; row < lengths.size()-2; row += 3) {
            int a = lengths.get(row).get(col);
            int b = lengths.get(row + 1).get(col);
            int c = lengths.get(row + 2).get(col);
            if ((a < b + c) && (b < a + c) && (c < a + b)) {
              total++;
            }
        }
      }
      scan.close();//releases the file from your program

    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
      return -1; //you can return from a void function just don't put a value.
    }
    return total;

  }


}
