package java_basic;

public class Immutable {

    private final int x;
    private final int y;
    public Immutable(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        // Immutable String Integer BigInteger BigDecimal
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2);

        Integer num = 10;

        Immutable i = new Immutable(1,2);


    }
}
