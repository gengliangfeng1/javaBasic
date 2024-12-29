package java_basic.ShallowCopy;

import jdk.nashorn.internal.parser.JSONParser;

public class test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee e1 = new Employee("aaa", 12, new Address("aaaaa", 1111));
        System.out.println(e1);
        Employee e2 = e1;
        Employee eClone = (Employee) e1.clone();
        System.out.println(eClone);
        eClone.setId(10);
        eClone.setName("ccc");
        eClone.getAddress().setStreetId(132);
        eClone.getAddress().setStreetName("ccccc");
        System.out.println("e1:");
        System.out.println(e1);
        System.out.println(e1.address.streetId);
        System.out.println("e2:");
        System.out.println(e2.address.streetId);
        System.out.println(e2);
        System.out.println("eClone:");
        System.out.println(eClone.address.streetId);
        System.out.println(eClone);
    }

}