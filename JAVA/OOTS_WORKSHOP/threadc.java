

class threadc implements Runnable{
    public void run(){
        System.out.println("thread is running... ");
    }
    public static void main(String args[]){
        threadc m1 =new threadc();
        Thread t1 = new Thread(m1);
        t1.start();
    }
}
