class Solution {
    public int solution(int price) {
        int answer = 0;
        double discount_rate = 0;
        
        if (price>=500000) {
            discount_rate = 0.2;    
        }
        else if (price>=300000) {
            discount_rate = 0.1;
        }
        else if (price>=100000) {
            discount_rate = 0.05;
        }
        answer = (int)(price * (1-discount_rate));
        return answer;
    }
}