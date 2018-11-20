public class AfricainParrot extends Parrot {

    public AfricainParrot(int numberOfCoconuts) {
        super(ParrotTypeEnum.AFRICAN, numberOfCoconuts, 0, false);
    }

    @Override
    public double getSpeed() {
        return Math.max(0, this.getBaseSpeed() - this.getLoadFactor() * this.getNumberOfCoconuts());
    }
}
