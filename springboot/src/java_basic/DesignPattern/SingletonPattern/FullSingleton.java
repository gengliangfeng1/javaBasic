package java_basic.DesignPattern.SingletonPattern;

class FullSingleton {
    // 1. 私有静态变量，初始值为null
    private static volatile FullSingleton instance;
    // 2. 私有构造函数
    private FullSingleton() {}
    // 3. 公有静态方法，用于获取单例实例
    public static FullSingleton getInstance() {
        if (instance == null) {
            synchronized (FullSingleton.class) {
                if (instance == null) {
                    instance = new FullSingleton();
                }
            }
        }
        return instance;
    }
}
