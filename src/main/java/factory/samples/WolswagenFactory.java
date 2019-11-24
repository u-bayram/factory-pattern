package factory.samples;

/**
 * @author umut.bayram
 */
public class WolswagenFactory extends CarFactory {
    public void createAuto() {
        getCars().add(new WolswagenPolo());
        getCars().add(new WolswagenGolf());
    }
}
