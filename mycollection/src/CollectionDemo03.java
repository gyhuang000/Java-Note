import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo03 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("zhangsan");
        coll.add("lisi");
        coll.add("wangwu");

        // 增强for遍历
        // s就是一个第三方变量 在循环过程中一次表示集合中的每一个数据
        // 快速生成方式 集合的名字.for
        for(String s : coll){
            System.out.println(s);
        }
    }
}
