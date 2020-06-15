package animals;

public class Chihuahua extends Dog {

    protected String wouf = "GRRRRRRrrrr!";

    public Chihuahua(String name){
        super(name, 20, 6);
    }

    @Override
    public String talk(){
        return wouf;
    }

}
