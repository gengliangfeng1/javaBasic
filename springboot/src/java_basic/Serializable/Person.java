package java_basic.Serializable;

import java.io.Serializable;

// 实现Serializable接口，表明该类可以被序列化
class Person implements Serializable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
