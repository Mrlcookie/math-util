package com.cookie.mathutil.core;

//CODE CHÍNH, CODE BASE, CODE DÂN DEV PHẢI LÀM
public class MathUtil {
    public static long getFactorial(int n) {
            long result = 1;

            if (n < 0 || n > 20) {
                throw new IllegalArgumentException("Invalid n. n must be between 0 and 20");
            }
            //n đang ổn, làm vòng for mà tính dồn, nhân dồn vào result
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
    }
}
