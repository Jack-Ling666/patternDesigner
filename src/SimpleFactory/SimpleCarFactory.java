package SimpleFactory;

/**
 * 简单工厂模式，不属于27种设计模式，但是是工厂模式的基础
 */
public class SimpleCarFactory implements Car {
    @Override
    public String getCarName(String name) {
        if("Benz".equals(name))
            return "Benz";
        else if("Baoma".equals(name))
            return "Baoma";
        else if("Falali".equals(name))
            return "Falali";
        return null;
    }
}
