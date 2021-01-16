package homeworks;

public class CodingBatDebugging {
    public static void main(String[] args) {
        System.out.println(prefixAgain("abXYabc",3));
        int[] nums={1,2,3,4};
        System.out.println(swapEnds(nums));
    }
    public static boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0,n);
        return (str.contains(prefix));

    }
    public static int[] swapEnds(int[] nums) {
        int[] a = nums;
        a[0]= nums[nums.length - 1];
        a[a.length-1] = nums[0];
        return a;
    }

}
