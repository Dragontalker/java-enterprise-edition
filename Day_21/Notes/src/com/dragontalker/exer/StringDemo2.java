package com.dragontalker.exer;

import org.junit.Test;

public class StringDemo2 {
    //获取两个字符串中最大相同的字串

    public String getMaxSameString(String str1, String str2) {
        String maxStr = (str1.length() >= str2.length()) ? str1 : str2;
        String minStr = (str1.length() < str2.length()) ? str1 : str2;
        int length = minStr.length();

        for (int i = 0; i < length; i++) {

            for (int x = 0, y = length - i; y <= length; x++, y++) {
                String subStr = minStr.substring(x, y);
                if (maxStr.contains(subStr)) {
                    return subStr;
                }
            }
        }
        return null;
    }

    @Test
    public void test1() {
        String str1 = "abcwerthelloyuiodef";
        String str2 = "cvhellobnm";
    }
}
