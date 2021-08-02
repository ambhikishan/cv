import java.io.*;
public class br_reader{
    public static void main(String [] args){
        try {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter name and roll no.");
            int roll=Integer.parseInt(br.readLine());
            String name=br.readLine();
            FileWriter fw=new FileWriter("dit.txt");
            fw.write(Integer.toString(roll));
            fw.write(name);
            br.close();
            fw.close();

        }catch(IOException e){}
    }
}