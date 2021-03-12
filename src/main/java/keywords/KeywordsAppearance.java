package keywords;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class KeywordsAppearance {

    private static final String NOT_YET_USED = "Not Yet Used";
    private static final Map<String, String> keywordsAppearance = initMap();

    private static Map initMap() {
        Map keywords = new HashMap<>();
        keywords.put("abstract", "animals.Dog");
        keywords.put("continue", "Main.mainAnimals");
        keywords.put("for", "Main.whereToFind");
        keywords.put("new", "Main.mainAnimals");
        keywords.put("switch", "Main.whereToFind");
        keywords.put("assert", "animals.Rabbit.canEat");
        keywords.put("default", "Main.whereToFind");
        keywords.put("goto", "Unused in Java");
        keywords.put("package", "animals.Animal");
        keywords.put("synchronized", "threadWorks.synchronization.ThreadWorkerSynchronized");
        keywords.put("boolean", "animals.Food");
        keywords.put("do", "Main.whereToFind");
        keywords.put("if", "Main.mainAnimals");
        keywords.put("private", "keywords.KeywordsAppearance");
        keywords.put("this", "animals.Cat.toString");
        keywords.put("break", "Main.whereToFind");
        keywords.put("double", "animals.AustralianSheppard");
        keywords.put("implements", "animals.Rabbit");
        keywords.put("protected", "animals.Dog");
        keywords.put("throw", "animals.Food.canEat");
        keywords.put("byte", "primitiveTypes.PrimitiveTypes");
        keywords.put("else", "threadWorks.volatility.ThreadIncrementer");
        keywords.put("import", "keywords.KeywordsAppearance");
        keywords.put("public", "keywords.KeywordsAppearance.getKeywordAppearance");
        keywords.put("throws", NOT_YET_USED);
        keywords.put("case", "Main.whereToFind");
        keywords.put("enum", "animals.Food");
        keywords.put("instanceof", "Main.mainAnimals");
        keywords.put("return", "keywords.KeywordsAppearance.getKeywordAppearance");
        keywords.put("transient", "animals.Cat");
        keywords.put("catch", "animals.Cat.serialize");
        keywords.put("extends", "animals.Chihuahua");
        keywords.put("int", "primitiveTypes.PrimitiveTypes");
        keywords.put("short", "primitiveTypes.PrimitiveTypes");
        keywords.put("try", "animals.Cat.serialize");
        keywords.put("char", "threadWorks.synchronization.ThreadWorker");
        keywords.put("final", "animals.Cat");
        keywords.put("interface", "animals.Animal");
        keywords.put("static", "keywords.KeywordsAppearance");
        keywords.put("void", "animals.Cat.serialize");
        keywords.put("class", "animals.Cat");
        keywords.put("finally", "animals.Cat.serialize");
        keywords.put("long", "primitiveTypes.PrimitiveTypes");
        keywords.put("strictfp", "primitiveTypes.PrimitiveTypes");
        keywords.put("volatile", "threadWorks.volatility.Counter");
        keywords.put("const", "Unused in java");
        keywords.put("float", "primitiveTypes.PrimitiveTypes");
        keywords.put("usingNative", NOT_YET_USED);
        keywords.put("super", "animals.AustralianSheppard");
        keywords.put("while", "Main.whereToFind");
        return keywords;
    }

    public static String getKeywordAppearance(String s){
        return KeywordsAppearance.keywordsAppearance.get(s);
    }

    public static String getKeywords(){
        return KeywordsAppearance.keywordsAppearance.keySet().toString();
    }
    
    public static String getNotYetUsed(){
        return keywordsAppearance.entrySet().stream()
                .filter(entry -> NOT_YET_USED.equals(entry.getValue()))
                .map(entry -> entry.getKey())
                .collect(Collectors.joining(", "));
    }
}
