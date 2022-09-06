import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter a number");
    int x = scanner.nextInt();
    
    System.out.println("Enter dism. number");
    double d = scanner.nextDouble();
    
    System.out.println("Enter a text");
    String s = scanner.next();
    
    System.out.println("You have entered: "+ x );
    System.out.println("Entered: "+ d);
    System.out.println("Entered: "+ s);
  }
}