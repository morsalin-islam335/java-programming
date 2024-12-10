
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main{
    public static void main(String [] args)
    {
       // ####################### Construction Array #############

        // ArrayList<Integer> arra1 = new ArrayList<>(); // construct an empty array
        // System.out.println("create an empty array");
        // System.out.println(arra1);

        // System.out.println("create N capacity array");

        // ArrayList<Integer>array2 = new ArrayList<>(5);
        // array2.add(20); // insert into array
        // array2.add(30); // insert into array
        // System.out.println("array size after insert: " + array2.size());
        
        // System.out.println("after insertion"+ array2);
        // array2.remove(1);
        // System.out.println("array after delation" + array2);

        // ArrayList<Integer> array3 = new ArrayList<>(Collections.nCopies(5, 30)); // make 3 size array with value 30

        // System.out.println(array3);

        // ArrayList<Integer> array4 = new ArrayList<>(array2); // copy an array to another array;

        // System.out.println(array4);



        ArrayList<Integer> array5 = new ArrayList<>(Collections.nCopies(5, 10));
        

        // ######### capacity #######//#endregion

        System.out.println("Size of array5 " + array5.size());
        System.out.println("is empty array : " + array5.isEmpty());
        System.out.println("index 0 of array5 : " + array5.get(0));

        array5.clear();
        
        array5.add(0,5); // add 5 in 0 number index
        System.out.println("array : " + array5);


        // ########## modifyer #########//#endregion

        Collections.replaceAll(array5,5, 10);
        System.out.println("array : " + array5);

        System.out.println("contains : " + array5.contains(10));
        array5.add(30);
        array5.set(0, 40);
        System.out.println("array : " + array5);
        Collections.sort(array5); // sort according to asscending order
        System.out.println("array : " + array5);

        Collections.sort(array5,Comparator.reverseOrder()); // sort according to reverse order
        System.out.println("array : " + array5);



        


    }
}