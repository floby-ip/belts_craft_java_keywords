package animals;

public class Rabbit implements Animal {
    @Override
    public String getName() {
        return null;
    }

    @Override
    public Double getHeight() {
        return null;
    }

    @Override
    public Double getWeight() {
        return null;
    }

    @Override
    public String talk() {
        return "NiaNia!";
    }

    @Override
    public boolean canEat(Food food) {
        assert food != null : "food cannot be null for the Rabbit";
        return food.canEat(this);
    }
}
