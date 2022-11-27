    class Solution {
        public String longestCommonPrefix(String[] strs) {
            
            String small = "";
            int size = Integer.MAX_VALUE;
            
            for(int i=0;i<strs.length;i++){
                    if(strs[i].length() < size ){
                        size = strs[i].length();
                        small = strs[i];
                    }
            }
            String substr = "";
            boolean flag = false;
            for(int i=0;i<size;i++){
                substr = small.substring(0,size-i);
                int count=0;
                for(int j=0;j<strs.length;j++){
                    if(strs[j].substring(0,size-i).equals(substr)){
                        count++;
                    }
                }
                if(count == strs.length){
                    flag = !flag;
                    break;
                }
            }
            if(flag){
                return substr;
            }
            
            return "";
        }
    }
