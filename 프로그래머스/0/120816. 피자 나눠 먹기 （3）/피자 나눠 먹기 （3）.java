class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        while (slice*answer < n) {
            answer += 1;
        }
        return answer;
    }
}