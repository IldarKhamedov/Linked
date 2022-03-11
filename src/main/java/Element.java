public class Element<T> {
    public T value;
    public Element next;

    public Element(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Element{" +
                "value=" + value +
                '}';
    }
}
