package main;

import animals.*;
import keywords.KeywordsMain;
import primitiveTypes.PrimitiveTypes;
import threadWorks.synchronization.SynchronizationMain;
import threadWorks.volatility.VolatilityMain;
import usingNative.MyNativeMethods;

import java.util.*;

public class Main {

    public final static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        System.out.println("What do you want to do ?");
        System.out.println("1) See keywords");
        System.out.println("2) See animals");
        System.out.println("3) See threads Sync");
        System.out.println("4) See threads Volatility");
        System.out.println("5) See Primitive types");
        System.out.println("6) See Native methods");
        System.out.println("*) Exit");
        Integer res = keyboard.nextInt();
        switch (res){
            case 1 : KeywordsMain.whereToFind();break;
            case 2 : AnimalsMain.mainAnimals();break;
            case 3 : SynchronizationMain.threadsSynchronization();break;
            case 4 : VolatilityMain.threadsVolatility();break;
            case 5 : PrimitiveTypes.main();break;
            case 6 : MyNativeMethods.main();break;
            default: return;
        }
        main(args);
    }

}
