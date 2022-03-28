package com.customlinkedlistexample2;


public class Main {
    public static void main(String[] args) {

        // Создание списка с головы
        Node2 head = Node2.createHead(5);
        Node2.toStringMethod("createHead" , head);
        // Добавление в хвост
        Node2.addLast(head, 123);
        Node2.toStringMethod("addLast" , head);
        // Добавление в начало
        Node2 newHead = Node2.addFirst(head, 150);
        Node2.toStringMethod("newHead" , newHead);
        // Добавление на третье место
        Node2.insert(newHead, 200, 4);
        Node2.toStringMethod("insert" , newHead);
        // Удаление головы
        Node2 newHeadAfterRemove = Node2.removeFirst(newHead);
        Node2.toStringMethod("removeFirst" , newHeadAfterRemove);
        // Удаление хвоста
        Node2.removeLast(newHeadAfterRemove);
        Node2.toStringMethod("removeFirst" , newHeadAfterRemove);
        // Удаление второго места
        Node2.remove(newHeadAfterRemove, 1);
        Node2.toStringMethod("remove" , newHeadAfterRemove);


//        Node2 head = Node2.createTail(10);
//        Node2.toStringMethod("createTail" , head);

    }
}
