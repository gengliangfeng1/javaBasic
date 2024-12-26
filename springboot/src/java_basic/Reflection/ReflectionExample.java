package java_basic.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {
    public static void main(String[] args) throws Exception {
        // 获取Person类的Class对象
        Class<?> personClass = Person.class;

        // 获取构造方法并创建对象实例
        Constructor<?> constructor = personClass.getConstructor(String.class, int.class);
        Object personObject = constructor.newInstance("Alice", 25);

        // 获取并调用sayHello方法
        Method sayHelloMethod = personClass.getMethod("sayHello");
        sayHelloMethod.invoke(personObject);

        // 通过反射获取和修改字段的值
        Field nameField = personClass.getDeclaredField("name");
        nameField.setAccessible(true);
        String name = (String) nameField.get(personObject);
        System.out.println("Name retrieved by reflection: " + name);

        nameField.set(personObject, "Bob");
        System.out.println("Name updated by reflection. New name: " + ((Person) personObject).getName());
    }
}
