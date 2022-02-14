package dzien2.listy;

import java.util.*;

public class Lists {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        List<String> linkedlist = new LinkedList<>();
//
//        list.add("pierwszy");
//        list.add("drugi");
//        list.add("trzeci");
//        list.add("trzeci");
//
//        linkedlist.add("pierwszy");
//        linkedlist.add("drugi");
//        linkedlist.add("trzeci");
//        linkedlist.add("trzeci");
//
//        list.remove(0);
//        linkedlist.remove(0);
//
//
//        System.out.println(linkedlist.get(2));
//        System.out.println(list.get(2));
//        System.out.println(list);
//        System.out.println(linkedlist);

        Stack<String> stos = new Stack<>();
        stos.add("pierwszy");
        stos.add("drugi");
        stos.add("trzeci");
        stos.add("czwarty");

        System.out.println(stos);
        System.out.println(stos.pop());
        System.out.println(stos);
        System.out.println(stos.peek());
        System.out.println(stos);
        stos.pop();
        System.out.println(stos);


//        for (String ele : list) {
//            System.out.println(ele);
//        }
//
//        list.remove(2);
//
//
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
//
//        System.out.println(list.size());
//        System.out.println(list.containsAll(Arrays.asList("drugi", "pierwszy")));
//        System.out.println(list.contains("drugi"));


    }
}
