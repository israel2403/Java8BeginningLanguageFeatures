package generics;

public class Wrapper<T> {
    private T ref;

    public Wrapper(T ref) {
        this.ref = ref;
    }

    public T get() {
        return this.ref;
    }

    public void set(T ref) {
        this.ref = ref;
    }
}
