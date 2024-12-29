package java_basic.FinishExample.oop.extend;

public class Child extends Parent {
    public Child() {
        super();
        // 子类构造函数体
    }
    public String publicVar = "ChildPublicVar";
    private String privateVar = "childPrivateVar";
    public void accessMembers() {
        System.out.println("访问父类的public变量: " + publicVar);
        System.out.println("访问父类的protected变量: " + protectedVar);
    }
}
