package Bt13;

public class main {
    class Node<E> {
        Node<E> next;
        E data;

        public Node(E data) {
            this.data = data;
            this.next = null;
        }

        public E getData() {
            return this.data;
        }
    }

    public class MyLinkedList<E> {
        private Node<E> head;
        private int numNodes;

        public MyLinkedList() {
            this.head = null;
            this.numNodes = 0;
        }

        public void add(int index, E element) {
        }

        public void addFirst(E e) {
        }

        public void addLast(E e) {
        }

        public E remove(int index) {
            return null;
        }

        public boolean remove(Object e) {
            return false;
        }

        public int size() {
            return 0;
        }

        public MyLinkedList<E> clone() {
            return null;
        }

        public boolean contains(E o) {
            return false;
        }

        public int indexOf(E o) {
            return -1;
        }

        public boolean add(E e) {
            return false;
        }

        public void ensureCapacity(int minCapacity) {
        }

        public E get(int i) {
            return null;
        }

        public E getFirst() {
            return null;
        }

        public E getLast() {
            return null;
        }

        public void clear() {
        }
    }
}
