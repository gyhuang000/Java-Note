import org.w3c.dom.ls.LSException;

import java.util.ArrayList;
import java.util.List;

public class demo02 {
    public static void main(String[] args) {
        // 创建一个集合
        List<Integer> list = new ArrayList<>();
        // 添加元素
        list.add(1);
        list.add(2);
        list.add(3);

//        list.remove(1);
        // 手动装箱
        Integer i = Integer.valueOf(1);
        list.remove(i);
        System.out.println(list);
    }
}
