public class TwoSumSortedSolution {
    public static void main(String[] args) {
        int[] numbers = {-1,-3,-9,13,15,12,24};
        int target = 10;
        int[] result = twoSum(numbers, target);
        System.out.println("Index1: " + result[0] + ", Index2: " + result[1]);
    }

    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        if (target < -1000 || target > 1000) {
            throw new IllegalArgumentException("Target value is out of range");
        }

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        throw new IllegalArgumentException("No two sum solution");
    }
}
