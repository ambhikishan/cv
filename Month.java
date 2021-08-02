
import java.util.Scanner;
public class Month {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter month number:::");
        int d=in.nextInt();
        switch(d) {
            case 1:
            {System.out.println("January"); break;}
            case 2:
            {System.out.println("February"); break;}
            case 3:
            {   System.out.println("March"); break;}
        }

    }
}
