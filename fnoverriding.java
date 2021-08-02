import java.util.*;
public class fnoverriding{
    int sum(int a,int b,int c)
    {

        int s=a+b+c;
        return(s);

    }
    int sum(int a,int b)
    {

        int s=a+b;
        return(s);

    }
    void sum(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 3 no.s");
        int a= sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int s=a+b+c;
        System.out.println("sum="+s);
    }
    public static void main(String[] args){
        fnoverriding fn=new fnoverriding();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 3 no.s");
        int g=sc.nextInt();
        int h=sc.nextInt();
        int i=sc.nextInt();
        System.out.println("sum="+fn.sum(g,h,i));
        System.out.println("enter 2 no.s");
        int d=sc.nextInt();
        int e=sc.nextInt();

        System.out.println("sum="+fn.sum(d,e));

        fn.sum();







    }
}