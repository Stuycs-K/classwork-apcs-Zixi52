//1. Jeff Ou, jou60@stuy.edu
//   Zixi Qiao, zqiao60@stuy.edu
public class ArrayMethods {
  public static void main(String[] args) {

    //arrToString test cases

    int[][] ary = new int[][]{{1, 2, 3}, {5, 6, 7}, {8, 9, 10}};
    System.out.println("Expected: [[1, 2, 3], [5, 6, 7], [8, 9, 10]]; Result: "  + arrToString(ary));

    ary = new int[][]{{1, -2}, {5, 6, 7, 9, 1023024}, {}};
    System.out.println("Expected: [[1, -2], [5, 6, 7, 9, 1023024], []]; Result: "  + arrToString(ary));

    ary = new int[][]{{}, {}, {}};
    System.out.println("Expected: [[], [], []]; Result: "  + arrToString(ary));

    //arr2DSum test cases

    ary = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9, 10}};
    System.out.println("Expected: 55; Result: "  + arr2DSum(ary));

    ary = new int[][]{{}, {}, {}};
    System.out.println("Expected: 0; Result: "  + arr2DSum(ary));

    ary = new int[][]{{2}, {5}, {-1}};
    System.out.println("Expected: 6; Result: "  + arr2DSum(ary));

    //swapRC test cases

    ary = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    System.out.println("Expected: [[1, 4, 7], [2, 5, 8], [3, 6, 9]]; Result: "  + arrToString(swapRC(ary)));

    ary = new int[][]{{-2, 3}, {1, 5}, {-2, 3}};
    System.out.println("Expected: [[-2, 1, -2], [3, 5, 3]]; Result: "  + arrToString(swapRC(ary)));

    //replaceNegative test cases

    ary = new int[][]{{1, -2, 3}, {-4, 5, -6}, {7, -8, -9}};
    System.out.println("Original: " + arrToString(ary) +"; Result: ");
    replaceNegative(ary);
    System.out.print(arrToString(ary));
  
    ary = new int[][]{{}, {-4, 5}, {7, -8, -9}};
    System.out.println("Original: " + arrToString(ary) +"; Result: ");
    replaceNegative(ary);
    System.out.print(arrToString(ary));
  }
  //2. Copy your arrToString method from before.
  /**Return a String that represets the array in the format:
    * "[2, 3, 4, 9]"
    * Note the comma+space between values, and between values
  */

  public static String arrToString(int[]nums){
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
      if (i == ary.length - 1) {
        s += arrToString(ary[i]);
      } else {
        s += arrToString(ary[i]) + ", ";
      }
    }
    return s + "]";
  }

  /*Return the sum of all of the values in the 2D array */
  public static int arr2DSum(int[][]nums){
    //use a nested loop to solve this
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums[i].length; j++) {
        sum += nums[i][j];
      }
    }
    return sum;
  }

  /**Rotate an array by returning a new array with the rows and columns swapped.
    * You may assume the array is rectangular and neither rows nor cols is 0.
    * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
    */
  public static int[][] swapRC(int[][]nums){
    int[][] newNums = new int[nums[0].length][nums.length];
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums[0].length; j++) {
        newNums[j][i] = nums[i][j];
      }
    }
    return newNums;
  }

  //3. Modify a given 2D array of integer as follows:
  //Replace all the negative values:
  //-When the row number is the same as the column number replace
  //that negative with the value 1
  //-All other negatives replace with 0
  public static void replaceNegative(int[][] vals){
    for (int i = 0; i < vals.length; i++){
      for (int x = 0; x < vals[i].length; x++){
        if (i == x && vals[i][x] < 0){
          vals[i][x] = 1;
        }
        else if (vals[i][x] < 0){
          vals[i][x] = 0;
        }
      }
    }
  }

  //4. Make a copy of the given 2d array.
  //When testing : make sure that changing the original does NOT change the copy.
  //DO NOT use any built in methods that "copy" an array.
  //You SHOULD write a helper method for this.
  //If you don't see a good way to do that, you should stop and look at prior methods.
  public static int[][] copy(int[][] nums){
    return null;//placeholder so it compiles
  }

}