class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length()) return false;
        Hashtable<Character,Integer> h1=new Hashtable<>();
        Hashtable<Character,Integer> h2=new Hashtable<>();
        for (char c : s.toCharArray()) {
            h1.put(c, h1.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            h2.put(c, h2.getOrDefault(c, 0) + 1);
        }
        return h1.equals(h2);
    }
}
