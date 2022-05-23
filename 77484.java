import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        ArrayList<Integer> lotto = new ArrayList<Integer>();

        Arrays.sort(lottos);
        Arrays.sort(win_nums);

        int cnt = 0;
        int matNum = 0;
        int min = 0;
        int max = 0;

        // lottos에서 0이 아닌 요소 lotto리스트에 저장
        for (int i = 0; i < lottos.length; i++){ 
            if (lottos[i] != 0)
                lotto.add(lottos[i]);
            } else cnt++; // 0의 개수
        }

        for (int i = 0; i < lotto.size(); i++) {
            for (int j = 0; j < win_nums.length; j++){
                if (lotto.get(i) == win_nums[j]){
                    matNum++;
                }
            }
        }

        if (matNum == 6){
            min = 1;
        } else if (matNum == 5){
            min = 2;
        } else if (matNum == 4){
            min = 3;
        } else if (matNum == 3){
            min = 4;
        } else if (matNum == 2){
            min = 5;
        } else min = 6;

        if (matNum+cnt == 6){
            max = 1;
        } else if (matNum+cnt == 5){
            max = 2;
        } else if (matNum+cnt == 4){
            max = 3;
        } else if (matNum+cnt == 3){
            max = 4;
        } else if (matNum+cnt == 2){
            max = 5;
        } else max = 6;

        answer[0] = max;
        answer[1] = min;

        return answer;
    }
}
