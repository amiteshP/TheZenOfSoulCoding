//https://leetcode.com/problems/top-k-frequent-words/description/
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> hMap = new HashMap<>();
        for(String word: words){
        	hMap.put(word, hMap.getOrDefault(word, 0)+1);
        }

        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(new priorityComparator());

        pq.addAll(hMap.entrySet());

        while(pq.size()>k)
        	pq.poll();

        List<String> list = new ArrayList<>();
        while(!pq.isEmpty())
        {
        	list.add(pq.poll().getKey());
        }
        return list;
    }
}

class priorityComparator implements Comparator<Map.Entry<String, Integer>>{
	@Override
	public int compare(Map.Entry<String, Integer> w1, Map.Entry<String, Integer> w2){
		if(w1.getValue()<w2.getValue())
		{
			return -1;
		}
		else if(w1.getValue()>w2.getValue())
		{
			return 1;
		}
		else if(w1.getValue() == w2.getValue())
		{
			int r = w2.getKey().compareTo(w1.getKey());
			if(r>0)
				return 1;
			else 
				return -1;
		}
		return 0;
	}
}