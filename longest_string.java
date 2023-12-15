import java.util.*;
public class longest_string{
    public static void main( String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any string");
        String s1 = sc.nextLine();
        

        String longestword = long_Word(s1);
        System.out.println(longestword);
                
    }

    public static String long_Word(String sent){
        String [] s_Word = sent.split("\\s+");
        String long_Word = " ";

    
        for (String word: s_Word){
            if (word.length()>long_Word.length()){
                long_Word = word;
            }
        }
        return long_Word;
    }
}