public class Remove_Outermost_Parentheses {
    public String removeOuterParentheses(String s) {
        
        String output = "";
        String str2 = s;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i) == '('){
                int open = 1;
                int j = i+1;
                while(open > 0 && open < s.length()){
                    if(str2.charAt(j) == ')'){
                        open--;
                    }
                    else{
                        open++;
                    }
                    if(open != 0){
                      j++;  
                    }
                }
                output = output + s.substring(i+1,j);
                i = j;
            }
        }
        
        return output;
    }
}
