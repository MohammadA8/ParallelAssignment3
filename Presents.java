import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.lang.Integer;

class Node {
    Integer data;
    Node next;
    Lock lock;
    int key;
    boolean marked;

    public Node(Integer data) {
        this.data = data;
        this.next = null;
        this.lock = new ReentrantLock();
        this.marked = false;
        this.key = data.hashCode();
    }

    public void lock()
    {

        lock.lock();
    }
    public void unlock()
    {
        lock.unlock();

    }
}

class ConcurrentLinkedList {
    
    private Node head;
    private Node tail;
    private int size;
    public int thread;

    public ConcurrentLinkedList() {
        this.size = 0;
        head = new Node(Integer.MIN_VALUE);
        head.next = new Node(Integer.MAX_VALUE);
        tail = head.next;
        thread = 0;
    }

    private boolean validate (Node pred, Node curr) {

        return !pred.marked && !curr.marked && pred.next == curr;

    }

    public boolean add(Integer item) {
        int key = item.hashCode();
        while (true) {
            Node pred = head;
            Node curr = head.next;
            // We do not check if head is null because this implementation of linkedlist starts out with 
            // a head and a tail node.
            while (curr.key < key) {
                pred = curr; 
                curr = curr.next;
            }
            // The previous and current nodes are being locked so that the new node is placed between them.
            pred.lock();
            try {
                curr.lock();
                try {
                    if (validate(pred, curr)) {
                        if (curr.key == key) {
                            return false;
                        } else {
                            Node node = new Node(item);
                            node.next = curr;
                            pred.next = node;
                            return true;
                        }
                    }
                } finally {
                    curr.unlock();
                }
            } finally {
                pred.unlock();
            }
        }
    }

    public Integer remove() {

        while (true) {
            Node pred = head;
            Node curr = head.next;

            // Only traverse if the curr node is marked/deleted
            while (curr.marked) {
                pred = curr; curr = curr.next;
            }
            
            // If the linkedlist is empty, this ensures that the algorithm doesn't delete the tail node
            if (curr == tail)
                return -9999999;

            pred.lock();
            try {
                curr.lock();
                try {
                    if (validate(pred, curr)) {
                        int deleted = curr.data;
                        curr.marked = true;
                        pred.next = curr.next;
                        return deleted;
                        // }
                    }
                } finally {
                    curr.unlock();
                }
            } finally {
                pred.unlock();
            }
        }
        }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(Integer data) {
        int key = data.hashCode();
        Node curr = head;
        while (curr.key < key)
            curr = curr.next;
        return curr.key == key && !curr.marked;
    }
}

public class Presents
{

    public static void addPresentToChain(List<Integer> list, ConcurrentLinkedList concurrentLinkedList)
    {

       synchronized(list){ 
        if (list.isEmpty())
            return;

        int present = list.remove(0);
        concurrentLinkedList.add(present);
        // System.out.println("Removed present " + present + " and added it to the chain");
       }
    }

    public static void writeThankYou(ConcurrentLinkedList concurrentLinkedList)
    {
       
        

        int present = concurrentLinkedList.remove();
        if (present == -9999999)
            return;
        // System.out.println("Sent a thank you to the person that gave him the present number: " + present);

    }

    public static void main(String[] args)
    {
        int presentsNum = 500000;
        List<Integer> bag = new ArrayList<>();
        for (int i = 0; i < presentsNum; i++)
            bag.add(i);
        
        Collections.shuffle(bag);
        ConcurrentLinkedList concurrentLinkedList = new ConcurrentLinkedList();
        Thread [] servants = new Thread[4];

        Random rand = new Random();

        Thread thread1 = new Thread () {
            public void run () {
                
                int task = 0;

                while(!bag.isEmpty() || !concurrentLinkedList.isEmpty())
                {                
                    // System.out.println("bag size is " + bag.size());


                    switch (task%3)
                    {
                        case 1: addPresentToChain(bag, concurrentLinkedList);
                                break; 
                        case 2: writeThankYou(concurrentLinkedList);
                                break;
                        case 3: int checkPresent = rand.nextInt(presentsNum);
                                System.out.println(concurrentLinkedList.contains(checkPresent) ? "gift number " + checkPresent + " is in the chain" : "gift number " + checkPresent + " is not the chain");
                                break;
                    }
                    task++;
                }
            }
          };
          Thread thread2 = new Thread () {
            public void run () {
                int task = 0;
                while(!bag.isEmpty() || !concurrentLinkedList.isEmpty())
                {                
                    // System.out.println("bag size is " + bag.size());

                    switch (task%3)
                    {
                        case 0: addPresentToChain(bag, concurrentLinkedList);
                                break; 
                        case 1: writeThankYou(concurrentLinkedList);
                                break;
                        case 2: int checkPresent = rand.nextInt(presentsNum);
                                System.out.println(concurrentLinkedList.contains(checkPresent) ? "gift number " + checkPresent + " is in the chain" : "gift number " + checkPresent + " is not the chain");
                                break;
                    }
                    task++;
                }
            }
          };
          Thread thread3 = new Thread () {
            public void run () {
                int task = 0;
                while(!bag.isEmpty() || !concurrentLinkedList.isEmpty())
                {                
                    // System.out.println("bag size is " + bag.size());


                    switch (task%3)
                    {
                        case 0: addPresentToChain(bag, concurrentLinkedList);
                                break; 
                        case 1: writeThankYou(concurrentLinkedList);
                                break;
                        case 2: int checkPresent = rand.nextInt(presentsNum);
                                System.out.println(concurrentLinkedList.contains(checkPresent) ? "gift number " + checkPresent + " is in the chain" : "gift number " + checkPresent + " is not the chain");
                                break;
                    }
                    task++;
                }
            }
          };
          Thread thread4 = new Thread () {
            public void run () {
                int task = 0;
                while(!bag.isEmpty() || !concurrentLinkedList.isEmpty())
                {                
                    // System.out.println("bag size is " + bag.size());

                    switch (task%3)
                    {
                        case 0: addPresentToChain(bag, concurrentLinkedList);
                                break; 
                        case 1: writeThankYou(concurrentLinkedList);
                                break;
                        case 2: int checkPresent = rand.nextInt(presentsNum);
                                System.out.println(concurrentLinkedList.contains(checkPresent) ? "gift number " + checkPresent + " is in the chain" : "gift number " + checkPresent + " is not the chain");
                                break;
                    }
                    task++;
                }
            }
          };

          thread1.start();
          thread2.start();
          thread3.start();
          thread4.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }



    }

}