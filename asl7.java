import java.util.*;
public class asl7
{ int x,y;
int result;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two no.s ");
        int s=sc.nextInt();
        int d=sc.nextInt();
        add a=new add(s,d);
        minus m=new minus(s,d);
        multiply m1=new multiply(s,d);
        divide di=new divide(s,d);
        modulus m2=new modulus(s,d);
        System.out.println("Enter operation in symbol");
        char t=sc.next().charAt(0);


        switch (t){
            case '+': System.out.println(a.result); break;
            case '-': System.out.println(m.result);break;
            case '/': System.out.println(di.result);break;
            case '*': System.out.println(m1.result);break;
            case '%': System.out.println(m2.result);break;
        }

    }
}
class add extends asl7
{
    add(int a, int b)
    { x=a;
        y=b;

        result=x+y;

    }

}
class minus extends asl7{
    minus(int a,int b){
        x=a;
        y=b;

        result=x-y;

    }
}
class multiply extends asl7{
    multiply(int a,int b)
    {
        x=a;
        y=b;
        result=x*y;
    }
}
class divide extends asl7
{
    divide(int a,int b){
        x=a;
        y=b;
        result=x/y;
    }
}
class modulus extends asl7{
    modulus(int a, int b){
        x=a;
        y=b;
        result=x%y;
    }
}