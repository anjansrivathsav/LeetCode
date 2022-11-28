class Solution {
    public boolean rotateString(String s, String goal) {
     
        
        for(int i=0;i<s.length();i++){
            String str = s.substring(0,i+1);
            String str2 = s.substring(i+1,s.length());
            String mainstr = str2+str;
            if(mainstr.equals(goal)){
                return true;
            }
        }
        return false;
    }
}