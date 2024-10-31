import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class TriangleTester {

  public static void main(Strings[] args) {

  }

  public static int countTrianglesA(String filename) {
    int[][] lengths = new int[][]();

    try {
      File file = new File("triangleSides");//1
      Scanner scan = new Scanner(file);
      //CODE THAT SCANS THE FILE.
      int count=0;
      while (scan.hasNextLine()) {
        for (int i = 0; i < 3; i++) {
          lengths[count] += scan.nextInt();
        }
        count++;
      }
      for (int i = 0; i < lengths.length; i++) {
        if (lengths[i][])
      }
      scan.close();//releases the file from your program

    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
      return -1; //you can return from a void function just don't put a value.
    }


  }


}
