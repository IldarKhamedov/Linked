public class Main {
    public static void main(String[] args) {
        Linked list=new Linked();
        for(int i=0;i<5;i++){
            list.add(String.valueOf(i));
        }
        System.out.println(list.size);
      MyIterator iterator=(MyIterator) list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
       System.out.println(list.contains("4"));
       System.out.println(list.contains("11"));
        list.remove("0");
        System.out.println(list.size);
        list.remove("4");
        System.out.println(list.size);
        list.remove("2");
        System.out.println(list.size);
        MyIterator iterator2=(MyIterator) list.iterator();
        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }
    }
}
