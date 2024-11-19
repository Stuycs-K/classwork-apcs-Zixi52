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
      int countX = 0;
      int countY = 0;
      // Initial direction (0: North, 1: East, 2: South, 3: West)
      int direction = 0;
      String s = scan.nextLine();

      String[] instructions = s.split(",\\s*");

      for (int i = 0; i < instructions.length; i++) {
        char turn = instructions[i].charAt(0);
        int blocks = Integer.parseInt(instructions[i].substring(1));

        // Update direction based on the turn
        if (turn == 'L') {
            direction = (direction + 3) % 4; // Turn left
        } else if (turn == 'R') {
            direction = (direction + 1) % 4; // Turn right
        }

        System.out.println("Instruction: " + instructions[i]);
        System.out.println("Current Position: (" + countX + ", " + countY + ")");
        System.out.println("Direction: " + direction);

        if (direction == 0) {
          countY += blocks;
        } else if (direction == 1) {
          countX += blocks;
        } else if (direction == 2) {
          countY -= blocks;
        } else {
          countX -= blocks;
        }
      }
 
      total = Math.abs(countX) + Math.abs(countY);
      scan.close();//releases the file from your program

    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
      return -1;
    }
    return total;

  }

}
