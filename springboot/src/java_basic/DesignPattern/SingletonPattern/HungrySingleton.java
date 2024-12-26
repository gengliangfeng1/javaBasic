package java_basic.DesignPattern.SingletonPattern;

class HungrySingleton {
    // 1. 私有静态变量，在类加载时就创建好实例
    private static HungrySingleton instance = new HungrySingleton();
    // 2. 私有构造函数，防止外部类通过new关键字创建实例
    private HungrySingleton() {}
    // 3. 公有静态方法，用于获取单例实例
    public static HungrySingleton getInstance() {
        return instance;
    }
}