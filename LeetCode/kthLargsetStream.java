//https://leetcode.com/problems/kth-largest-element-in-a-stream/description/

class KthLargest {

	private int[] minHeap;

    public KthLargest(int k, int[] nums) {
    	minHeap = new int[k];


    	//Initialize min-heap with values
    	for(int i=0; i<k; i++){
    		if(i<nums.length){
    			minHeap[i] = nums[i];
    		}
    		else
    		{
    			minHeap[i] = Integer.MIN_VALUE;
    		}
    	}

    	for(int i=(int)Math.floor(k/2); i>=0; i--){
    		minHeapify(minHeap, i);
    	}

    	for(int i=k; i<nums.length; i++){
    		if(nums[i]>minHeap[0]){
    			minHeap[0] = nums[i];
    			minHeapify(minHeap, 0);
    		}
    	}
    }
    
    public int add(int val) {
        if(val>minHeap[0]){
        	minHeap[0] = val;
        	minHeapify(minHeap, 0);
        }
        return minHeap[0];
    }

    private void minHeapify(int[] heap, int i){
    	int l = 2*i+1;
    	int r = 2*i+2;

    	int small = i;

    	if(l<heap.length && heap[i]>heap[l]){
    		small = l;
    	}
    	if(r<heap.length && heap[small]>heap[r]){
    		small = r;
    	}
    	if(small!=i){
    		int temp = heap[i];
    		heap[i] = heap[small];
    		heap[small] = temp;

    		minHeapify(minHeap, small);
    	}
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */