import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo01 {
    public static void main(String[] args) {
        // 学习collection里面的方法
        Collection<String> coll = new ArrayList<>();

        // 添加元素
        // 返回值 往List系列添加数据 方法永远返回true
        // Set系列集合中添加数据 方法返回true
        coll.add("aaa");
        //  coll.clear();
        System.out.println(coll);
    }
}
