package Day30_CollectionFramework;

import java.util.ArrayList;

public class Topic2_HA_ArrayListRandomAccess {
    public static void main(String[] args) {
        ArrayList<Integer> MyArrayList = new ArrayList<>();

        MyArrayList.add(8476);
        MyArrayList.add(2);
        MyArrayList.add(8476);
        MyArrayList.add(4);
        MyArrayList.add(1);
        MyArrayList.add(1);
        MyArrayList.add(999);
        MyArrayList.add(null);
        MyArrayList.add(1794);

        System.out.println(MyArrayList);

        /*
        The ArrayList class implements the List interface.
        It uses a dynamic array to store the duplicate element of different data types.
        (Increase the size of array based on demand)
        The Arraylist class maintains the insertion order.
        The elements stored in the ArrayList class can be randomly accessed.

        The purpose of RandomAccess Interface is to retrieve any random element in the Collection at the same speed.
        Imagine I have an arraylist of 1 million objects.
        Implementing random access interface makes your time to retrieve 10th element and 17869th element at the same.
        This makes ArrayList more powerful.

         */
        MyArrayList.get(0);
        MyArrayList.get(8);

    }
}
