public class AfricainParrot extends Parrot {

    private static final double DEFAULT_LOAD_FACTOR = 9.0;
    private int numberOfCoconuts;

    AfricainParrot(int numberOfCoconuts) {
        super(ParrotTypeEnum.AFRICAN, 0, false);
        this.numberOfCoconuts = numberOfCoconuts;
    }

    @Override
    public double getSpeed() {
        return Math.max(0, this.getBaseSpeed() - DEFAULT_LOAD_FACTOR * this.numberOfCoconuts);
    }

}
