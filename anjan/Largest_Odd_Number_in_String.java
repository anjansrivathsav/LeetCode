class Solution {
    
    public String convertInt(String str){
    
            int val = str.charAt(str.length()-1) - '0';
            if(val % 2 != 0){
                return str;
            }
        
        return "";
    }

    public String largestOddNumber(String num) {
        
        for(int i=num.length();i>0;i--){
            String substr = num.substring(0,i);
            String val = convertInt(substr);
            if(val != ""){
                return val;
            }
        }
        
        return "";
    }
    

}