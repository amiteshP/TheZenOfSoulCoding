//https://leetcode.com/problems/sort-characters-by-frequency/description/

class Solution {
    public String frequencySort(String s) {
 		Map<Character, Integer> hMap = new HashMap<>();
 		char[] sc = s.toCharArray();
 		
 		for(char c: sc){
 			if(hMap.get(c)!=null){
 				hMap.put(c, hMap.get(c)+1);
 			}
 			else
 				hMap.put(c, 1);
 		}
 		
 		PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(new priorityComparator());
        
        pq.addAll(hMap.entrySet());

        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()){
        	Map.Entry e = pq.poll();
        	for(int i=0; i<(int)e.getValue(); i++){
        		sb.append(e.getKey());
        	}
        }
        return sb.toString();
    }

    class priorityComparator implements Comparator<Map.Entry<Character, Integer>>{
    	public int compare(Map.Entry<Character, Integer> c1, Map.Entry<Character, Integer> c2){
    		return c2.getValue()-c1.getValue();
    	}
    }

}