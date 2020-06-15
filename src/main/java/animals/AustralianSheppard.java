package animals;

public class AustralianSheppard extends Dog {

    private static final String wouf = "WOUAF! WOUAF!";

    public AustralianSheppard(String name, double height, double weight){
        super(name);
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String talk(){
        return wouf;
    }

}
