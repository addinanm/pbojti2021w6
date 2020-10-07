package percobaan3;

public class Tabung extends Bangun{
    protected int t;

    public void setT(int t) {
        this.t = t;
    }

    public void setSuperPhi(double phi) {
        this.phi = phi;
    }

    public void setSuperR(int r) {
        this.r = r;
    }
    
    public void volume(){
        System.out.println("Volume Tabung adalah :" + (super.phi*super.r*super.r*this.t));
    }
}
