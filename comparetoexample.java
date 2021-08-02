import java.util.*;
public class comparetoexample{
    public static void main(String[] args){
        int n;

        String temp;
        System.out.println("enter no. of names to enter one by one");
        Scanner sc=new Scanner(System.in);
        Scanner s=new Scanner(System.in);
        n=sc.nextInt();
        String string[]=new String[n];
        System.out.println("enter"+n+"number of names");
        for(int i=0;i<n;i++)
            string[i]=s.nextLine();
        int v;
        for(int j=0;j<n;j++)
        for(int i=1;i<n;i++)
        {  v=string[i].compareTo(string[i-1]);
            if(v<0)
            {
                temp=string[i-1];
                string[i-1]=string[i];
                string[i]=temp;
            }
        }
        System.out.println("Sorted names");
        for(int i=0;i<n;i++)
            System.out.println(string[i]);

    }
}