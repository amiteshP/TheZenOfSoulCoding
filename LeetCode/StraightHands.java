class Solution {
    public boolean isNStraightHand(int[] hand, int W) {
    	if((hand.length%W)!=0)
    		return false;
 		HashMap<Integer, Integer> hMap = new HashMap<>();
 		Arrays.sort(hand);
 		for(int i=0; i<hand.length; i++){
 			hMap.put(hand[i], hMap.getOrDefault(hand[i], 0)+1);
 		}       
 		for(int i=0; i<hand.length; i++){
 			int curr = hand[i];
 			if(hMap.containsKey(curr))
 			{
 				for(int j=0; j<W; j++){
 					if(!hMap.containsKey(curr+j))
 						return false;
 					else
 						hMap.put(curr+j, hMap.get(curr+j)-1);

 					if(hMap.get(curr+j)<=0)
 						hMap.remove(curr+j);
 				}
 			}
 		}
 		if(hMap.size()==0)
 			return true;
 		return false;
    }
}