
import java.util.ArrayList;
import java.util.Collections;

public class Main{
    public static void main(String [] args)
    {
       // ####################### Construction Array #############

        ArrayList<Integer> arra1 = new ArrayList<>(); // construct an empty array
        System.out.println("create an empty array");
        System.out.println(arra1);

        System.out.println("create N capacity array");

        ArrayList<Integer>array2 = new ArrayList<>(5);
        array2.add(20); // insert into array
        array2.add(30); // insert into array
        System.out.println("array size after insert: " + array2.size());
        
        System.out.println("after insertion"+ array2);
        array2.remove(1);
        System.out.println("array after delation" + array2);

        ArrayList<Integer> array3 = new ArrayList<>(Collections.nCopies(5, 30)); // make 3 size array with value 30

        System.out.println(array3);

        ArrayList<Integer> array4 = new ArrayList<>(array2); // copy an array to another array;

        System.out.println(array4);

     

       

    }
}