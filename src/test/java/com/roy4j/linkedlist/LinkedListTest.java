package com.roy4j.linkedlist;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class LinkedListTest {

    final Integer ZERO = 0;
    final Integer ONE = 1;
    final Integer TWO = 2;
    final Integer THREE = 3;
    final Integer FOUR = 4;

    @Test
    public void constructorTest() throws Exception {
        LinkedList myLinkedList = new LinkedList(FOUR);
        assertEquals(FOUR, myLinkedList.getHead());
        assertEquals(FOUR, myLinkedList.getTail());
        assertEquals(ONE, myLinkedList.getLength());

        System.out.println("Linked List:");
        myLinkedList.printList();
    }

    @Test
    public void appendTest() throws Exception {
        LinkedList myLinkedList = new LinkedList(FOUR);
        myLinkedList.makeEmpty();
        myLinkedList.append(ONE);
        myLinkedList.append(TWO);

        assertEquals(ONE, myLinkedList.getHead());
        assertEquals(TWO, myLinkedList.getTail());
        assertEquals(TWO, myLinkedList.getLength());

        System.out.println("Linked List:");
        myLinkedList.printList();
    }

    @Test
    public void prependTest() throws Exception {
        LinkedList myLinkedList = new LinkedList(TWO);
        myLinkedList.append(THREE);

        assertEquals(TWO, myLinkedList.getHead());
        assertEquals(THREE, myLinkedList.getTail());
        assertEquals(TWO, myLinkedList.getLength());

        System.out.println("Before:");
        myLinkedList.printList();

        myLinkedList.prepend(ONE);

        assertEquals(ONE, myLinkedList.getHead());
        assertEquals(THREE, myLinkedList.getTail());
        assertEquals(THREE, myLinkedList.getLength());

        System.out.println("After:");
        myLinkedList.printList();
    }

    @Test
    public void removeLastTest() throws Exception {
        LinkedList myLinkedList = new LinkedList(ONE);
        myLinkedList.append(TWO);
        assertEquals(TWO, myLinkedList.getLength());

        assertEquals(TWO, myLinkedList.removeLast().value);
        assertEquals(ONE, myLinkedList.getLength());

        assertEquals(ONE, myLinkedList.removeLast().value);
        assertEquals(ZERO, myLinkedList.getLength());

        assertNull(myLinkedList.removeLast());
        assertEquals(ZERO, myLinkedList.getLength());
    }

    @Test
    public void removeFirstTest() throws Exception {
        LinkedList myLinkedList = new LinkedList(TWO);
        myLinkedList.append(ONE);

        assertEquals(TWO, myLinkedList.getHead());
        assertEquals(ONE, myLinkedList.getTail());
        assertEquals(TWO, myLinkedList.getLength());

        System.out.println(myLinkedList.removeFirst().value);

        assertEquals(ONE, myLinkedList.getHead());
        assertEquals(ONE, myLinkedList.getTail());
        assertEquals(ONE, myLinkedList.getLength());

        System.out.println(myLinkedList.removeFirst().value);

        assertNull(myLinkedList.getHead());
        assertNull(myLinkedList.getTail());
        assertEquals(ZERO, myLinkedList.getLength());

        System.out.println(myLinkedList.removeFirst());
    }
}
