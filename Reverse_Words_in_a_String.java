import java.util.*;
public class Reverse_Words_in_a_String {
    public String reverseWords(String s) {
        
        String str2 = s;
        List<String> list = new ArrayList<>();
        for(int i=0;i<s.length();i++){
                if(s.charAt(i) == ' '){
                    continue;
                }
                int j = i;
                String temp = "";
                while( j < str2.length() && str2.charAt(j) != ' '){
                    temp = temp + String.valueOf(str2.charAt(j));
                    j++;
                }
                list.add(temp);
                i = j;
        }
        String output = "";
        for(int i=list.size()-1;i>=0;i--){
            output = output + list.get(i);
            if(i != 0){
               output += " "; 
            }
        }
        
        return output;
    }
}
