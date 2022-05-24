import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//https://programmers.co.kr/learn/courses/30/lessons/42840

class Solution {
    public int[] solution(int[] answers) {
        
        int[] person1 = {1,2,3,4,5};
        int[] person2 = {2,1,2,3,2,4,2,5};
        int[] person3 = {3,3,1,1,2,2,4,4,5,5};
        
        ArrayList<Integer> count = new ArrayList<Integer>(3);
        
        // 초기값 0으로 설정
        count.add(0);
        count.add(0);
        count.add(0);
        
        int length = answers.length;
        // 정답 개수 세기
        for (int i = 0; i < length; i++) {
            if (answers[i] == person1[i%5]) {
                count.set(0,count.get(0)+1);
            } if (answers[i] == person2[i%8]) {
                count.set(1,count.get(1)+1);
            } if (answers[i] == person3[i%10]) {
                count.set(2,count.get(2)+1);
            } else continue;
        }
         
        int max = Collections.max(count);
        int cntSize = count.size();
        
        //최고 점수 저장할 리스트
        ArrayList<Integer> highScore = new ArrayList<Integer>(cntSize);
        
        // 최고 점수와 동일할 경우 리스트에 추가
        for (int i = 0; i < cntSize ; i++) {
            if (count.get(i) == max){
                highScore.add(i+1);
            } else continue;
        }
        
        int highScoreSize = highScore.size();
        int[] answer = new int[highScoreSize];
        
        for (int i = 0; i < highScoreSize; i++) {
            answer[i] = highScore.get(i);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}
