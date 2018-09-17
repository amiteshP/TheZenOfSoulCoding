import java.util.*;

class winningCandidate{
	static public void main(String args[]){
		String[] arr = {"Amitesh", "Amitesh", "Bob", "Christine", "Amitesh"};
		System.out.println(returnWinner(arr));
	}
	public static String returnWinner(String[] votes){
		HashMap<String, Integer> hMap = new HashMap<>();
		for(String str: votes){
			if(hMap.get(str)!=null){
				hMap.put(str, hMap.get(str)+1);
			}
			else
				hMap.put(str, 1);
		}
		PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(new WinnerComparator());
		pq.addAll(hMap.entrySet());
		return pq.poll().getKey();

	}


}

class WinnerComparator implements Comparator<Map.Entry<String, Integer>>{
	@Override
	public int compare(Map.Entry<String, Integer> m1, Map.Entry<String, Integer> m2){
		if(m1.getValue()>m2.getValue())
		{
			return -1;
		}
		else if(m1.getValue()<m2.getValue())
		{
			return 1;
		}
		else if(m1.getValue() == m2.getValue())
		{
			int r = m2.getKey().compareTo(m1.getKey());
			if(r>0)
				return 1;
			else 
				return -1;
		}
		return 0;

	}
}