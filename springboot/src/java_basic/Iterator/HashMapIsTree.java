package java_basic.Iterator;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class HashMapIsTree {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        HashMap<String, Integer> hashMap = new HashMap<>();
        // 插入足够多的元素使某个桶可能转换为红黑树
        for (int i = 0; i < 100; i++) {
            hashMap.put("key" + i, i);
        }
        Field tableField = HashMap.class.getDeclaredField("table");
        tableField.setAccessible(true);
        Object[] table = (Object[]) tableField.get(hashMap);
        // 假设我们要查看索引为0的桶是否是红黑树
        // 需要修改
        int bucketIndex = 0;
        if (table[bucketIndex]!= null) {
            boolean isTree = table[bucketIndex].getClass().getName().equals("java.util.HashMap$TreeNode");
            if (isTree) {
                System.out.println("该桶已转换为红黑树");
            } else {
                System.out.println("该桶仍然是链表");
            }
        } else {
            System.out.println("该桶为空");
        }
    }
}
