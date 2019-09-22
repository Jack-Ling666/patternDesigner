package SimpleFactory;

public class SimpleCarTest {
    public static void main(String[] args) {
        SimpleCarFactory simpleCarFactory = new SimpleCarFactory();
        System.out.println(simpleCarFactory.getCarName("Benz"));
    }
}
