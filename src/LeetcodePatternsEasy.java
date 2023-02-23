import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;

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

    public int missingNumberSet(int[] nums) {
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
    public int missingNumberArray(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++){
            if(nums[i] != i){
                return i;
            }
        }

        return n;
    }

    public int missingNumberSum(int[] nums) {
        int n = nums.length;
        int sum = 0;

        for (int num : nums){
            sum += num;
        }
        return (1+n)*n/2 - sum;
    }

    public int missingNumberSum2(int[] nums) {
            return (1+nums.length)*nums.length/2 - Arrays.stream(nums).sum();
    }
}
