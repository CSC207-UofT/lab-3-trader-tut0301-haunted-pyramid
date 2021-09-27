public class Wolf implements Domesticatable, Tradable {
    public Wolf(){}
    @Override
    public String sound(){
        return "awhooooo";
    }

    @Override
    public int getPrice(){
        return 14;
    }
}
