package com.dragontalker.java;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/**
 * 处理流之二: 转换流的使用
 *
 * 1. 转换流: 属于字符流
 *  - InputStreamReader: 将一个字节的输入流转换为字符的输入流
 *  - OutputStreamWriter: 将一个字符的输出流转换为字节的输出流
 *
 * 2. 作用: 提供字节流和字符流之间的转换
 *
 * 3. 解码: 字节、字节数组 ---> 字符数组、字符串
 *    编码: 字符数组、字符串 ---> 字节、字节数组
 *
 * 4. 字符集:
 */

public class InputStreamReaderTest {

    @Test
    public void test1() throws IOException {
        FileInputStream fis = new FileInputStream("hello.txt");
        //InputStreamReader isr = new InputStreamReader(fis); //使用默认的字符集, utf-8
        //参数2指明了字符集
        //具体使用了哪个字符集, 取决于文件保存时使用的字符集
        InputStreamReader isr = new InputStreamReader(fis, "UTF-8");

        char[] cbuf = new char[20];
        int len;
        while((len = isr.read(cbuf)) != -1) {
            String str = new String(cbuf, 0, len);
            System.out.println(str);
        }

        isr.close();
    }
}
