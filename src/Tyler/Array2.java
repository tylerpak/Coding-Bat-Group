package Tyler;

public class Array2 {

    public int countEvens(int[] nums) {
        int output = 0;
        for(int i : nums) {
            if(i%2 == 0) {
                output++;
            }
        }
        return output;
    }

    public int bigDiff(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        for(int i : nums) {
            if(i < min) {
                min = i;
            }
            else if(i > max) {
                max = i;
            }
        }
        return max - min;
    }

    public int centeredAverage(int[] nums) {
        int minI = 0;
        int maxI = 2;
        int min = nums[0];
        int max = nums[2];

        for(int i = 0; i < nums.length ; i++) {
            if(nums[i] < min) {
                min = nums[i];
                minI = i;
            }
            else if(nums[i] > max) {
                max = nums[i];
                maxI = i;
            }
        }
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            if((i != minI) && (i != maxI)) {
                sum += nums[i];
            }
        }
        return sum / (nums.length - 2);
    }

    public int sum13(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 13) {
                sum += nums[i];
            }
            else if(i < nums.length - 1){
                i++;
            }
        }
        return sum;
    }

    public int sum67(int[] nums) {
        boolean sixFlag = false;
        int sum = 0;
        for(int i : nums) {
            if(i == 6) {
                sixFlag = true;
            }
            else if(!sixFlag) {
                sum += i;
            }
            if(i == 7) {
                sixFlag = false;
            }
        }
        return sum;
    }

    public boolean has22(int[] nums) {
        int prevNum = 0;
        for(int i : nums) {
            if((i == 2) && (prevNum == 2)) {
                return true;
            }
            prevNum = i;
        }
        return false;
    }

    public boolean lucky13(int[] nums) {
        for(int i : nums) {
            if((i == 3) || (i == 1)) {
                return false;
            }
        }
        return true;
    }

    public boolean sum28(int[] nums) {
        int sum = 0;
        for(int i : nums) {
            if(i == 2) {
                sum += i;
            }
        }
        return sum == 8;
    }

    public boolean more14(int[] nums) {
        int oneCount = 0;
        int fourCount = 0;

        for(int i : nums) {
            if(i == 1) {
                oneCount++;
            }
            else if( i == 4) {
                fourCount++;
            }
        }
        return oneCount > fourCount;
    }

    public int[] fizzArray(int n) {
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        return arr;
    }

    public boolean only14(int[] nums) {
        for(int i : nums) {
            if((i != 1) && (i != 4)) {
                return false;
            }
        }
        return true;
    }

    public String[] fizzArray2(int n) {
        String[] arr = new String[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = String.valueOf(i);
        }
        return arr;
    }

    public boolean no14(int[] nums) {
        boolean fourFlag = false;
        boolean oneFlag = false;
        for(int i : nums) {
            if(i == 1) {
                oneFlag = true;
            }
            else if( i == 4) {
                fourFlag = true;
            }
        }
        return !(oneFlag && fourFlag);
    }

    public boolean isEverywhere(int[] nums, int val) {
        for(int i = 0; i < nums.length - 1; i++) {
            if((nums[i] != val) && (nums[i+1] != val)) {
                return false;
            }
        }
        return true;
    }

    public boolean either24(int[] nums) {
        boolean twoFlag = false;
        boolean fourFlag = false;
        for(int i = 0; i < nums.length - 1; i++) {
            if((nums[i] == 2) && (nums[i + 1] == 2)) {
                twoFlag = true;
            }
            else if((nums[i] == 4) && (nums[i + 1] == 4)) {
                fourFlag = true;
            }
        }
        if((twoFlag && !fourFlag) || (!twoFlag && fourFlag)) {
            return true;
        }
        else {
            return false;
        }
    }

    public int matchUp(int[] nums1, int[] nums2) {
        int count = 0;
        for(int i = 0; i < nums1.length; i++) {
            if((Math.abs(nums1[i] - nums2[i]) <= 2) && (Math.abs(nums1[i] - nums2[i]) != 0)) {
                count++;
            }
        }
        return count;
    }

    public boolean has77(int[] nums) {
        if(nums.length < 2) {
            return false;
        }
        else if(nums.length >= 3) {
            for (int i = 0; i < nums.length - 2; i++) {
                if (((nums[i] == 7) && (nums[i + 1] == 7)) || ((nums[i] == 7) && (nums[i + 2] == 7))) {
                    return true;
                }
            }
        }
        if((nums[nums.length-2] == 7) && (nums[nums.length-1] == 7)) {
            return true;
        }
        return false;
    }





}
