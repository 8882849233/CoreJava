public class StackImpl {
    static final int DEFAULT_CAPACITY = 1000;
    int top;
    int[] a = new int[DEFAULT_CAPACITY];

    StackImpl() {
        top = -1;
    }

    boolean isEmpty() {
        return (top == -1);
    }

    int peek() {
        if (top < 0) {
            System.out.println("Stack UnderFlow");
            return 0;
        } else {
            return a[top];
        }
    }

    int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            return a[top--];
        }
    }

    boolean push(int x) {
        if (top >= (DEFAULT_CAPACITY - 1)) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[++top] = x;
            return true;
        }
    }

}
