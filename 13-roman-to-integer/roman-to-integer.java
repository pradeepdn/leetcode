class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> rom = new HashMap<>();

        rom.put('I', 1);
        rom.put('V', 5);
        rom.put('X', 10);
        rom.put('L', 50);
        rom.put('C', 100);
        rom.put('D', 500);
        rom.put('M', 1000);

        int result = 0;
            for(int i= s.length()-1; i>=0; i--){
                if (i == s.length()-1){
                    result = rom.get(s.charAt(i));
                } else if (rom.get(s.charAt(i)) < rom.get(s.charAt(i+1))){
                    result = result - rom.get(s.charAt(i));
                }else {
                    result = result + rom.get(s.charAt(i));
                }
                    
            }
        return result;
    } 
}