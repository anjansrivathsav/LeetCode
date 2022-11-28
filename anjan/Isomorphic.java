class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map = new HashMap<>();
        Map<Character,Character> valuemap = new HashMap<>();
        for(int i=0;i<s.length();i++){
                if(map.keySet().contains(s.charAt(i))){
                    char ch = map.get(s.charAt(i));
                    if(ch != t.charAt(i)){
                        return false;
                    }
                }
                else {
                    if(valuemap.keySet().contains(t.charAt(i))){
                        char ch = valuemap.get(t.charAt(i));
                        if(s.charAt(i) != ch){
                            return false;
                        }
                    }

                    map.put(s.charAt(i),t.charAt(i));
                    valuemap.put(t.charAt(i),s.charAt(i));
                }
        }
        
        return true;
    }
}