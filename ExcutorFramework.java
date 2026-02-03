package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class ExcutorFramework {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
    
        for(int i = 0; i<=10;i++){
             final int num = i;
            executor.submit( () ->{
                      System.out.println(num+" "+"Thread:"+num*num);
            }
            );
        }
        Future<Integer> future = executor.submit(new myCallable(10));
        try {
            Integer result = future.get();
            System.out.println("Result from myCallable: " + result);
        } catch (Exception e) {
            
        }
        executor.shutdown();
    }
}
