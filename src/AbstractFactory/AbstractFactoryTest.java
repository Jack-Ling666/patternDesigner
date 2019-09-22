package AbstractFactory;

/**
 * 抽象方法模式，在抽象方法中可以添加一些公用的逻辑
 * 可扩展性强
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        System.out.println(new CarFactory().getBaomaName());
    }
}
