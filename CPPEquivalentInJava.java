
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeSet;

public class CPPEquivalentInJava {

    // ################# This file contains C++ equivalent things
    public static void main(String [] args)
    {
        // ########## SET ##########
        TreeSet<Integer> set = new TreeSet<>();
        set.add(20);
        set.add(30);

        for (int data : set)
        {
            // System.out.println(data);
        }
        // System.out.println(set.contains(70)); // check if set contains 70 or not


        Queue<Integer>myQ = new LinkedList<>();
        myQ.add(50);
        myQ.add(60);
        myQ.add(70);
        myQ.add(80);


        System.out.println("Queue front item : " + myQ.poll());
        System.out.println("Queue front item : " + myQ.poll());
        System.out.println("Queue Size : "  + myQ.size());

        // System.out.println("Queue : "+ myQ);


        Stack<Integer>myStack = new Stack<>();
        myStack.push(30);
        myStack.push(40);
        myStack.push(50);

        System.out.println("Stack Size : "  + myStack.size());
        // System.out.println("Stack top element : " + myStack.pop());
       
        // System.out.println("Stack top element : " + myStack.pop());
        
        // System.out.println("Stack top element : " + myStack.pop());






    }
}
