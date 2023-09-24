package JavaBasic;

import java.util.ArrayList;
import java.util.List;

public class ProductofArrayExcludeItself {

    public static List<Long> productExcludeItself(List<Integer> nums) {
        int n = nums.size();
        List<Long> result = new ArrayList<>();

        // Calculate the product of elements to the left of each element.
        List<Long> leftProducts = new ArrayList<>(n);
        long leftProduct = 1;
        for (int i = 0; i < n; i++) {
            leftProducts.add(leftProduct);
            leftProduct *= nums.get(i);
            System.out.println(leftProducts);
        }

        // Calculate the product of elements to the right of each element and multiply it with leftProducts.
        long rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result.add(0, leftProducts.get(i) * rightProduct); // Add to the beginning of the result list.
            rightProduct *= nums.get(i);
            System.out.println(rightProduct);
        }

        return result;
    }

    public static void main(String[] args) {
       // ProductofArrayExcludeItself solution = new ProductofArrayExcludeItself();
        List<Integer> nums = List.of(2, 2, 3, 4);
     
       System.out.println(productExcludeItself(nums));
    }
}
