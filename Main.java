/**
 * finds factors of a number with methods
 * @jacoe0850 
 */
public class Main {
// this line creates a procedure method with the method name factors and the paramater is whatever number they input
  public static void factors(int num){
    // for loop because i know that it will loop 30 times and it finds all factors of 30
  for(int i = 1; i < num; i++){
    if(num % i == 0){
      System.out.println(i);
    }
  }
  }
  public static void main(String[] args) {
factors(10000000);
  }
}
