import java.util.*;

class JException extends Exception{
    String s;
    JException(String str){
        s=str;

    }
    public String check(){
        return ("Exception "+s);
    }
}
class JavaException{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of students");
        int n=sc.nextInt();
        String s[]=new String[n];
        String course[]=new String[n];
        int i=0;
        while(i<n){
        try{ throw new JException("JAVA");


                s[i]=sc.nextLine();
                course[i]=sc.nextLine();

        }catch (JException j){
            System.out.println(j);
        }
    }
}
}