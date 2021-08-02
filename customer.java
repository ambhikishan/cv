import java.util.*;

interface bank{
     void home_inter();
     void car_inter();
}
interface LIC
{
   void policy_inter();
}

public class customer implements LIC,bank
{   public void home_inter(){
    System.out.println("Home Inter");
}


    public void car_inter() {
        System.out.println("Car Inter");
    }


    public void policy_inter() {
        System.out.println("Policy Inter");
    }

    public static void main(String[] args){
                customer c=new customer();
                c.car_inter();
                c.home_inter();
                c.policy_inter();
    }
}