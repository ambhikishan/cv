import java.util.*;
class library{
    int bookno;
    String name;
    void input(){
        Scanner sc=new Scanner(System.in);
        library lb=new library();
        System.out.println("enter book no.&& name of student");
        lb.bookno= sc.nextInt();
        lb.name= sc.nextLine();

    }
}

public class student extends library{
    String programename;
    void input()
    {Scanner sc=new Scanner(System.in);
        student st=new student();
        System.out.println("Enter programe name=");
        st.programename= sc.nextLine();
    }
    void Show()
    {
        library lb=new library();
        System.out.println(lb.bookno+"    "+lb.name"     ");
        student st=new student():
        System.out.println(st.programename+"    ");
    }
    public static void main(String[] args){
        library lb=new library();
        student st=new student();
        lb.input();
        st.input();
        lb.show();
    }
}