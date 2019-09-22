package SingletonMode.LazyMode;

/**
 * 饿汉式，使用到实例的时候才进行初始化，线程不安全,需要加锁
 */
public class Lazy {
    private Lazy(){}

    private static Lazy lazy = null;

    public static Lazy getInstance(){
        synchronized (Lazy.class){
        if(lazy == null){
            lazy = new Lazy();
        }
        return lazy;
    }
    }

}
