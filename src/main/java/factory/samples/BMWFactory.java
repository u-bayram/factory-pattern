package factory.samples;

/**
 * @author umut.bayram
 */
public class BMWFactory extends CarFactory {
    public void createAuto() {
        getCars().add(new BMW116D());
    }
}
