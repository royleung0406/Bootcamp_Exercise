import java.util.Arrays;

/**
 * Case 1: [2,7,11,15] Target: 9 Ans: [0, 1] or [1, 0]
 * 
 * Case 2: [3,2,4] Target: 6 Ans: [1, 2] or [2, 1]
 *
 * Case 3: [3, 3] Target: 7 Ans: [-1, -1]
 */
public class JavaQuest12 {
  // Given an array of integers nums and an integer target, return the index of
  // the two numbers such that they add up to target.

  // You may assume that each input would have exactly one solution OR no
  // solution, and you may not use the same element twice.

  // If no solution, return [-1, -1]

  // You can return the answer in any order.

  // Do not change anything in main method
  public static void main(String[] args) {
    int[] answers = twoSum(new int[] { 2, 7, 11, 15 }, 9); // {2, 7, 11, 15} is the dataset, 9 is the target to sum
    int[] answers2 = twoSum(new int[] { 3, 2, 4 }, 6); // {3, 2, 4} is the dataset, 6 is the target to sum
    int[] answers3 = twoSum(new int[] { 3, 3 }, 7); // {3, 3} is the dataset, 7 is the target to sum
    System.out.println(Arrays.toString(answers));
    System.out.println(Arrays.toString(answers2));
    System.out.println(Arrays.toString(answers3));
  }

  // Code a method here to return an array of two numbers that sum up to the
  // target

  public static int [] twoSum (int [] arr, int target) {
    int total = 0, ans1 = 0, ans2 = 0, pos1 =0, pos2 =0;
    for (int i = 0; i < arr.length; i++){
        if (arr[i] < target ){
          ans1 = arr[i];
          pos1 = i;
      for(int j = i +1; j < arr.length-i; j++ ){
      System.out.println("i" + i);
      System.out.println("j"+ j);
      if(arr[i] + arr[j] == target){
          ans2 = arr[j];
          pos2 = j;
          System.out.println(ans1);
          System.out.println(ans2);
         // break;
         return new int[]{i,j};
        }else if(arr[i] + arr[j] != target){
          pos1 = -1;
          pos2 = -1;
        }

      } 
    } 
    }return new int [] {pos1 , pos2};
  } 
}

