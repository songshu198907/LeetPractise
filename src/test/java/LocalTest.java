import java.io.IOException;

/**
 * Created by songheng on 3/18/16.
 */
public class LocalTest {
    public static void main(String[] args) throws IOException {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("输入:");
//
//        int len = scanner.nextInt();
//        int[] arr = new int[len];
//        System.out.println(len);
//        int cnt = 0;
//

//        System.out.println(new LocalTest().maxProduct(new String[]{"a", "ab", "abc", "d", "cd", "bcd", "abcd"}));
        int[] arr = new int[]{1, 3, 2, 5, 4, 6, 8};
        System.out.println(getKth(arr, 4));
        System.out.println(getKth(arr, 4));
        System.out.println(getKth(arr, 4));
        System.out.println(getKth(arr, 2));
        System.out.println(getKth(arr, 3));
        System.out.println(getKth(arr, 6));
        System.out.println(getKth(arr, 7));


    }

    public static int getKth(int[] arr, int key) {
        int start = 0, end = arr.length - 1, index = key - 1;
        while (start < end) {
            int povit = partion(arr, start, end);
            if (povit < index) start = povit + 1;
            else if (povit > index) end = povit - 1;
            else return arr[povit];
        }
        return arr[start];

    }

    public static int partion(int[] arr, int left, int right) {
        int povit = left;
        while (left <= right) {
            while (left <= right && arr[left] <= arr[povit]) left++;
            while (left <= right && arr[right] >= arr[povit]) right--;
            if (left < right) {
                swap(arr, left, right);
            }
        }
        swap(arr, povit, right);
        return right;
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public int maxProduct(String[] words) {
        if (words == null || words.length <= 1) {
            return 0;
        }
        // Pre-processing
        int[] processedWords = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            processedWords[i] = 0;
            for (int j = 0; j < words[i].length(); j++) {
                processedWords[i] |= (1 << words[i].charAt(j) - 'a');
            }
        }
        // get result
        int maxProduct = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (((processedWords[i] & processedWords[j]) == 0)
                        && words[i].length() * words[j].length() > maxProduct) {
                    maxProduct = words[i].length() * words[j].length();
                }
            }
        }

        return maxProduct;
    }


}
