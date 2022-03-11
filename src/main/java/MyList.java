import java.util.Iterator;
public interface MyList<E> extends Iterable<Element>{
    void clear();
    int size();
    boolean isEmpty();
    boolean contains(E var);
    boolean add(E var);
    boolean remove(E var);


}
