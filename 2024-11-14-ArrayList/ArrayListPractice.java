import java.util.ArrayList;

public class ArrayListPractice {
  public static ArrayList<String>createRandomArray(int size) {
    ArrayList<String>randArr = new ArrayList<String>(size);
    for (int i = 0; i < size; i++) {
      int rand = (int) (Math.random() * 11);
      if (rand == 0) {
        randArr.add("");
      } else {
        randArr.add("" + rand);
      }
    }
    return randArr;
  }

  public static void replaceEmpty(ArrayList<String> original) {
    for (int i = 0; i < original.size(); i++) {
      if (original.get(i).equals("")) {
        original.set(i, "Empty");
      }
    }
  }
}
