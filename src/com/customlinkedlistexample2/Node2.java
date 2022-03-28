package com.customlinkedlistexample2;

public class Node2 {

    public int value;
    public Node2 next;

    public Node2(int value, Node2 next) {
        this.value = value;
        this.next = next;
    }

    // ввод с головы
    public static Node2 createHead(int size) {

        Node2 head = new Node2(0, null);
        Node2 tail = head;

        for (int i = 0; i < size; i++) {
            tail.next = new Node2(i + 1, null);
            tail = tail.next;
        }

        return head;
    }

    // ввод с хвоста
    public static Node2 createTail(int size) {
        Node2 head = null;

        for (int i = size; i >= 0; i--) {
            head = new Node2(i, head);
        }

        return head;
    }

    //    добавление элемента в начало списка
    public static Node2 addFirst(Node2 head, int value) {

        return new Node2(value, head);

    }

    //    добавление элемента в конец списка
    public static void addLast(Node2 head, int value) {

        Node2 ref = head;

        while (ref.next != null) { // пока не последний элемент
            ref = ref.next;
        }

        ref.next = new Node2(value, null);
    }

    //    вставка элемента в список с указанным номером
    public static void insert(Node2 head, int value, int place) {
        Node2 newNode = new Node2(value, null);
        Node2 ref = head; // используем временную переменную
        int k = 1;
        // поиск нужного положения узла для вставки
        while (ref.next != null && (k < place)) {
            ref = ref.next;
            k++;
        }
        // переброска ссылок при вставке элемента
        newNode.next = ref.next.next;
        ref.next = newNode;

    }

    //    удаление элемента с головы списка
    public static Node2 removeFirst(Node2 head) {
        head = head.next;
        return head;
    }

    //    удаление последнего элемента списка
    public static void removeLast(Node2 head) {
        Node2 ref = head;
        while (ref.next.next != null) {
            ref = ref.next;
        }
        ref.next = null;
    }

    //    удаление из списка элемента с указанным номером
    public static void remove(Node2 head, int place) {
        Node2 ref = head;
        int k = 1;
        // поиск положения узла, предшествующего удаляемому
        while (ref.next != null && (k < place)) {
            ref = ref.next;
            k++;
        }
        // переброска ссылки для исключения ненужного элемента из списка
        ref.next = ref.next.next;
    }

    //    вывод (возвращается строка, сформированная из элементов списка)
    public static void toStringMethod(String message, Node2 head) {
        Node2 ref = head;
        System.out.println(message);
        while (ref != null) {
            System.out.println(" " + "next = " + ref.next + "; value = " + ref.value);
            ref = ref.next;
        }
    }
}
