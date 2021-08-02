import java.util.*;
class car
{
  int engineno;
  String car_type;
  car(int a,String b)
  {
    engineno=a;
    car_type=b;
  }
}
class alto extends car
{
  String color;
   alto()
   {
    super(123,"Hatchback");
    color="Silver";
    }
   void display()
   {
     System.out.println("The Car Details of Alto are as follows:");  
    System.out.println("Car Name - Alto");
    System.out.println("Engine Number - "+engineno);
    System.out.println("Car Type - "+car_type);
   System.out.println("Color - "+color);
   }
 }
public class A
{
  public static void main( String args[]) 
{  
     
    alto n= new alto();
    n.display();
}
}