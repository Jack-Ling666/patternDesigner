package SingletonMode.HungryMode;

/**
 * 饿汉式，还没使用到实例就先初始化好，线程安全
 */
public class Hungry {
    private Hungry(){}

    private static Hungry instance = new Hungry();

    public static Hungry getInstance(){
        return instance;
    }
}
