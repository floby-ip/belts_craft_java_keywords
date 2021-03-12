package animals;

import java.io.*;

public class Cat implements Animal, Serializable {

    private static final String MIAOU = "Miaou!";
    private String name;
    private Double height;
    private Double weight;

    // keyword transient
    // Ce champ n'est pas utile à la serialisation
    private transient String description;

    public Cat(String name, String description, double height, double weight){
        this.name = name;
        this.description = description;
        this.height = height;
        this.weight = weight;
    }

    public String getDescription(){
        return description;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Double getHeight() {
        return height;
    }

    @Override
    public Double getWeight() {
        return weight;
    }

    @Override
    public String talk() {
        return MIAOU;
    }

    @Override
    public boolean canEat(Food food) {
        assert food != null : "food must not be null";
        return food.canEat(this);
    }

    public String toString(){
        return String.format("%s is a %s. %s it says. It is %.2f cm tall and weighs %.2f kg. Description : %s",
                this.name, this.getClass().getSimpleName(), talk(), this.height, this.weight, description);
    }

    // keyword void
    // keyword try
    // keyword catch
    // keyword finally
    public void serialize(String fileName){
        String path = "./tmp/"+fileName;
        new File("./tmp").mkdir();
        File file = new File(path);
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))){
            // sérialization de l'objet
            oos.writeObject(this);
        } catch (FileNotFoundException fnfe){
            System.err.println("Serialization : Couldn't open file "+ path + " => " + fnfe.getMessage());
        } catch (IOException ioe){
            System.err.println("Serialization : Error writing to file "+ path + " => " + ioe.getMessage());
        } finally {
            System.out.println("Serialization : Ended serialization");
        }
    }

    public static Cat deserialize(String fileName){
        String path = "./tmp/"+fileName;
        File file = new File(path);
        Cat cat = null;
        try(ObjectInputStream ois =  new ObjectInputStream(new FileInputStream(file))){
            cat = (Cat)ois.readObject() ;
        } catch (FileNotFoundException fnfe){
            System.err.println("Deserialization : Couldn't open file "+ path + " => " + fnfe.getMessage());
        } catch (IOException ioe) {
            System.err.println("Deserialization : Error reading file " + path + " => " + ioe.getMessage());
        }catch (ClassNotFoundException cnfe){
            System.err.println("Deserialization : Cannot find class => " + cnfe.getMessage());
        } finally {
            System.out.println("Ended deserialization");
        }
        return cat;
    }
}
