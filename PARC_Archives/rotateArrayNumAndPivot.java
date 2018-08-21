//Find the number of times the array is rotated,
//the pivot element in the sorted and rotated array.

class Solution{
	public int numberTimesRotated(int[] arr, int[] rotatedArr){
		String inp = "";
		for(int i: arr){
			inp+=i;
		}	
		int firstNum = arr[0];
		int ini=-1;
		int fini=0;
		for(int i: rotatedArr){
			inp+=i;
		}
		for(int i=0; i<inp.length(); i++){
			if(Integer.parseInt(inp.charAt(i)) == firstNum){
				ini = i;
				i++;
				continue;
			}
			if(ini!=-1 && Integer.parseInt(inp.charAt(i)) == firstNum){
				fini = i;
				break;
			}
		}
		return Math.abs(fini-ini);
	}
}