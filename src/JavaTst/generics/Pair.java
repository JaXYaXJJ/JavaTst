package JavaTst.generics;

public class Pair<T,H> {

    private T first;
    private H second;

    public Pair(T first, H second) {

        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public H getSecond() {
        return second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(H second) {
        this.second = second;
    }
}
