class Solution {
    public boolean isAnagram(String s, String t) {
     
        Map<Character,Integer> maps = new HashMap<>();
        Map<Character,Integer> mapt = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            if(maps.containsKey(s.charAt(i))){
                int val = maps.get(s.charAt(i));
                maps.put(s.charAt(i),val+1);
            }
            else{
                maps.put(s.charAt(i),1);
            }
        }
        
        
        for(int i=0;i<t.length();i++){
            if(mapt.containsKey(t.charAt(i))){
                int val = mapt.get(t.charAt(i));
                mapt.put(t.charAt(i),val+1);
            }
            else{
                mapt.put(t.charAt(i),1);
            }
        }
        
        if(maps.equals(mapt)){
            return true;
        }
        else{
            return false;
        }
        
        
        
    }
}