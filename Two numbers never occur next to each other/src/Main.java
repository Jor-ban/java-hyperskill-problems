import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int[] arr = new int[scanner.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] nums = {scanner.nextInt(), scanner.nextInt()};
        boolean isNext2EachOther = false;
        if (arr.length == 2 && (arr[0] == nums[0] && arr[1] == nums[1] ||
                arr[0] == nums[1] && arr[1] == nums[0])) {
            isNext2EachOther = true;
        }
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] == nums[0] && (arr[i - 1] == nums[1] || arr[i + 1] == nums[1]) ||
                    arr[i] == nums[1] && (arr[i - 1] == nums[0] || arr[i + 1] == nums[0])) {
                isNext2EachOther = true;
                break;
            }
        }
        System.out.println(!isNext2EachOther);
    }
}