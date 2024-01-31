package ie.atu.productv5;

public class Tv extends Product{

    private int screenSize;
    private String Manufacture;

    public Tv() {
        super();
        screenSize = 0;
        Manufacture=" ";
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public String getManufacture() {
        return Manufacture;
    }

    public void setManufacture(String manufacture) {
        Manufacture = manufacture;
    }

    @Override
    public String toString() {return super.toString() + " by " + Manufacture +"\n"+ "Screen size is" + screenSize;}
}
