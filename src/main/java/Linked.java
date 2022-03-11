import java.util.Iterator;

public class Linked implements MyList<String>{

    public Element first;
    public Element last;
    public int size;

    public Linked() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    @Override
    public void clear() {
first=null;
last=null;
size=0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public boolean contains(String var) {
        MyIterator iterator=(MyIterator) this.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().value.equals(var)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean add(String var) {
        Element add=new Element(var);
        if(isEmpty()){
            first=add;
            last=add;
        }
        else{
            last.next=add;
            last=add;
        }
        size+=1;
        return last.next==null;
    }

    @Override
    public boolean remove(String var) {
        boolean flag=false;
        Element delete = first;
        Element past = null;
        //Empty
        if (isEmpty()) {
            System.out.println("List is empty or No element");
            return flag;}
        else{
            while (delete != null) {
                //begging
                if (delete.value.equals(var) & past == null) {
                    first = delete.next;
                    size -= 1;
                    flag=true;
                    break;
                }
                //middle
                if (delete.value.equals(var)) {
                    past.next = delete.next;
                    size -= 1;
                    flag=true;
                    break;
                }
                //end
                if (delete == last) {
                    last = past;
                    last.next = null;
                    size -= 1;
                    flag=true;
                    break;
                }
                past = delete;
                delete = delete.next;
            }
            return flag;
        }

    }

    @Override
    public Iterator<Element> iterator() {
        return new MyIterator(this);
    }
}
