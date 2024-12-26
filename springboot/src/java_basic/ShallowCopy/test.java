package java_basic.ShallowCopy;

public class test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee e1 = new Employee("aaa", 12, new Address("aaaaa", 1111));
        System.out.println(e1);
        Employee e2 = e1;
        System.out.println(e2);
        e2.setId(11);
        e2.setName("bbb");
        e2.getAddress().setStreetId(112);
        e2.getAddress().setStreetName("bbbbb");
        System.out.println(e1);
        System.out.println(e2);


        Employee e22 = (Employee) e1.clone();
        System.out.println(e22);
        e22.setId(10);
        e22.setName("ccc");
        e22.getAddress().setStreetId(132);
        e22.getAddress().setStreetName("ccccc");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e22);
    }

}