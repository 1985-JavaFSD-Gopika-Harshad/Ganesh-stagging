import java.util.ArrayList;

public class GenericStack<T> {
    private ArrayList<T> stack;
    public GenericStack() {
        stack = new ArrayList<>();
    }
    public void push(T item) {
        stack.add(item);
    }
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.remove(stack.size() - 1);
    }
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.get(stack.size() - 1);
    }
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    public int size() {
        return stack.size();
    }
    public static void main(String[] args) {
        GenericStack<String> stringStack = new GenericStack<>();
        stringStack.push("Ganesh");
        stringStack.push("Rajesh");
        stringStack.push("Anil");
        System.out.println("Top of stack: " + stringStack.peek());
        System.out.println("Stack size: " + stringStack.size());
        System.out.println("Popped: " + stringStack.pop());
        System.out.println("Stack size after pop: " + stringStack.size());
        System.out.println("Is stack empty? " + stringStack.isEmpty());
    }
}
