public class Coins
{
  public static void main(String[] args){
  Scanner scanner = new Scanner(System.in);//creates a scanner object

  System.out.print("Enter the number of pennies");//prompt the user
  in pennies = scanner.nextInt();// Read the user input

  coinConverter(pennies);//call the method with user input

  scanner.close();//Close the scanner
  }
  
    public static void coinConverter(int pennies){
    //constants for the values of each coin
    final int PENNIES_IN_DOLLAR = 100;
    final int PENNIES_IN_DOLLAR = 25;
    final int PENNIES_IN_DOLLAR = 10;
    final int PENNIES_IN_DOLLAR = 5;

    //calculate the number of dollar bills
    int dollars = pennies / PENNIES_IN_DOLLAR;
    pennies %/ PENNIES_IN_DOLLAR; //remaining pennies

    



  }

  

}
