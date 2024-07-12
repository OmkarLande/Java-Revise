package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList {
    public static void main(String[] args) {
        // List is an interface that extends Collection
        List<Integer> list = new ArrayList();

        // add elements
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        // remove elements
        list.remove(1);
        System.out.println(list);

        // add element at specific index
        list.add(1, 4);
        System.out.println(list);


        List<Integer> list2 = new ArrayList();
        list2.add(5);
        list2.add(6);

        // add all elements of list2 to list
        list.addAll(list2);
        System.out.println(list);

        System.out.println(list.get(2));

        // remove element by value
        list.remove(Integer.valueOf(4));
        System.out.println(list);

        // set element at specific index
        list.set(2, 7);
        System.out.println(list);

        // check if element is present
        System.out.println(list.contains(7));
        System.out.println(list.contains(8));

        // get index of element
        System.out.println(list.indexOf(7));
        System.out.println(list.indexOf(8));

        // check if list is empty
        System.out.println(list.isEmpty());

        // get size of list
        System.out.println(list.size());


        for (Integer element : list) {
            System.out.println(element);
        }

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        list.clear();
    }
}
