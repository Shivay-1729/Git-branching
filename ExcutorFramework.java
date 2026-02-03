package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExcutorFramework {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        
        for(int i = 0; i<=10;i++){
             final int num = i;
            executor.submit( () ->{
                      System.out.println(num+" "+"Thread:"+num*num);
            }
            );
        }
        executor.shutdown();
    }
}
