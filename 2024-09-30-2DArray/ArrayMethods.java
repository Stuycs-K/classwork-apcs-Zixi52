//1. Jeff Ou, jou60@stuy.edu
//   Zixi Qiao, zqiao60@stuy.edu

public static void main(String[] args) {
  int[][] ary = new int[][]{{1, 2, 3}, {5, 6, 7}, {8, 9, 10}};
  System.out.println("Expected: [[1, 2, 3], [5, 6, 7], [8, 9, 10]]; Result: "  + arrToString(ary));

  ary = new int[][]{{1, -2}, {5, 6, 7, 9, 1023024}, {}};
  System.out.println("Expected: [[1, -2], [5, 6, 7, 9, 1023024], []]; Result: "  + arrToString(ary));

  ary = new int[][]{{}, {}, {}};
  System.out.println("Expected: [[], [], []]; Result: "  + arrToString(ary));


  ary = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9, 10}};
  System.out.println("Expected: 55; Result: "  + arr2DSum(ary));

  ary = new int[][]{{}, {}, {}};
  System.out.println("Expected: 0; Result: "  + arr2DSum(ary));

  ary = new int[][]{{2}, {5}, {-1}};
  System.out.println("Expected: 6; Result: "  + arr2DSum(ary));


  ary = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
  System.out.println("Expected: [[1, 4, 7], [2, 5, 8], [3, 6, 9]]; Result: "  + swapRC(ary));

  ary = new int[][]{{-2, 3}, {1, 5}, {-2, 3}};
  System.out.println("Expected: [[-2, 1, -2], [3, 5, 3]]; Result: "  + swapRC(ary));

}
//2. Copy your arrToString method from before.
/**Return a String that represets the array in the format:
* "[2, 3, 4, 9]"
* Note the comma+space between values, and between values
*/

public static String arrToString(int[]ary){
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

//3. Write arrToString, with a 2D array parameter.
//Note: Different parameters are allowed with the same function name.
/**Return a String that represets the 2D array in the format:
  * "[[2, 3, 4], [5, 6, 7], [2, 4, 9]]"
  * Note the comma+space between values, and between arrays
  * You are encouraged to notice that you may want to re-use
  * previous code, but you should NOT duplicate that code. (Don't copy/paste or retype it)
  */
public static String arrToString(int[][]ary){
  //this should use arrToString(int[])
  String s = "[";
  for (int i = 0; i < ary.length; i++) {
    if (i = ary.length - 1) {
      s += arrToString(ary[i]);
    } else {
      s = arrToString(ary[i]) + ", ";
    }
  }
  return s + "]";
}

/*Return the sum of all of the values in the 2D array */
public static int arr2DSum(int[][]nums){
  //use a nested loop to solve this
  return 1;
}

/**Rotate an array by returning a new array with the rows and columns swapped.
  * You may assume the array is rectangular and neither rows nor cols is 0.
  * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  */
public static int[][] swapRC(int[][]nums){
  return new int[1][1];
}
