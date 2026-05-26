 import java.util.Scanner;
 class TempCategory {
    public static void main(String[] args) {
      
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
    
      if(n<10)
      System.out.println("Very Cold");
      else if(n>=10 && n<25)
      System.out.println("Moderate");
      else
      System.out.println("Hot");
    }
}