class Solution {
    public void rotate(int[] nums, int r) {
        int len = nums.length;
        r = r % len;
        reverse(nums, 0, len - 1);
        reverse(nums, 0, r - 1);
        reverse(nums, r, len - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}