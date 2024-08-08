package questions;

public class JavaQuest5 {
  /**
   * Expected output:
   * The index of the last character of c is 11
   */
  public static void main(String[] args) {
    String str = "coding bootcamp."; // You should not change this line
    char target = 'c'; // Update this target to test the logic

    // if not found, print "Not Found."
    // code here ...
    Boolean NotFound = true;
    int pos = 0;
   for(int i = str.length()-1;i > -1; i-- ){
      if (str.charAt(i) == target) {
        NotFound = false;
        pos = i;
      break;}
      }
      if (NotFound){
        System.out.println("Not Found");
      }else {
          System.out.println("The index of the last character of " +  target + " is " + pos);
        }
      }
 }
   