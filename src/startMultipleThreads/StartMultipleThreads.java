package startMultipleThreads;

public class StartMultipleThreads{

    public static void main(String[] args){

        Thread thread1 = new Thread(new Runnable(){
            @Override
            public void run() {
                String name = Thread.currentThread().getName();
                try{
                    Thread.sleep(3000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println("Hello from a " + name + "!");
            }
        }, "Thread1");



        Thread thread2 = new Thread(new Runnable(){

            @Override
            public void run() {
                String name = Thread.currentThread().getName();
                System.out.println("Hello from a " + name + "!");
            }
        }, "Thread2");


        thread1.start();
        thread2.start();



    }

}
