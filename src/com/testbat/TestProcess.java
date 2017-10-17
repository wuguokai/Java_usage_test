package com.testbat; /**
 * Created by WUGUOKAI on 2017/10/13.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestProcess {

    public static void main(String[] args) {
        try {
            String strCmd = "pwd";//待执行的dos命令(chdir命令作用是列出当前的工作目录)
            Process process = Runtime.getRuntime().exec("powershell /k start " + strCmd);//通过cmd程序执行cmd命令
            //process.waitFor();
            //读取屏幕输出
            BufferedReader strCon = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = strCon.readLine()) != null) {
                System.out.println(line);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}