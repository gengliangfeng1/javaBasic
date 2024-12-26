package java_basic.Iterator;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class HashMapChainLength {
    public static <Todo> void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("key1", 1);
        hashMap.put("key2", 2);
        // 通过反射获取内部的table数组
        Field tableField = HashMap.class.getDeclaredField("table");
        tableField.setAccessible(true);
        Object[] table = (Object[]) tableField.get(hashMap);
        // 假设我们要查看索引为0的桶的链表长度
        int bucketIndex = 0;
        if (table[bucketIndex]!= null) {
            // 需要修改
            int length = 0;
            Object current = table[bucketIndex];
            // 这里判断当前节点是否是HashMap内部的Node类型（代表链表节点）
            while (current.getClass().getName().equals("java.util.HashMap$Node")) {
                length++;
                current = getNodeNext(current);
            }
            System.out.println("链表长度为: " + length);
        } else {
            System.out.println("该桶为空，链表长度为0");
        }
    }

    private static Object getNodeNext(Object node) throws NoSuchFieldException, IllegalAccessException {
        Field nextField = node.getClass().getDeclaredField("next");
        nextField.setAccessible(true);
        return nextField.get(node);
    }
}