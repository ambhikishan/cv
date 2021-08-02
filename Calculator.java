import java.util.Scanner;
public class Calculator{
public static void main(String[] ar){
Scanner sc=new Scanner(System.in);
System.out.println("enter first no.");
int a=sc.nextInt();
System.out.println("enter second no.");
int b=sc.nextInt();
System.out.println("Enter Operator(+ - * / or %)");
char operator=sc.next().charAt(0);
float result=0;
switch(operator)
{ case '+':{result=a+b;
           break;}
  case '-':{result=a-b;
           break;}
  case '*':{result=a*b;
           break;}
  case '/':{result=a/b;
           break;}
  case '%':{result=a%b;
           break;}
}
System.out.print(a+" "+operator+" "+b+"="+result);
}
}