package java_basic;

public class Rewrite {
    class Father{
        public String func(){
            return "Father";
        }
    }

    class Son extends Father{
        @Override
        public String func(){
            return "Son";
        }
    }

    public void test() {
        Son son = new Son();
        System.out.println(son.func());
    }

    public static void main(String[] args) {
        Rewrite rewrite = new Rewrite();
        rewrite.test();
    }
}
