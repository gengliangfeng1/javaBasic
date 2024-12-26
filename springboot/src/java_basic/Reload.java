package java_basic;

public class Reload {
    public Integer func(int a, int b){
    return a + b;
    }
    public String func(String a, int b){
        return a + String.valueOf(b);
    }
    public String func(String b){
        return b;
    }

    public static void main(String[] args) {
        Reload reload1 = new Reload();
        System.out.println(reload1.func( 1,2));
        System.out.println(reload1.func("string"));
    }
}



