class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String ab = String.valueOf(a) + String.valueOf(b);
        int nab = 2 * a * b;
        
        if(Integer.valueOf(ab) > nab){
            answer = Integer.valueOf(ab);
        } else if(Integer.valueOf(ab) < nab){
            answer = nab;
        } else {
            answer = Integer.valueOf(ab);
        }
        
        return answer;
    }
}