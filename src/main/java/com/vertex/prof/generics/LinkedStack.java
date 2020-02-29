package com.vertex.prof.generics;


import lombok.AllArgsConstructor;

import java.util.Optional;

public class LinkedStack<T> {
    private Node<T> top = null; // End sentinel

    public void push(T item) {
        top = new Node<>(item, top);
    }

    public Optional<T> pop() {
        Optional<T> result = Optional.ofNullable(top)
                .map(t -> t.item);
        if (top != null) {
            top = top.next;
        }
        return result;
    }

    @AllArgsConstructor
    private static class Node<U> {
        private U item;
        private Node<U> next;
    }

    public static void main(String[] args) {
        LinkedStack<String> lss = new LinkedStack<>();
        for (String s : "Phasers on stun!".split(" ")) {
            lss.push(s);
        }
        Optional<String> s = lss.pop();
        while (s.isPresent()) {
            System.out.println(s.get());
            s = lss.pop();
        }

        LinkedStack<String> emptyStack = new LinkedStack<>();
        emptyStack.pop()
                .ifPresent(System.out::println);
    }
}