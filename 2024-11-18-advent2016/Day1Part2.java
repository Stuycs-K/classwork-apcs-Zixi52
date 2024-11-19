import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Day1Part2 {

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
      ArrayList<ArrayList<Integer>> arrList = new ArrayList<ArrayList<Integer>>();
      ArrayList<Integer> initial = new ArrayList<Integer>();
      initial.add(0);
      initial.add(0);
      arrList.add(initial);

      for (int i = 0; i < instructions.length; i++) {
        char turn = instructions[i].charAt(0);
        int blocks = Integer.parseInt(instructions[i].substring(1));

        // Update direction based on the turn
        if (turn == 'L') {
            direction = (direction + 3) % 4; // Turn left
        } else if (turn == 'R') {
            direction = (direction + 1) % 4; // Turn right
        }

        for (int j = 0; j < blocks; j++) {
            if (direction == 0) {
                countY++; // Move North
            } else if (direction == 1) {
                countX++; // Move East
            } else if (direction == 2) {
                countY--; // Move South
            } else if (direction == 3) {
                countX--; // Move West
            }
            ArrayList<Integer> current = new ArrayList<Integer>();
            current.add(countX);
            current.add(countY);
            arrList.add(current);

            for (int k = 0; k < arrList.size()-1; k++) {
                if (arrList.get(k).equals(current)) {
                    return Math.abs(countX) + Math.abs(countY);
                }
            }
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
