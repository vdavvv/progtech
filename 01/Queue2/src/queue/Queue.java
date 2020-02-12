package queue;

import java.util.ArrayList;
import java.util.List;

public class Queue <T> {
    private List<T> items = new ArrayList<>();

    public void push(T elem){
        items.add(elem);
    }

    public boolean isEmpty(){
        return items.isEmpty();
    }

    public T pop(){
        try {
            return items.remove(0);
        } catch (IndexOutOfBoundsException ex){
            throw new EmptyQueueException();
        }

    }

    public T top(){
        try {
            return items.get(0);
        } catch (IndexOutOfBoundsException ex){
            throw new EmptyQueueException();
        }
    }

    public void empty(){
        items.clear();
    }
}
