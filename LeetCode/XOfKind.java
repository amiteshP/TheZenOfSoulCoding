import java.util.*;

class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        if(deck.length<2)
        	return false;
        boolean res = true;
        Map<Integer, Integer> hMap = new HashMap<>();
        
        for(int i=0; i<deck.length; i++)
        	hMap.put(deck[i], hMap.getOrDefault(deck[i], 0)+1);
        
        Iterator it = hMap.entrySet().iterator();

        int lcmVal ;
        int[] arr = new int[deck.length];
        int c = 0;
        while(it.hasNext())
        {
        	Map.Entry<Integer, Integer> me = (Map.Entry)it.next();
        	arr[c] = me.getValue();
        	c++;
        }
        lcmVal = lcm(arr);

        it = hMap.entrySet().iterator();
        
        while(it.hasNext())
        {
        	Map.Entry<Integer, Integer> me = (Map.Entry)it.next();
        	if(me.getValue()<2 || me.getValue()%lcmVal!=0)
        	{
        		res = false;
        		break;
        	}
        }
        return res;
    }

 public static int gcd(int x, int y) {
    return (y == 0) ? x : gcd(y, x % y);
}

public static int gcd(int... numbers) {
    return Arrays.stream(numbers).reduce(0, (x, y) -> gcd(x, y));
}

public static int lcm(int... numbers) {
    return Arrays.stream(numbers).reduce(1, (x, y) -> x * (y / gcd(x, y)));
}
}