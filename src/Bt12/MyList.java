package Bt12;

import java.util.Arrays;

public class MyList <E>{
        private static final int DEFAULT_CAPACITY = 10;
        private int size;
        private Object[] elements;

        public MyList() {
            this.elements = new Object[DEFAULT_CAPACITY];
        }

        public MyList(int capacity) {
            if (capacity < 0) {
                throw new IllegalArgumentException("Capacity cannot be negative: " + capacity);
            }
            this.elements = new Object[capacity];
        }

        public void add(int index, E element) {
            ensureCapacity(size + 1);
            if (index < 0 || index > size) {
                throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
            }
            System.arraycopy(elements, index, elements, index + 1, size - index);
            elements[index] = element;
            size++;
        }

        public E remove(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
            }
            E removedElement = (E) elements[index];
            int numMoved = size - index - 1;
            if (numMoved > 0) {
                System.arraycopy(elements, index + 1, elements, index, numMoved);
            }
            elements[--size] = null; // Let GC do its work
            return removedElement;
        }

        public int size() {
            return size;
        }

        public E clone() {
            MyList<E> cloneList = new MyList<>(size);
            System.arraycopy(elements, 0, cloneList.elements, 0, size);
            cloneList.size = size;
            return (E) cloneList;
        }

        public boolean contains(E obj) {
            return indexOf(obj) >= 0;
        }

        public int indexOf(E obj) {
            if (obj == null) {
                for (int i = 0; i < size; i++) {
                    if (elements[i] == null) {
                        return i;
                    }
                }
            } else {
                for (int i = 0; i < size; i++) {
                    if (obj.equals(elements[i])) {
                        return i;
                    }
                }
            }
            return -1;
        }

        public boolean add(E e) {
            add(size, e);
            return true;
        }

        public E get(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
            }
            return (E) elements[index];
        }

        public void clear() {
            for (int i = 0; i < size; i++) {
                elements[i] = null;
            }
            size = 0;
        }

        private void ensureCapacity(int minCapacity) {
            if (minCapacity > elements.length) {
                int newCapacity = elements.length * 2;
                if (newCapacity < minCapacity) {
                    newCapacity = minCapacity;
                }
                elements = Arrays.copyOf(elements, newCapacity);
            }
        }
    }
