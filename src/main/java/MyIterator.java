import java.util.Iterator;

public class MyIterator implements Iterator<Element> {
    Linked list;
    Element cur;

    public MyIterator(Linked list) {
        this.list = list;
        cur=list.first;
    }

    @Override
    public boolean hasNext() {
        return cur!=null;
    }

    @Override
    public Element next() {
        Element el=cur;
        cur=cur.next;
        return el;
    }
}
