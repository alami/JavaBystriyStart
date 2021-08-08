package javabystriystart.HF03decorator;
abstract class Beverage {
    public String description = "Unknown Напиток";
    public Boolean milk;
    public Boolean soy;
    public Boolean mocha; //мокко - шоколад,
    public Boolean whip;  //взбивать сливки,
    public String getDescription() {
        return description;
    }

    public void setMilk(Boolean milk) {
        this.milk = milk;
    }

    public void setSoy(Boolean soy) {
        this.soy = soy;
    }

    public void setMocha(Boolean mocha) {
        this.mocha = mocha;
    }

    public void setWhip(Boolean whip) {
        this.whip = whip;
    }
    
    abstract public double cost();
}
