package org.teachme.collections.lists;

import org.teachme.collections.lists.Algorithms;

import java.util.Arrays;
import java.util.LinkedList;

/**
 *
 * basierend auf Kurs:  <a href="https://www.linkedin.com/learning/java-algorithms/apply-custom-parsing-to-search-algorithms">...</a>
 */

public abstract class Main {

    public static void main(String[] args) {

        System.out.println("List algorithms");

        // Linked List
        LinkedList<String> listy = new LinkedList<>();
        listy.add("Bruno");
        listy.add("Angel");
        listy.add("Conan");
        listy.add("Diana");
        Algorithms.simpleLinkedListTask(listy);

        // custom Linked List
        CustomLinkedList linkedList = new CustomLinkedList();
        Algorithms.customLinkedList(linkedList);

    }


}
