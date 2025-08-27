package Tyler;

public class Recursion2 {

    public static boolean groupSum(int start, int[] nums, int target) {
        if(target == 0) {
            return true;
        }
        else if(start >= nums.length) {
            return false;
        }
        return groupSum(start + 1, nums, target - nums[start]) || groupSum(start + 1, nums, target);
    }

    public static boolean groupSum6(int start, int[] nums, int target) {
        if(start >= nums.length) {
            if(target == 0) {
                return true;
            }
            return false;
        }
        if(nums[start] == 6) {
            return groupSum6(start + 1, nums, target - nums[start]);
        }
        return groupSum6(start + 1, nums, target - nums[start]) || groupSum6(start + 1, nums, target);
    }

    public static boolean groupNoAdj(int start, int[] nums, int target) {
        if(target == 0) {
            return true;
        }
        else if(start >= nums.length) {
            return false;
        }
        return groupNoAdj(start + 2, nums, target - nums[start]) || groupNoAdj(start + 1, nums, target);
    }

    public static boolean groupSum5(int start, int[] nums, int target) {
        if(start >= nums.length) {
            if(target == 0) {
                return true;
            }
            return false;
        }
        if(nums[start] % 5 == 0) {
            return groupSum5(start + 1, nums, target - nums[start]);
        }
        if((start > 0) && (nums[start] == 1)) {
            return groupSum5(start + 1, nums, target);
        }
        return groupSum5(start + 1, nums, target - nums[start]) || groupSum5(start + 1, nums, target);
    }

    public static boolean groupSumClump(int start, int[] nums, int target) {
        if(start >= nums.length) {
            if(target == 0) {
                return true;
            }
            return false;
        }
        int count = 1;
        while(start < nums.length - 1) {
            if(nums[start+1] == nums[start]) {
                count++;
            }
            else {
                break;
            }
            start++;
        }
        if(count > 1) {
            return groupSumClump(start + 1, nums, target) || groupSumClump(start + 1, nums, target - (nums[start-1] * count));
        }
        return groupSumClump(start + 1, nums, target - nums[start]) || groupSumClump(start + 1, nums, target);
    }

    public static boolean splitArray(int[] nums) {
        return splitArrayHelper(0, 0, nums, 0);
    }

    public static boolean splitArrayHelper(int sumA, int sumB, int[] nums, int index) {
        if(index >= nums.length) {
            if(sumA == sumB) {
                return true;
            }
            else {
                return false;
            }
        }
        return splitArrayHelper(sumA + nums[index], sumB, nums, index + 1) || splitArrayHelper(sumA, sumB + nums[index], nums, index + 1);
    }

    public static boolean splitOdd10(int[] nums) {
        return splitOdd10Helper(0, 0, nums, 0);
    }

    public static boolean splitOdd10Helper(int sumA, int sumB, int[] nums, int index) {
        if(index >= nums.length) {
            if((sumA % 10 == 0) && (sumB % 2 == 0)) {
                return true;
            }
            else {
                return false;
            }
        }
        return splitOdd10Helper(sumA + nums[index], sumB, nums, index + 1) || splitOdd10Helper(sumA, sumB + nums[index], nums, index + 1);
    }
}
