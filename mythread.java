
import java.io.*;

class newthread implements Runnable{
    
        public void run()
    {
        try{
            for(int i=1; i<5; i++){
                System.out.println("child thread :: " +i);
                Thread.sleep(1000);
        }
        }catch(InterruptedException e)
            {
                System.out.println("Exception occure :: " +e);
            }
    }
    
}
public class mythread
{
    public static void main(String[] args)
    {
        newthread t = new newthread();
        Thread t1 = new Thread(t);
        t1.start();
        
        try{
            for(int i=1; i<5; i++){
                System.out.println("main thread :: " +i); 
                Thread.sleep(1000);
                //throw new InterruptedException();
                
            }
        }catch(InterruptedException e){
                System.out.println("Exception occure in main :: " +e);
            }
    }
}