public class MyArrays {
  public static void main(String[] args) {
    int[] arr1 = {1, 2, 3};
    int[] arr2 = returnCopy(arr1);
    System.out.println("Expected: True; Result: " + arrayToString(arr1).equals(arrayToString(arr2)) + "; ");
    System.out.println("Expected: False; Result: " + arr1 == arr2);

    arr1 = {1, 2, 5};
    System.out.println("Expected: False; Result: " + arrayToString(arr1).equals(arrayToString(arr2)) + "; ");
    System.out.println("Expected: False; Result: " + arr1 == arr2);

    arr1 = {};
    arr2 = returnCopy(arr1);
    System.out.println("Expected: False; Result: " + arrayToString(arr1).equals(arrayToString(arr2)) + "; ");
    System.out.println("Expected: False; Result: " + arr1 == arr2);

  }
  public static String arrayToString(int[] nums) {
    String s = "[";
    for (int i = 0; i < nums.length - 1; i++) {
      s = s + nums[i] + ", ";
    }
    if (nums.length > 0) {
      s = s + nums[nums.length-1] + "]";
    } else {
      s += "]";
    }
    return s;
  }
  public static int[] returnCopy(int[]ary) {

  }
  public static int[] concatArray(int[]ary1,int[]ary2) {

  }
}
