package com.myCAS;

import java.util.concurrent.atomic.AtomicReference;

public class LinkedQueue<E> {
    private static class Node<E> {
        final E item;
        final AtomicReference<Node<E>> next;

        Node(E item, Node<E> next) {
            this.item = item;
            this.next = new AtomicReference<>(next);
        }

        @Override
        public String toString() {
            return this.item.toString();
        }

    }

    private AtomicReference<Node<E>> head = new AtomicReference<>(new Node<E>(
        null, null));
    private AtomicReference<Node<E>> tail = this.head;

    public boolean add(E item) {
        Node<E> newNode = new Node<>(item, null);
        while (true) {
            Node<E> curTail = this.tail.get();
            Node<E> residue = curTail.next.get();
            if (curTail == this.tail.get()) {
                if (residue == null) /* A */{
                    if (curTail.next.compareAndSet(null, newNode)) /* C */{
                        this.tail.compareAndSet(curTail, newNode) /* D */;
                        return true;
                    }
                } else {
                    this.tail.compareAndSet(curTail, residue) /* B */;
                }
            }
        }
    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        Node<E> node = this.head.get();
        if (node == null) {
            return "null";
        }
        result.append(node);
        while ((node = node.next.get()) != null) {
            result.append(node);
        }
        return result.toString();
    }

}
