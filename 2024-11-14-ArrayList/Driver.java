import java.util.ArrayList;

public class Driver {
  public static void main(String[] args) {
    ArrayList<String> newArrList = ArrayListPractice.createRandomArray(10);
    System.out.println(newArrList);
    ArrayListPractice.replaceEmpty(newArrList);
    System.out.println(newArrList);
  }
}
