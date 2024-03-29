// London Paris
// IT-CS-143-Lecture-12

import java.util.*;

class Lecture12 {
    public static void main(String[] args) {
        System.out.println("Hello from lecture 12");

        // Self-Check Problems:
        // Section 14.1: Stack/Queue Basics

        // 1. Which of the following statements about stacks and queues is true?

        // A. Stacks and queues can store only integers as their data.
        // B. A stack returns elements in the same order as they were added (first-in,
        // first-out).
        // C. A queue’s remove method removes and returns the element at the front of
        // the
        // queue.
        // D. Stacks and queues are similar to lists, but less efficient.
        // E. The peek method allows access to the element at the bottom of a stack.

        // C. A queue's remove method removs and returns the element at the front of the queue.

        // 2. What is a real-world example of data that could be modeled using a stack?
        // Using a queue?
        // A real-world example of data that could be modeled using a stack is,
        // in a video game, the ammunition for a rifle magazine can be stored in a stack
        // A real-world example of data that could be modeled using a queue is,
        // dinner reservations for a restaurant.

        // 3. When you call push on a stack, where is the new element placed relative to
        // the other elements in the stack?
        // When you call pop, which element from the stack is returned?
        // The new element is placed at the top of the stack which is last index.
        // The element from the last index is returned when you call pop.


        // 4. When you call add on a queue, where is the new element placed relative to
        // the other elements in the queue?
        // When you call remove, which element from the queue is returned?
        // The new element is placed at the last index of the queue.
        // When you call remove, The first element is returned

        // 5. If you create a new empty stack and push the values 1, 2, and 3 in that
        // order, and call pop on the stack once, what value will be returned?
        // 3

        // 6. If you create a new empty queue and add the values 1, 2, and 3 in that
        // order, and call remove on the queue once, what value will be returned?
        // 1

        // Section 14.2: Common Stack/Queue Operations

        // 12. Stacks and queues have less functionality than other similar collections
        // like lists and maps.
        // Why are they still useful despite lacking functionality? What possible
        // advantages are there of using a less powerful collection?
        // Stacks and queues are much simpler than other collection types leading to increased
        // performance for their operations like push/pop or add/remove.
        // 13. What is the output of the following code?
        // Do this by hand to make sure that you understand stacks and queues
        // [you, are, how]

        // 14. What is the output of the following code?
        // Do this by hand to make sure that you understand stacks and queues
        // 10
        // 7
        // 5
        // false
        // 2
        // 3
        // 8
        // 3

        // 22. Write a piece of code that prints the elements of a queue of integers,
        // one per line.
        // When your code is done running, the queue should still contain the same
        // contents as it had at the start. In other words, don’t destroy the queue as
        // you print it. If you like, put your code into a method called print that
        // accepts the queue as a parameter.
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        print(array);

        // 23. Write a piece of code that finds and prints the longest string in a stack
        // of strings.

        // For example, in the stack [hello, hi, goodbye, howdy], the longest string is
        // "goodbye". When your code is done running, the stack should still contain the
        // same contents as it had at the start. In other words, if you destroy the
        // stack as you examine it, restore its state afterward. If you like, put your
        // code into a method called printLongest that accepts the stack as a parameter.
        String[] str = {"hello", "hi", "goodbye", "howdy"};
        printLongest(str);

        // Exercises:
        // None
    }

    public static void print(int[] nums) {
        Queue<Integer> q = new LinkedList<>();

        for (int num : nums) {
            q.add(num);
        }

        System.out.println("queue = " + q);
        System.out.println("size = " + q.size());
        System.out.println("peek = " + q.peek());

        while (!q.isEmpty()) {
            System.out.println(q.remove() + " ");
        }

        for (int num : nums) {
            q.add(num);
        }
        System.out.println(q);
    }

    public static void printLongest(String[] str) {
        Stack<String> s = new Stack<>();
        Stack<String> ss = new Stack<>();
        String max = "";

        for (String element : str) {
            s.push(element);
        }

        while (!s.isEmpty()) {
            String current = s.pop();
            if (current.length() > max.length()) {
                max = current;
            }
            ss.push(current);
        }

        while (!ss.isEmpty()) {
            s.push(ss.pop());
        }

        System.out.println(max);


    }
}
