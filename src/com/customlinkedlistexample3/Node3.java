package com.customlinkedlistexample3;

public class Node3 {

    public int value;
    public Node3 next;

    public Node3(int value, Node3 next) {
        this.value = value;
        this.next = next;
    }

    public Node3() {
    }

    // ввод с головы
    public static void createHeadRec(Node3 head, Node3 tail, int size) {

        if (head != null) {
            tail = head;
        }

        if (size != 1) {
            tail.next = new Node3(size - 1, null);
            tail = tail.next;
            createHeadRec(null, tail, size - 1);
        }

    }

    // ввод с хвоста
    public static Node3 createTailRec(Node3 head, int size) {

        if (size != 0) {
            head = new Node3(size+1, head);
            head = createTailRec(head, size-1);
        }

        return head;
    }

    //    добавление элемента в начало списка
    public static Node3 addFirst(Node3 head, int value) {
        return new Node3(value, head);
    }

    //    добавление элемента в конец списка
    public static void addLast(Node3 head, int value) {

        Node3 ref = head;

        while (ref.next != null) { // пока не последний элемент
            ref = ref.next;
        }

        ref.next = new Node3(value, null);
    }

    //    вставка элемента в список с указанным номером
    public static void insert(Node3 head, int value, int place) {
        Node3 newNode = new Node3(value, null);
        Node3 ref = head; // используем временную переменную
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
    public static Node3 removeFirst(Node3 head) {
        head = head.next;
        return head;
    }

    //    удаление последнего элемента списка
    public static void removeLast(Node3 head) {
        Node3 ref = head;
        while (ref.next.next != null) {
            ref = ref.next;
        }
        ref.next = null;
    }

    //    удаление из списка элемента с указанным номером
    public static void remove(Node3 head, int place) {
        Node3 ref = head;
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
    public static void toStringMethod(String message, Node3 head) {
        Node3 ref = head;
        System.out.println(message);
        while (ref != null) {
            System.out.println(" " + "next = " + ref.next + "; value = " + ref.value);
            ref = ref.next;
        }
    }
}
