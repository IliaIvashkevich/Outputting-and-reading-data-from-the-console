import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Введи число");
    int x = scanner.nextInt();
    
    System.out.println("Введи дробное число");
    double d = scanner.nextDouble();
    
    System.out.println("Введи любой текст");
    String s = scanner.next();
    
    System.out.println("Вы ввели число: "+ x );
    System.out.println("Ввел: "+ d);
    System.out.println("Ввел: "+ s);
  }
}