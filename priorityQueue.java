package TravelOka;
import java.util.*;

public class PQueue{
    public static void main(String[] args){
        PriorityQueue <Integer> pqueue = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i=2; i<=20; i=i+2)
            pqueue.add(i);
        System.out.println("PriorityQueue: " + pqueue);
        System.out.println("------------------------------------");
        Comparator pqueue_comp = pqueue.comparator();
        System.out.println("Comparator PriorityQueue: " + pqueue_comp);
        System.out.println("------------------------------------");
        boolean check = pqueue.contains(6);
        System.out.println("Use of contains(): " + check);
        System.out.println("------------------------------------");
        Iterator ir = pqueue.iterator();
        System.out.print("Iterator values: ");
        while(ir.hasNext())
            System.out.print(ir.next() + " ");
        System.out.println("");
        System.out.println("------------------------------------");
        pqueue.offer(3050);
        System.out.println("PriorityQueue: " + pqueue);
        System.out.println("------------------------------------");
        System.out.println("Head of PriorityQueue via peek: " + pqueue.peek());
        System.out.println("------------------------------------");
        int h = pqueue.poll();
        System.out.println("Head of PriorityQueue via poll: " + h);
        System.out.println("PriorityQueue bcz of poll(): " + pqueue);
        System.out.println("------------------------------------");
        boolean r = pqueue.remove(8);
        System.out.println("Can remove: " + r);
        System.out.println("geek PriorityQueue bcz of remove(): " + pqueue);
        System.out.println("------------------------------------");
        System.out.println("Size of PriorityQueue: " + pqueue.size());
        System.out.println("------------------------------------");
        Object[] g = pqueue.toArray();
        System.out.print ( "Array from PriorityQueue: ");
        for ( int i = 0; i<g.length; i++ )
            System.out.print (g[i].toString() + " ");
        System.out.println("");
        System.out.println("------------------------------------");
        Integer[] g2 = new Integer[5];
        Integer[] g1 = pqueue.toArray(g2);
        System.out.print ( "Array from PriorityQueue of size 5: ");
        for ( int i = 0; i<g1.length; i++ )
            System.out.print (g1[i].toString() + " ");
        System.out.println("");
        System.out.println("------------------------------------");
        pqueue.clear();
        System.out.println("PriorityQueue after clear(): " + pqueue);
    }
}
