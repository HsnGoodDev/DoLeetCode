class Solution {
    public int reverse(int x) {
        // int to string 
        // - 기호 경우 유지 
        // reverse 후 0이 첫 숫자 면 생략 
        // 범위 
        int resultNumber = 0;
        while (x != 0)
    {
        int tail = x % 10;
        int newResult = resultNumber * 10 + tail;
        if (resultNumber > Integer.MAX_VALUE/10 || (resultNumber == Integer.MAX_VALUE / 10 && tail > 7)) return 0;
        if (resultNumber < Integer.MIN_VALUE/10 || (resultNumber == Integer.MIN_VALUE / 10 && tail < -8)) return 0;
        resultNumber = newResult;
        x = x / 10;
    }

    return resultNumber;
         



    }
}