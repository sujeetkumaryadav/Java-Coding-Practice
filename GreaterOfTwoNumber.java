 import java.util.Scanner;
 class GreaterOfTwoNumber {
    public static void main(String[] args) {
      
      Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
       int n2=sc.nextInt();
      if(n1>n2)
      System.out.println(n1+" is Greater");
      else if(n2>n1)
      System.out.println(n2+" is Greater");
      else
      System.out.println("Both are Equal");
    }
}