import java.util.ArrayList;
import java.util.List;

public class demo01 {
    public static void main(String[] args) {
        // 创建一个集合
        List<String> list = new ArrayList<>();
        // 添加元素
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        // 在此集合中的指定位置添加元素
        // 原来索引上的元素会依次往后移动
        list.add(1,"qqq");

        // 删除指定索引处的元素 返回被删除的元素
        String remove = list.remove(0);
        System.out.println(remove);

        System.out.println(list);
    }
}
