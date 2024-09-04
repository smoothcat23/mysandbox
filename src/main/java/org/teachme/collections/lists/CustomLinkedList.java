package org.teachme.collections.lists;

public class CustomLinkedList {

    public Node head;

    public void displayContents(){
        Node current = head;

        while( current != null ){
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println();
    }
}
