public class ArrayListPractice {
  public static ArrayList<String>createRandomArray(int size) {
    ArrayList<String>randArr = new ArrayList<String>(size);
    for (int i = 0; i < size; i++) {
      int rand = Math.random() * 11;
      if (rand == 0) {
        randArr[i] = "";
      } else {
        randArr[i] = "" + i;
      }
    }
    return randArr;
  }
}
