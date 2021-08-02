

class threads extends Thread{
    String msg;
    threads(String ms){
        msg=ms;

    }
    public void run(){
        try{for (int i=0;i<20;i++){
            System.out.println(msg+"  "+i);
        }

        }catch(Exception e){
            System.out.println("ERROR");
        }

    }
}

public class Main {

    public static void main(String[] args) {

        com.codes.threads t1=new com.codes.threads("Hello");
        com.codes.threads t2=new com.codes.threads("World");

        t1.start();
        t2.start();

    }
}
