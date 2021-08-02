class thread implements Runnable{
    String message;
    thread(String s){
    message=s;
    }
    public void run(){
        try {
            for(int i=0;i<5;i++)
                System.out.println(message+" "+i);
            for (int i = 5; i>0 ; i--) {
                System.out.println(message+"  "+i);
                    Thread.sleep(1000);
            }


        }catch (Exception e){
            System.out.println("Exception:"+e);
        }

    }
}
public class runnable{
    public static void main(String args[]){
    thread t1=new thread("Hello");
    thread t2=new thread("World");

    Thread T1=new Thread(t1);
    Thread T2=new Thread(t2);
    T1.start();
    T2.start();
    

    }
}