package com.company;

public class Skeleton extends Boss{
    private int amountOfArrows;

    public Skeleton(int health, int damage, int amountOfArrows) {
        super(health, damage);
        this.amountOfArrows = amountOfArrows;
    }

    public int getAmountOfArrows() {
        return amountOfArrows;
    }

    public void setAmountOfArrows(int amountOfArrows) {
        this.amountOfArrows = amountOfArrows;
    }
    public String getInfo() {

        return super.getInfo()+" "+"Amount of arrows : "+amountOfArrows;
    }
}
