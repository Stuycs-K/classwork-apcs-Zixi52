import java.util.ArrayList;

public class Driver {
  public static void main(String[] args) {
    ArrayList<String> newArrList = ArrayListPractice.createRandomArray(10);
    ArrayList<String> otherArrList = ArrayListPractice.createRandomArray(20);
    System.out.println(newArrList);
    ArrayListPractice.replaceEmpty(newArrList);
    System.out.println(newArrList);
    newArrList = ArrayListPractice.makeReversedList(newArrList);
    System.out.println(newArrList);
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

    count = 0;
    for (int n = 0; n < 10; n++) {
      newArrList = ArrayListPractice.createRandomArray((int) (Math.random() * 2000000));
      otherArrList = ArrayListPractice.makeReversedList(newArrList);
      for (int i = 0; i < newArrList.size(); i++) {
        if (! newArrList.get(i).equals(otherArrList.get(otherArrList.size()-i-1))) count++;
      }
    }
    System.out.println(count == 0 ? "PASSED" : "FAILED");

    count = 0;
    for (int n = 0; n < 10; n++) {
      newArrList = ArrayListPractice.createRandomArray((int) (Math.random() * 2000000));
      otherArrList = ArrayListPractice.createRandomArray((int) (Math.random() * 2000000));
      ArrayList<String> mixedList = ArrayListPractice.mixLists(newArrList, otherArrList);
      for (int i = 0; i < Math.min(newArrList.size(),otherArrList.size()); i++) {
        if (i % 2 == 0) {
          if (! mixedList.get(2*i).equals(newArrList.get(i))) {
            count++;
          }
        } else {
          if (! mixedList.get(2*i+1).equals(otherArrList.get(i))) {
            count++;
          }
        } 
      }
      if (newArrList.size() < otherArrList.size()) {
        for (int i = newArrList.size(); i < otherArrList.size(); i++) {
          if (! mixedList.get(i+newArrList.size()).equals(otherArrList.get(i))) count++;
        }
      } else if (otherArrList.size() < newArrList.size()) {
        for (int i = otherArrList.size(); i < newArrList.size(); i++) {
          if (! mixedList.get(i+otherArrList.size()).equals(newArrList.get(i))) count++;
        }
      }
    }
    System.out.println(count == 0 ? "PASSED" : "FAILED");
  }
}
