import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {

  public static void main(String[] args) {
    String text = "This is a sample\nOf how to read\ntext!";

      // creates a Scanner object to read throug the String
      Scanner input = new Scanner(text);
      Scanner sc2 = new Scanner("10.0 1.04 99.0 -3.0 4.2");

      //you don't want a for loop here unless you know the size of the data set

      while(input.hasNext()){
        System.out.println(input.next());
      }

      while(sc2.hasNextDouble()) {
        System.out.println(sc2.next());
      }

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

  }

}
