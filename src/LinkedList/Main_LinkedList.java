package LinkedList;

import LinkedList.LinkedList;

import java.util.Arrays;
//import java.util.LinkedList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main_LinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addlast(10);
        list.addlast(20);
        list.addlast(30);
        list.addlast(40);
        list.addlast(50);
        System.out.println(list.getKthNodeFromTheEnd(2));
        var array = list.toArray();
        System.out.println(Arrays.toString(array));



    }
}