class NumArray {

    int[] sumArr;

    public NumArray(int[] nums) {
        sumArr = new int[nums.length + 1];
        sumArr[0] = 0;
        for (int i = 1; i <= nums.length; i++) {
            sumArr[i] += sumArr[i - 1] + nums[i - 1];
        }
    }

    public int sumRange(int left, int right) {
        return sumArr[right + 1] - sumArr[left];
    }
}