package softeng.commandPattern;

public class CatFoodDispenser extends Device{
    private int foodLvl;

    public CatFoodDispenser() {
        this.foodLvl = 100;
    }
    public void dispense() {
        foodLvl--;
    }
    public int getFoodLvl() {
        return foodLvl;
    }
    public void refill(int foodLvl) {
        this.foodLvl = foodLvl;
    }
}
