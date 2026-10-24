class Solution {

    public String encode(List<String> strs) {
        String c=new String();
            for(String s:strs){
                c = c + s.length() + "#" + s;
            }
            return c;
    }

    public List<String> decode(String str) {
 String s = "";
            List<String> l = new ArrayList<>();

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '#') {
                    int length = Integer.parseInt(s);
                    s = "";

                    for (int j = 0; j < length; j++) {
                        s = s + str.charAt(i + 1 + j);
                    }

                    l.add(s);
                    s = "";
                    i = i + length;
                } else {
                    s = s + str.charAt(i);
                }
            }

            return l;
    }
}
