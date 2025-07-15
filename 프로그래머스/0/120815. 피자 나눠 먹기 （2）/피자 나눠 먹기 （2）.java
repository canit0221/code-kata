class Solution {
    public int solution(int n) {
        int answer = 0;
        int max = Math.max(n,6);
        System.out.println(max);
        for (int i=max; i<n*max+1; i++) {
            if (i%n==0 && i%6==0) {
                answer = i/6;
                break;         
            }
        }
        return answer;
    }
}