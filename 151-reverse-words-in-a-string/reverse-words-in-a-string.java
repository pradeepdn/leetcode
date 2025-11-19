class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String myS = "";
        String[] ss = s.split("\\s+");
        
        for(int i= ss.length-1; i>=0; i--){
            myS = myS + " " + ss[i];
        }
    return myS.trim();
    }
}