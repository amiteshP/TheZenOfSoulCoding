//https://leetcode.com/problems/top-k-frequent-elements/description/
class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {

		List<Integer> list = new ArrayList<>();

    	if(nums == null) 
    		return list;
		
		HashMap<Integer, Integer> hMap = new HashMap<>();

		for(int num: nums){
			hMap.put(num, hMap.getOrDefault(num, 0)+1);
		}

		PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((entry1, entry2) -> entry2.getValue() - entry1.getValue());

		pq.addAll(hMap.entrySet());

		for(int i=0; i<k; i++){
			list.add(pq.poll().getKey());
		}
		return list;        
    }
}
/**
class priorityComparator implements Comparator<Map.Entry<Integer, Integer>>{
	@Override
	public int compare(Map.Entry<Integer, Integer> e1, Map.Entry<Integer, Integer> e2){
		return e2.getValue()-e1.getValue(); 
	}
}**/