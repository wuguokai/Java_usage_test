package com.testbat; /**
 * Created by WUGUOKAI on 2017/10/13.
 */
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestCmd {
    public static void main(String[] args) {
        String path = "jarsigner -verbose -keystore C:\\Users\\WUGUOKAI\\Desktop\\MobileCloud.jks -storepass handhand -signedjar C:\\Users\\WUGUOKAI\\Desktop\\MobileCloud.apk  C:\\Users\\WUGUOKAI\\Desktop\\app-release.apk MobileCloud";
//        String path = "jarsigner -verbose -keystore C:\\Users\\WUGUOKAI\\Desktop\\test.jks -storepass 123456 -signedjar C:\\Users\\WUGUOKAI\\Desktop\\test1.apk -digestalg SHA1 -sigalg MD5withRSA C:\\Users\\WUGUOKAI\\Desktop\\app-release.apk test";
        Runtime run = Runtime.getRuntime();
        try {
//            Process process = run.exec("cmd /k start" + path);
            Process process = run.exec(path);
//            run.exec("cmd.exe /k d:");
            //取得命令结果的输出流
            InputStream fis=process.getInputStream();
            //用一个读输出流类去读
            InputStreamReader isr=new InputStreamReader(fis);
            //用缓冲器读行
            BufferedReader br=new BufferedReader(isr);
            String line=null;
            //直到读完为止
            while((line=br.readLine())!=null)
            {
//                System.out.println(line);
                System.out.println(process.isAlive());
            }
            System.out.println(process.isAlive());
           /* process.waitFor();
            System.out.println("111")*/;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

