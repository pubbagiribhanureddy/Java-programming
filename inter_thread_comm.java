class Even implements Runnable {
    int number = 2;
    Object shared;

    Even(Object obj) {
        shared = obj;
    }

    public void run() {
        while (number <= 20) {
            synchronized (shared) {
                System.out.println("Even Number: " + number);
                number += 2;

                try {
                    shared.notify(); // Wake up Odd thread
                    shared.wait();   // Wait for Odd thread
                } catch (InterruptedException ie) {
                }
            }
        }
    }
}

class Odd implements Runnable {
    int oddNumber = 1;
    Object shared;

    Odd(Object obj) {
        shared = obj;
    }

    public void run() {
        while (oddNumber <= 20) {
            synchronized (shared) {
                System.out.println("Odd Number: " + oddNumber);
                oddNumber += 2;

                try {
                    shared.notify(); // Wake up Even thread
                    shared.wait();   // Wait for Even thread
                } catch (InterruptedException ie) {
                }
            }
        }
    }
}

public class inter_thread_comm {
    public static void main(String args[]) {
        Object shared = new Object();

        Even evenObj = new Even(shared);
        Odd oddObj = new Odd(shared);

        Thread evenThread = new Thread(evenObj);
        Thread oddThread = new Thread(oddObj);

        oddThread.start();
        evenThread.start();
    }
}