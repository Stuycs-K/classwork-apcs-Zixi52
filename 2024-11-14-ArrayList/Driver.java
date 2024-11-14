import java.util.ArrayList;

public class Driver {
  public static void main(String[] args) {
    ArrayList<String> newArrList = ArrayListPractice.createRandomArray(10);
    System.out.println(newArrList);
    ArrayListPractice.replaceEmpty(newArrList);
    System.out.println(newArrList);
    newArrList = ArrayListPractice.makeReversedList(newArrList);
    System.out.println(newArrList);
    ArrayList<String> otherArrList = ArrayListPractice.createRandomArray(20);
    System.out.println(otherArrList);
    System.out.println(ArrayListPractice.mixLists(newArrList, otherArrList));
    int count = 10;
    ArrayList<Integer> expectedIndices = new ArrayList<Integer>();
    for (int n = 0; n < 10; n++) {
      expectedIndices = new ArrayList<Integer>();
      newArrList = ArrayListPractice.createRandomArray((int) (Math.random() * 2000000));
      otherArrList = ArrayListPractice.createRandomArray((int) (Math.random() * 2000000));
      for (int i = 0; i < newArrList.size(); i++) {
        if (newArrList.get(i).equals("")) expectedIndices.add(i);
      }
      ArrayListPractice.replaceEmpty(newArrList);
      for (int i : expectedIndices) {
        if (! newArrList.get(i).equals("Empty")) count--;
      }
    }
    System.out.println(count == 10 ? "PASSED" : "FAILED");
  }
}
