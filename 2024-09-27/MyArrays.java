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

    System.out.println("\nExpected: {-1, -105, 302, 17, 52, -1, -105, 302, 17, 52}; Result: " + arrayToString(concatArray(arr1, arr2)));

    arr1 = new int[0];
    System.out.println("Expected: {-1, -105, 302, 17, 52}; Result: " + arrayToString(concatArray(arr1, arr2)));

    arr1 = new int[]{12, -5, 3};
    System.out.println("Expected: {12, -5, 3, -1, -105, 302, 17, 52}; Result: " + arrayToString(concatArray(arr1, arr2)));

    arr2 = new int[0];
    System.out.println("Expected: {12, -5, 3}; Result: " + arrayToString(concatArray(arr1, arr2)));
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
    int[] ary2 = new int[ary.length];
    for (int i = 0; i < ary.length; i++) {
      ary2[i] = ary[i];
    }
    return ary2;
  }

  public static int[] concatArray(int[]ary1,int[]ary2) {
    int[] sumAry = new int[ary1.length + ary2.length];
    int i;
    for (i = 0; i < ary1.length; i++) {
      sumAry[i] = ary1[i];
    }
    for (i = 0; i < ary2.length; i++) {
      sumAry[i+ary1.length] = ary2[i];
    }
    return sumAry;
  }
}
