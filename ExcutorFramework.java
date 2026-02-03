package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class ExcutorFramework {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(5);
    Callable<Integer> task1 = new Callable<>() {
        @Override
        public Integer call(){
            return 10;

    }
    };
     Callable<Integer> task2 = new Callable<>() {
        @Override
        public Integer call(){
            return 12;
        }
    };
    Callable<Integer> task3 = new Callable<>() {
        @Override
        public Integer call(){
            return 14;
        }
    };

     Callable<Integer> task4 = new Callable<>() {
        @Override
        public Integer call(){
            return 16;
        }
    };

      
        Future<Integer> future1 = executor.submit(task1);
        Future<Integer> future2 = executor.submit(task2);   
        Future<Integer> future3 = executor.submit(task3);
        Future<Integer> future4 = executor.submit(task4);
           try {
                System.out.println("Result of Task1: " + future1.get());
                System.out.println("Result of Task2: " + future2.get());
                System.out.println("Result of Task3: " + future3.get());
                System.out.println("Result of Task4: " + future4.get());
            } catch (Exception e) {
                e.printStackTrace();   
        executor.shutdown();
    }
    


}
}

