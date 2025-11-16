package labPracticeQuestions;

public class JumpSearch {

    static int jumpSearch(int[] arr, int x) {
        int n = arr.length;
        int step = (int) Math.sqrt(n);
        int prev = 0;

        // Jumping ahead in blocks
        while (prev < n && arr[Math.min(step, n)-1] < x) {
            prev = step;
            step += (int) Math.sqrt(n);
            if (prev >= n) return -1;
        }

        // Linear search backward in block
        while (prev < Math.min(step, n)) {
            if (arr[prev] == x)
                return prev;
            prev++;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,11,13,15,17,19};
        System.out.println(jumpSearch(arr, 13)); // Output: 6
    }
}
