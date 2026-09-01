package cCollections;

import java.util.ArrayDeque;
//stack: Works  as LIFO, Last in First Out
public class stackExampleLIFO {
    public static void main(String[] args) {
        ArrayDeque<String> stack = new ArrayDeque<>();

        stack.push("First");
        stack.push("Second");
        stack.push("3rd Item");
        stack.push("4th item");

        System.out.println(stack);
        System.out.println("Pop-remove:" + stack.pop());
        System.out.println("After stack:"+stack);

    }
}
