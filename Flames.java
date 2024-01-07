import java.util.*;
public class Flames{
    public static void main( String arg[] ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Name");
        String name1=sc.next();
        System.out.println("Enter the Second Name");
        String name2=sc.next();
        int remainingletters = getRemainingLetters(name1, name2);
        String flames = "FLAMES";
        System.out.println(remainingletters%flames.length()==0?'S':flames.charAt((remainingletters%flames.length())-1));

        sc.close();
    }
    public static int getRemainingLetters(String name1, String name2)
    {
        StringBuilder builder1 = new StringBuilder(name1);
        StringBuilder builder2 = new StringBuilder(name2);
        for(int i=0; i<name1.length(); i++)
        {
            char c = name1.charAt(i);
           if(builder2.indexOf(c+"")!=-1)
           {
                builder1.deleteCharAt(builder1.indexOf(c+""));
                builder2.deleteCharAt(builder2.indexOf(c+""));
           }
        }
        return builder1.length()+builder2.length();
    }
}