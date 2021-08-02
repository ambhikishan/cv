import java.io.*;
public class copyfile{
    public static void main(String[] args){
       try {
           FileInputStream fin = new FileInputStream("d.txt");

           FileOutputStream fout = new FileOutputStream("copied.txt");
           int c;
           while ((c = fin.read()) != -1)
               fout.write(c);
       }catch (IOException e){}
    }
}