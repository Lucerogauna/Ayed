package ejemploCola;

public class DobleEndedQueue <T> extends Queue<T> {
    public void enqueueFirst(T data) {
        super.cola.addFirst(data); //agrego data en la pos 0, o sea primero
        super.cola.add(0,data);
    }
}