package keywords;

import java.util.Scanner;

public class KeywordsMain {
    public static void whereToFind(){
        String keyword = "";
        do{
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Find where your keyword is used.");
            System.out.println("For a list, type \"list\"");
            System.out.println("For not yet used keywords, type \"not_yet\"");
            System.out.println("To exit, type \"exit\"");
            System.out.println("Keyword : ");
            keyword = keyboard.nextLine();

            switch (keyword){
                case "exit":
                    System.out.println("Goodbye!");
                    break;
                case "list":
                    System.out.println(KeywordsAppearance.getKeywords());
                    break;
                case "not_yet":
                    System.out.println(KeywordsAppearance.getNotYetUsed());
                    break;
                default:
                    String usage = KeywordsAppearance.getKeywordAppearance(keyword);
                    System.out.println("\"" + keyword +"\"" + (usage != null ? " is used in " + usage : " is not a Java keyword"));
            }
        }while(!keyword.equals("exit"));
    }
}
