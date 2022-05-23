import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        int length = nums.length;
        int setSize = length/2;
        HashSet<Integer> set = new HashSet<Integer>(setSize);
        
        int buf = 0;
        for (int i = 0; i < length; i++){
            set.add(nums[i]);
            buf = set.size();
            if (buf >= setSize){
                break;
            } else continue;
        }
        
        answer = set.size();
        
        return answer;
    }
}
