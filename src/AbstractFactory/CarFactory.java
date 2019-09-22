package AbstractFactory;

public class CarFactory extends AbstractFactory {
    @Override
    String getBenzName() {
        return "Benz";
    }

    @Override
    String getBaomaName() {
        return "Baoma";
    }

    @Override
    String getFalaliName() {
        return "Falali";
    }
}
