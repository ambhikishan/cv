import java.util.Scanner;
public class primenumbers{
    public static void main(String args[]){
        System.out.println("Enter no.");
        int i,j,n,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        { c=0;
            for(j=1;j<=i;j++)
            {if(i%j==0)
                    c++;}
        if(c==2)
            System.out.print(i+"    ");
        }
    }
}