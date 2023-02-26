import java.util.*;

public class LeetcodePatternsEasy {

    public static Boolean containsDuplicateHashMap(int[] nums) {
        Hashtable<Integer, Integer> numH = new Hashtable<>();
        for (int i = 0; i < nums.length; i++) {
            if (numH.containsKey(nums[i])) {
                return true;
            } else {
                numH.put(nums[i], 1);
            }
        }
        return false;
    }

    public static Boolean containsDuplicateHashSet(int[] nums) {
        HashSet<Integer> numHS = new HashSet<>();

        for (int num : nums) {
            if (numHS.contains(num)) {
                return true;
            } else {
                numHS.add(num);
            }
        }
        return false;
    }

    public static Boolean containsDuplicateArrSort(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static int missingNumberSet(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums){
            set.add(num);
        }
        for (int i = 0; i <= n; i++){
            if(!set.contains(i)){
                return i;
            }
        }

        return -1;
    }
    public static int missingNumberArray(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++){
            if(nums[i] != i){
                return i;
            }
        }

        return n;
    }

    public static int missingNumberSum(int[] nums) {
        int n = nums.length;
        int sum = 0;

        for (int num : nums){
            sum += num;
        }
        return (1+n)*n/2 - sum;
    }

    public static int missingNumberSum2(int[] nums) {
            return (1+nums.length)*nums.length/2 - Arrays.stream(nums).sum();
    }

    public static List<Integer> findDisappearedNumbersSet(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++){
            set.add(nums[i]);
        }

        for (int i = 1; i <= n; i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }

    public static List<Integer> findDisappearedNumbersCyclicSort(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();

        int i = 0;
        while(i < n){
            int pos = nums[i] - 1;
            if (nums[i] != nums[pos]) {
                //equal nums[i], nums[pos] = nums[pos], nums[i]
                nums[i] = nums[pos] + nums[i];
                nums[pos] = nums[i] - nums[pos];
                nums[i] = nums[i] - nums[pos];
            } else {
                i += 1;
            }
        }

        for (i = 1; i <= n; i++){
            if (nums[i - 1] != i) {
                ans.add(i);
            }
        }
        return ans;
    }

    public static int singleNumberArrSort(int[] nums) {
        Arrays.sort(nums);
         for(int i = 0; i < nums.length - 1; i+=2){
             if(nums[i] != nums[i + 1]){
                return nums[i];
             }
         }

         return nums[nums.length - 1];
    }

    public static int singleNumberXor(int[] nums) {
        int ans = 0;
        for (int num: nums) {
            ans ^= num;
        }
        return ans;
    }

}
