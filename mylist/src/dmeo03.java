import javax.swing.text.html.HTMLDocument;
import java.util.*;
import java.util.function.Consumer;

public class dmeo03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        /*Iterator<String> it =  list.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }*/

        /*for(String s : list){
            System.out.println(s);
        }*/

        /*list.forEach((String s)->{
                System.out.println(s);
            }
        );*/
        // 在遍历的过程中可以添加一个元素
        ListIterator<String> it = list.listIterator();
        while (it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }
    }
}
