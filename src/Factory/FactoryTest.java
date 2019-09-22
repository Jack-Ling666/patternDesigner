package Factory;

public class FactoryTest {
    public static void main(String[] args) {

        /**
         * 不足是需要去记住使用哪个工厂名字
         */
        System.out.println(new BenzFactory().getCarName());
    }
}
