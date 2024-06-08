package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        list.add(1, 4);
        System.out.println(list);

        List<Integer> list2 = new ArrayList();
        list2.add(5);
        list2.add(6);

        list.addAll(list2);
        System.out.println(list);

        System.out.println(list.get(2));

        list.remove(Integer.valueOf(4));
        System.out.println(list);

        list.set(2, 7);
        System.out.println(list);

        System.out.println(list.contains(7));
        System.out.println(list.contains(8));

        System.out.println(list.indexOf(7));
        System.out.println(list.indexOf(8));

        System.out.println(list.isEmpty());

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
