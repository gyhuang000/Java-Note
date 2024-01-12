import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo02 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");

        Iterator<String> it = coll.iterator();
        while (it.hasNext()){
            //next方法做两件事：获取元素并移动指针
            String str = it.next();
            System.out.println(str);
        }
    }
}
