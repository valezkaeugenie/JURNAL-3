package com.company;
import java.util.NoSuchElementException;

class SinglyLinkedList<E> {

    private ListNode<E> firstNode;
         private ListNode<E> lastNode;
              private String name;

    public SinglyLinkedList() {
        this("linked list");
    }
            public SinglyLinkedList(String listName) {
                name = listName;
                firstNode = lastNode = null;
            } //UNTUK MENAMPILKAN LIST NAMA

    public void insertAtFront(E insertItem) {
        ListNode newNode = new ListNode(insertItem);
        if (isEmpty()) { 
            firstNode = lastNode = new ListNode<E>(insertItem);
        } else {
            newNode.next = firstNode;
            firstNode = newNode;
        }
    } //UNTUK MENAMBAHKAN NODE DEPAN
    
            public void insertAtBack(E insertItem) {
                ListNode newNode = new ListNode(insertItem);
                if (isEmpty()) { 
                    firstNode = lastNode = new ListNode<E>(insertItem);
                } else { 
                    lastNode.next = newNode;
                    lastNode = newNode;
                }
            }// UNTUKMENAMBAHKAN NODE BELAKANG

    public E removeFromFront() throws NoSuchElementException { //UNTUK MENGHAPUS NODE DEPAN
        if (isEmpty()) { 
            throw new NoSuchElementException(name + " is empty");
        }
        E removedItem = firstNode.data; //MENGAPUS NODE

        ListNode current = firstNode;
        firstNode = firstNode.next;
        current = null;

        return removedItem; 
    }
    public E removeFromBack() throws NoSuchElementException { //UNTUK MENGHAPUS NODE BELAKANG
        if (isEmpty()) { 
            throw new NoSuchElementException(name + " is empty");
        }
        E removedItem = lastNode.data; 
        
        if (firstNode == lastNode) {
            firstNode = lastNode = null;

        } else { 
            ListNode<E> current = firstNode;
         
            while (current.next != lastNode) {
                current = current.next;
            }
            lastNode = current; 
            current.next = null;
        }
        return removedItem; 
    }
    private boolean isEmpty() { //JIKA KOSONG MAKA AKAN KEMBALI
        return firstNode == null;
    }

    public void print() { //MENAMPILKAN DATA
        if (isEmpty()) {
            System.out.printf("Empty %s%n", name);
            return;
        }
        System.out.printf("List %s adalah: %n", name);
        ListNode<E> current = firstNode;
       
        while (current != null) {
            System.out.printf("%s ", current.data);
            current = current.next;
        }
        System.out.println();
    }
}
