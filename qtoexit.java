import java.util.*;
public class qtoexit{
    int q;

    public static void main(String[] ar){
        int q,c=0,avg=0,p=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Start entering nos");
        for(;;){
            q=sc.nextInt();
            char d=(char)q;
            if(d=='q'||d=='Q')
            {break;}
            else{

                p=p*q;
                c=c+q;
                avg++;
            }


        }
        System.out.println("Avg="+c/avg);
        System.out.println("Product="+p);
        
    }
}