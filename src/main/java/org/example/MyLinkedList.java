package org.example;

public class MyLinkedList {

    Node head;

    public void insert(int data){
        Node node = new Node();
        node.data = data;


        if(head==null){
            head = node;
        }
        else{
            Node n = head;
            //traversing the LinkedList nodes to find the end Node. Once that is found, update the "next" reference
            // location with the new Node that has been inserted
            while(n.next!=null){
                n = n.next;
            }
            //updating the end reference w/ the new end nodes location
            n.next = node;
        }
    }

    public void deleteAt(int index){
        if(index==0){
            head = head.next;
        }
        else{
            Node n = head;
            Node n1 = null;
            for(int i=0;i<index-1;i++){
                n = n.next;

            }
            n1 = n.next;
            n.next = n1.next;
            n1 = null;
        }
    }

    public void insertAt(int index, int data){

        Node node = new Node();
        node.data = data;
        node.next = null;

        if(index==0){
            insertAtStart(data);
        }
        else{
            Node n = head;
            for(int i=0;i<index-1;i++){
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }

    public void insertAtStart(int data){
        Node node = new Node();
        node.data = data;
        node.next = head;

        head = node;
    }

    public void show(){
        Node node = head;
        while(node.next!=null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }


}
