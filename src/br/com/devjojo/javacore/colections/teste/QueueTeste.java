package br.com.devjojo.javacore.colections.teste;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTeste {

    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("C");
        queue.add("D");
        queue.add("A");
        queue.add("B");

        System.out.println(queue);
    }

}
