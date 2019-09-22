package SingletonMode.Register;

import java.util.HashMap;
import java.util.Map;

/**
 * 容器注册单例模式，IOC容器就是使用这种模式
 */
public class RegisterMap {
    public static Map<String,Object> map = new HashMap<>();

    private RegisterMap(){}

    public static Object getInstance(String name){
        synchronized (map) {
            if (name == null)
                name = RegisterMap.class.getName();
            if (map.get(name) == null) {
//                    map.put(name, Class.forName(name));
                    map.put(name,new RegisterMap());
            }
            return map.get(name);
        }
    }
}
