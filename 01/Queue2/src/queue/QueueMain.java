package queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue<Integer> q = new Queue<>();
        q.push(6);
        System.out.println(q.isEmpty());
        int item = q.pop();
        System.out.println("6 == " + item);
    }
}
