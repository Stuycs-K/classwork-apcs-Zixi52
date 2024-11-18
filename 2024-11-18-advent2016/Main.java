import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {

  public static void main(String[] args) {
    System.out.println(distanceBlocks("directions.txt"));
  }

  public static int distanceBlocks(String filename) {
    int total = 0;
    try {
      File file = new File(filename);//1
      Scanner scan = new Scanner(file);
      //CODE THAT SCANS THE FILE.
      String dir = "N";
      boolean changeDir = false;
      int countX=0;
      int countY=0;
      String s = scan.next();
      while (scan.hasNext()) {
          if (s.charAt(0) == 'L') {
            if (dir.equals("N")) {
              countX += Integer.valueOf(s.substring(1,2));
              dir = "W";
            } else if (dir.equals("W")) {

            }

          } else if (s.charAt(0) == 'R') {
            countX += Integer.valueOf(s.substring(1,2));
          } else if (s.charAt(0) == 'S') {
            countY -= Integer.valueOf(s.substring(1,2));
          } else {
            countY += Integer.valueOf(s.substring(1,2));
          }
        }
      total = countX + countY;
      scan.close();//releases the file from your program

    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
      return -1; //you can return from a void function just don't put a value.
    }
    return total;

  }

}
