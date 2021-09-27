public class Lion implements Domesticatable, Tradable{

    public Lion(){
        int max_speed = 10;
    }

    @Override
    public String sound() { return "Roarr!";}

    @Override
    public int getPrice() { return 100;}


}
