// Demonstrating join()
class with_join extends Thread {
    public void run() {
        System.out.println("First calling of run() method");
        try {
            Thread.sleep(1000); 
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Second calling of run() method");
    }

    public static void main(String[] args) {
        with_join obj = new with_join();
        with_join obj1 = new with_join();

        obj.start();
        try {
            obj.join(); 
        } catch (InterruptedException ie) {
            System.out.println(ie);
        }

        obj1.start();
    }
}