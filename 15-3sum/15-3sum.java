class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new LinkedList<>(); 
        Arrays.sort(nums); 
        for(int i = 0 ; i < nums.length-2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i-1])) {
                int secondInedex = i+1, lastIndex = nums.length-1, sum = 0 - nums[i];
                while (secondInedex < lastIndex) {
                    if (nums[secondInedex] + nums[lastIndex] == sum) {
                        result.add(Arrays.asList(nums[i], nums[secondInedex], nums[lastIndex]));
                        while (secondInedex < lastIndex && nums[secondInedex] == nums[secondInedex+1]) secondInedex++;
                        while (secondInedex < lastIndex && nums[lastIndex] == nums[lastIndex-1]) lastIndex--;
                        secondInedex++; lastIndex--;
                    } else if (nums[secondInedex] + nums[lastIndex] < sum) secondInedex++;
                      else lastIndex--;
                    }
            }
        }
        return result; 
    }
}