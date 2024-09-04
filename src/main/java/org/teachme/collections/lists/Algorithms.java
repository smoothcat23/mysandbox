package org.teachme.collections.lists;

import java.util.LinkedList;

public class Algorithms {

    public static void simpleLinkedListTask(LinkedList<String> listy){
        System.out.print(listy.contains("Angel"));
        System.out.print(listy.size());

        listy.removeFirst();

        for (String item: listy){
            System.out.print(item + "->");
        }

        // oder
        listy.forEach( x -> System.out.print(x + "->"));
    }

    public static void customLinkedList(CustomLinkedList linkedList) {
        Node node1 = new Node(3);
        Node node2 = new Node(4);
        Node node3 = new Node(5);
        Node node4 = new Node(6);

        linkedList.head = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        System.out.println();
        System.out.println("display content from customLinkedList object");
        linkedList.displayContents();
    }
}
