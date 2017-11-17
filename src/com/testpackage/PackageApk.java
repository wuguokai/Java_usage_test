package com.testpackage;

import java.io.*;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/**
 * Created by WUGUOKAI on 2017/10/19.
 */
public class PackageApk {
    public static void main(String[] args) {
        try {
            File releaseApk = new File("C:\\Users\\WUGUOKAI\\Desktop\\test\\app-release.apk");
            System.out.println(releaseApk.length());

            releaseApk.renameTo(new File("C:\\Users\\WUGUOKAI\\Desktop\\test\\app-release.zip"));
            File releaseZip = new File("C:\\Users\\WUGUOKAI\\Desktop\\test\\app-release.zip");
            System.out.println(releaseZip.length());
            /*FileInputStream fileInputStream = new FileInputStream(releaseApk);
            FileOutputStream fileOutputStream = new FileOutputStream(releaseZip);
            int tempByte ;
            while((tempByte = fileInputStream.read()) != -1){
                fileOutputStream.write(tempByte);
            }
            fileInputStream.close();
            fileOutputStream.close();*/
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
