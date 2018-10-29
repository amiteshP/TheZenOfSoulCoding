class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hSet = new HashSet<>(Arrays.asList(num1));
        HashSet<Integer> hSet2 = new HashSet<>(Arrays.asList(num2));
        hSet2.retainAll(hSet);
        int[] res = new int[hSet2.size()];
        hSet2.toArray(res);
        return res;
    }
}