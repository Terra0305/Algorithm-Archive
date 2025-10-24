import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0];
            int end = commands[i][1];
            int target = commands[i][2];
            int[] current_array = Arrays.copyOfRange(array, start - 1, end);
            Arrays.sort(current_array);
            answer[i] = current_array[target - 1];

        }

        return answer;
    }



    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        
        int[] result = sol.solution(array, commands);
        System.out.println(Arrays.toString(result)); 
    }
}