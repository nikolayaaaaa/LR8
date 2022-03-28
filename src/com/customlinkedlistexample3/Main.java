package com.customlinkedlistexample3;


public class Main {
    public static void main(String[] args) {

//        // Создание списка с головы
//        Node3 head = new Node3(0, null);
//
//        Node3.createHeadRec(head, new Node3(), 5);
//
//        Node3.toStringMethod("createHeadRec", head);

        // Создание списка с хвоста

        Node3 head2 = Node3.createTailRec(null, 3);

        Node3.toStringMethod("createTailRec", head2);


    }
}
