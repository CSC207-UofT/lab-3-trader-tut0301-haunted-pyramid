public class Porche implements Drivable, Domesticatable, Tradable {
    @Override
    public String sound() {
        return "Vroom Vroom";
    }

    @Override
    public void upgradeSpeed() {

    }

    @Override
    public void downgradeSpeed() {

    }

    @Override
    public int getMaxSpeed() {
        return 450;
    }

    @Override
    public int getPrice() {
        return 340000;
    }
}
