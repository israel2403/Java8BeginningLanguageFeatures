package generics;

public class ObjectWrapper {
    private Object ref;

    public ObjectWrapper(Object ref) {
        this.ref = ref;
    }

    public Object get() {
        return this.ref;
    }

    public void set(final Object reference) {
        this.ref = reference;
    }
}
