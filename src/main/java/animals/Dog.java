package animals;

public abstract class Dog implements Animal {

    // keyword private
    // keyword static => same between instances of the class
    // keyword final => cannot be changed
    protected String name;
    protected Double height = 120.;
    protected Double weight = 80.;

    public Dog(String name){
        this.name = name;
    }

    public Dog(String name, double height, double weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public abstract String talk();

    @Override
    public boolean canEat(Food food){
        assert food != null : "food must not be null";
        return food.canEat(this);
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public Double getHeight(){
        return height;
    }

    @Override
    public Double getWeight(){
        return weight;
    }

    public String toString(){
        return String.format("%s is a %s. %s it says. It is %.2f cm tall and weighs %.2f kg.",
                this.name, this.getClass().getSimpleName(), talk(), this.height, this.weight);
    }

}
