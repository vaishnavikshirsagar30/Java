import java.util.Arrays;
import java.util.List;
  
public class vowels
{    
    static String remVowel(String str)
    {
         return str.replaceAll("[aeiouAEIOU]", "");
    }
      
    public static void main(String[] args) 
    {
        String str = "Computer Science and engineering";        
        System.out.println(remVowel(str));
    }
}