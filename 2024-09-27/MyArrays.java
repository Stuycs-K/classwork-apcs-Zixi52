public class MyArrays {
  public static void main(String[] args) {
    int[] arr1 = new int[]{1, 2, 3};
    int[] arr2 = returnCopy(arr1);
    System.out.println("Expected: True; Result: " + arrayToString(arr1).equals(arrayToString(arr2)) + "; ");
    System.out.println("Expected: False; Result: " + (arr1 == arr2));

    arr1 = new int[]{1, 2, 5};
    System.out.println("Expected: False; Result: " + arrayToString(arr1).equals(arrayToString(arr2)) + "; ");
    System.out.println("Expected: False; Result: " + (arr1 == arr2));

    arr1 = new int[0];
    arr2 = returnCopy(arr1);
    System.out.println("Expected: True; Result: " + arrayToString(arr1).equals(arrayToString(arr2)) + "; ");
    System.out.println("Expected: False; Result: " + (arr1 == arr2));

    arr1 = new int[]{-1, -105, 302, 17, 52};
    arr2 = returnCopy(arr1);
    System.out.println("Expected: True; Result: " + arrayToString(arr1).equals(arrayToString(arr2)) + "; ");
    System.out.println("Expected: False; Result: " + (arr1 == arr2));

    System.out.println("/nExpected: {-1, -105, 302, 17, 52, -1, -105, 302, 17, 52}; Result: " + concatArray(arr1, arr2));

    arr1 = new int[0];
    System.out.println("/nExpected: {-1, -105, 302, 17, 52}; Result: " + concatArray(arr1, arr2));

    arr1 = new int[]{12, -5, 3};
    System.out.println("/nExpected: {12, -5, 3, -1, -105, 302, 17, 52}; Result: " + concatArray(arr1, arr2));

    arr2 = new int[0];
    System.out.println("/nExpected: {12, -5, 3}; Result: " + concatArray(arr1, arr2));
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
