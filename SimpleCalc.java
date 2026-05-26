 import java.util.Scanner;
 class SimpleCalc {
    public static void main(String[] args) {
      
      Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      char ch=sc.next().charAt(0);
      int n2=sc.nextInt();
      
      
      
      switch(ch)
      {
          case '+': 
              System.out.println("Result= "+(n1+n2)); break;
          case '-': 
              System.out.println("Result= "+(n1-n2)); break;
          case '*': 
              System.out.println("Result= "+(n1*n2)); break;
          case '/': 
              System.out.println("Result= "+(n1/n2)); break;
          default : System.out.println("Invalid");
      }
    
     
    }
}