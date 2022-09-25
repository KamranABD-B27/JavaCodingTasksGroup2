package week1;

import java.util.Arrays;

public class oddOrEven2 {
    public static void main(String[] args) {

        int[] nums = {5, 6};
        int even = 0, odd = 0;

        for(int each : nums){
            if(each % 2 == 0){
                even++; {
                    System.out.println(each + " is even");
                }
            } else {
                odd++;
                {
                    System.out.println(each + " is odd");
                }
            }
        }

    }
}
