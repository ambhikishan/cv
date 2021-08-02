import java.io.*;

public class fwriter{
    public static void main (String[] args){
       try
       { BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("number of students data to enter");
       int n=Integer.parseInt(br.readLine());
        System.out.println("Enter roll no. & name");
        int roll;
        String name;
        FileWriter fw=new FileWriter("d.txt");
        for(int i=0; i<n;i++)
        {
            System.out.println("Enter Roll");
            roll=Integer.parseInt(br.readLine());
            System.out.println("Enter Name");
            name=br.readLine();
            fw.write(Integer.toString(roll));
            fw.write("       ");
            fw.write(name);
            fw.write("\n");
        }
        br.close();
        fw.close();


    }catch (IOException e){}


    }
}