import java.util.HashMap;
import java.util.Map;

public class Solution {
    public  static int romanToInt(String s) {
        int result = 0;
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        for(int i = s.length() - 1; i >= 0; i--)
        {
            if ((i  == s.length() - 1) || (map.get(s.charAt(i)) >= map.get(s.charAt(i+1))))
                result += map.get(s.charAt(i));
                else
                result -= map.get(s.charAt(i));
        }
        return result;
    }
}
