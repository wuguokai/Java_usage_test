/**
 * Created by WUGUOKAI on 2017/10/13.
 */
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestCmd {
    public static void main(String[] args) {
        String path = "C:\\Users\\WUGUOKAI\\Desktop\\package.bat";
//        String path = "jarsigner -verbose -keystore C:\\Users\\WUGUOKAI\\Desktop\\test.jks -storepass 123456 -signedjar C:\\Users\\WUGUOKAI\\Desktop\\test1.apk -digestalg SHA1 -sigalg MD5withRSA C:\\Users\\WUGUOKAI\\Desktop\\app-release.apk test";
        Runtime run = Runtime.getRuntime();
        try {
//            Process process = run.exec("cmd /k start" + path);
            Process process = run.exec(path);
//            run.exec("cmd.exe /k d:");
            InputStream in = process.getInputStream();
            BufferedReader strCon = new BufferedReader(new InputStreamReader(in));
            String line;
            while ((line = strCon.readLine()) != null) {
                System.out.println(line);
            }
            process.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

