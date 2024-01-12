import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class CollectionDemo04 {
    public static void main(String[] args) {
        // 创建集合并添加元素
        Collection<String> coll = new ArrayList<>();
        coll.add("zhangsan");
        coll.add("lisi");
        coll.add("wangwu");
        // 利用匿名内部类的方式
        /*coll.forEach(new Consumer<String>() {
            @Override
            //s依次表示集合中的每一个数据
            public void accept(String s) {
                System.out.println(s);
            }
        });*/
        coll.forEach(s->
            System.out.println(s)
        );
    }
}
