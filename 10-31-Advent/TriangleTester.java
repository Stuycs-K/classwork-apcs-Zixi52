import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class TriangleTester {
  public static int countTrianglesA(String filename) {
    int[][] lengths = new int[][]();

    try {
      File file = new File("TriangleTester.java");//1
      Scanner inPUT = new Scanner(file);
      //CODE THAT SCANS THE FILE.
      while (inPUT.hasNextLine()) {
        String line = inPUT.nextLine();
        if (line.indexOf("{") != -1) {
          System.out.println(line);
        }
      }

      input.close();//releases the file from your program

    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
      return; //you can return from a void function just don't put a value.
    }

    int count=0;
    while (scan.hasNextLine()) {
      for (int i = 0; i < 3; i++) {
        lengths[count] += scan.nextInt();
      }
      count++;
    }
  }


}
