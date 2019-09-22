package Factory;

/**
 * 工厂模式，创建各个汽车的工厂
 */
public class BenzFactory implements Factory {
    @Override
    public String getCarName() {
        return "Benz";
    }
}
