package java_basic;

public class BasicDataType {


    public static void main(String[] args) {
        byte byteData = 1; // 1 byte  -2^7 to 2^7-1
        short shortType = 1;// 2 bytes -2^15 to 2^15-1
        int intType = 1;// 4 bytes -2^31 to 2^31-1
        long longType = 1;// 8 bytes -2^63 to 2^63-1

        float floatType = 1.0f;// 4 bytes
        double doubleType = 123;// 8 bytes

        char charType = 'c';// 2 bytes
        boolean booleanType = true;// 1 byte

        // Implicit conversion
        short s = byteData;
        int i = shortType;
        long l = intType;

        double d = floatType;

        // Explicit conversion
        int num = 127;
        byte b = (byte)num;
        System.out.println("explicit result from 127:" + b);
        System.out.println("explicit result from 128:" + (byte)128);


    }



}
