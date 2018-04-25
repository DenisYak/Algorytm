package algorytm.lesson3;

import java.util.EmptyStackException;

public class Stack {
    private char[] stack;
    private int size;
    private int head;

    protected Stack(int size) {
        this.size = size;
        this.stack = new char[this.size];
        this.head = -1;
    }

    public boolean isEmpty() {
        return this.head == -1;
    }

    public boolean isFull() {
        return this.head == this.size - 1;
    }

    public void push(char i) {
        if (isFull()) {
            this.size *= 2;
            char[] newArr = new char[size];
            System.arraycopy(this.stack, 0, newArr, 0, this.stack.length);
            this.stack = newArr;
        }
        this.stack[++this.head] = i;
    }

    public char pop() {
        if (isEmpty())
            throw new EmptyStackException();
        return this.stack[this.head--];
    }

    public char peek() {
        return this.stack[this.head];
    }
}
