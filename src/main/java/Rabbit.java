public class Rabbit implements Drivable, Domesticatable, Tradable {
    private double maxSpeed;

    public Rabbit() {
        this.maxSpeed = 0.3;
    }

    @Override
    public String sound() {
    return "Que Que";
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed = this.maxSpeed + 3;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed = this.maxSpeed - 4;
    }

    @Override
    public int getMaxSpeed() {
        return (int) this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 5;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }
}