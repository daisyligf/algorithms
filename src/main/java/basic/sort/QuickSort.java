package basic.sort;

/**
 * Created by daisyli on 2017/4/3.
 */
public class QuickSort {

    public static void quickSort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }

        int index = partition(nums, low, high);
        quickSort(nums, low, index - 1);
        quickSort(nums, index + 1, high);

    }

    private static int partition(int[] nums, int low, int high) {
        int key = nums[low];
        while (low < high) {
            while (nums[high] >= key && high > low) { // 先扫描后半部分（从右往左）
                high --;//找到右边第一个小于key的值，交换到左边
            }
            nums[low] = nums[high];
            while (nums[low] <= key && high > low) { //再扫描前半部分（从左往右）
                low ++;
            }
            nums[high] = nums[low];//找到左边第一个大于key的值，交换到右边
        }
        nums[high] = key;
        return high;
    }

    public static void main(String[] args) {
        int[] nums = {8, 15, 3, 6, 9, 7, 4};
        QuickSort.quickSort(nums, 0, nums.length - 1);
        for (int num : nums) {
            System.out.println(num);

        }
    }
}
