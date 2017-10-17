package com.zxing;

/**
 * Created by WUGUOKAI on 2017/10/17.
 */
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.common.BitMatrix;

import java.io.File;
import java.util.Hashtable;

/**
 *
 * 用的ZXing 3.0.0
 */
public final class TestZxing {

    public static void main(String[] args) throws Exception {
        String text = "https://www.baidu.com"; // 二维码内容
        int width = 300; // 二维码图片宽度
        int height = 300; // 二维码图片高度
        String format = "png";// 二维码的图片格式

        Hashtable<EncodeHintType, String> hints = new Hashtable<EncodeHintType, String>();
        hints.put(EncodeHintType.CHARACTER_SET, "utf-8");   // 内容所使用字符集编码

        BitMatrix bitMatrix = new MultiFormatWriter().encode(text, BarcodeFormat.QR_CODE, width, height, hints);
        // 生成二维码
        File outputFile = new File("e:" + File.separator + "new.png");
        MatrixToImageWriter.writeToFile(bitMatrix, format, outputFile);
    }
}