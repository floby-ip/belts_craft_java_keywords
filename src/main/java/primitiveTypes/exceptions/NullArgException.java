package primitiveTypes.exceptions;

public class NullArgException extends Exception {

    public NullArgException(Class clazz, String method, String arg ){
        super(String.format("Argument %s can't be null for method %s of class %s", arg, method, clazz.getSimpleName()));
    }

}
