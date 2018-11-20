public class EuropeanParrot extends Parrot {

    EuropeanParrot() {
        super(ParrotTypeEnum.EUROPEAN, 0, false);
    }

    @Override
    public double getSpeed() {
        return this.getBaseSpeed();
    }
}
