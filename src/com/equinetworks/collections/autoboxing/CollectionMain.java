package com.equinetworks.collections.autoboxing;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CollectionMain {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);


        String[] colors = {"yellow", "green", "blue"};
        System.out.println("Simple Arrays" + Arrays.toString(colors));

//        Converted Arrays 'colors' to LinkedList
        LinkedList<String> ll = new LinkedList<>(Arrays.asList(colors));

//        Adding element "black" to list
        ll.add("black");
        ll.add("white");
        System.out.println(ll);

//        Converting LinkedList 'll' to Array 'colors' with new element 'black'
        colors=ll.toArray(new String[ll.size()]);

        for (int i=0;i<colors.length;i++){
            System.out.println(colors[i]);
        }


    }
}
