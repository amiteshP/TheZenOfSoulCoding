//https://leetcode.com/problems/kth-largest-element-in-a-stream/description/

class KthLargest {
	private PriorityQueue<Integer> pq;
    public KthLargest(int k, int[] nums) {
        pq = new PriorityQueue<>();
        for(int num:nums)
        	pq.offer(num);
        while(pq.size()>k)
        	pq.poll();
    }
    
    public int add(int val) {
        pq.offer(val);
        while(pq.size()>k)
        	pq.poll();
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */