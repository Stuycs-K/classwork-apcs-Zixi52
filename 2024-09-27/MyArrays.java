public class MyArrays {
  public static void main(String[] args) {
    
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
}
