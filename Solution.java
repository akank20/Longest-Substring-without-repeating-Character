class Solution {
    public int lengthOfLongestSubstring(String s) {
         int slen=s.length();
        int res=0;
        int i=0,j=0;
        HashSet<Character> subs=new HashSet<>();
        for(;i<slen && j<slen;)
        {
            if(!subs.contains(s.charAt(j)))
            {
                subs.add(s.charAt(j));
                j++;
                res=Math.max(res,j-i);
            }
            else
            {
                subs.remove(s.charAt(i));
                i++;
            }
            
        }
        return res;
    }   
}

public class MainClass {
    public static String stringToString(String input) {
        if (input == null) {
            return "null";
        }
        return Json.value(input).toString();
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String s = stringToString(line);
            
            int ret = new Solution().lengthOfLongestSubstring(s);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
