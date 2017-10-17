import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

import static java.lang.System.out;

/**
 * Created by WUGUOKAI on 2017/8/1.
 */
public class test {

    public static void main(String[] args){
      /*  List<Integer> integerList = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
//        integerList.parallelStream().forEach(out::println);//并行流，不是按顺序输出
//        integerList.parallelStream().forEachOrdered(out::println);//并行流，forEachOrdered方法会顺序输出
        // 使用forEachOrdered()这类的有序处理,可能会（或完全失去）失去平行化的一些优势
        Random random = new Random();
        random.ints().limit(10).sorted().forEach(out::println);*/
       /* SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        float diff = new Date().getTime()-new Date().getTime();
        System.out.println(diff);*/
        /*try{
            Date   begin=sdf.parse(startDate);
            Date   end   =   sdf.parse(endDate);

            float   between=(end.getTime()-begin.getTime())/1000;//除以1000是为了转换成秒
            int days=(int) (between/(24*3600));
        }catch (Exception e)
        {
        }*/
//        Calendar aCalendar = Calendar.getInstance();

        /*aCalendar.setTime(new Date());

        int day1 = aCalendar.get(Calendar.DAY_OF_YEAR);

        aCalendar.setTime(new Date());

        int day2 = aCalendar.get(Calendar.DAY_OF_YEAR);

        System.out.println(day2-day1);*/
//        System.out.println(new Date(2017, 8, 20));
      /*  Map<String, Integer> integerMap = new HashMap<>();
        integerMap.put("1", 1);
        integerMap.put("2", 2);
        integerMap.put("2", 3);
        for (Map.Entry<String, Integer> integerEntry : integerMap.entrySet())
        {
            System.out.println(integerEntry.getValue());
        }*/

       /* File file = new File("D://test.json");
        System.out.println(file.length());
        try {
            if (file != null && file.length() > 0) {
                FileReader fileReader = new FileReader(file);
                System.out.println(fileReader);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String jsonStr = "";
                String s = "";
                while((s = bufferedReader.readLine()) != null){
                    jsonStr = jsonStr+s;
                }
                System.out.println(jsonStr);*//*lines().forEach(out::println)*//*;
                JsonObject json = new JsonParser().parse(jsonStr).getAsJsonObject();
                System.out.println(json.get("name"));
                File fileNew = new File("D://test_new.json");
                FileWriter fileWriter = new FileWriter(fileNew);
                fileWriter.write(new Gson().toJson(json));
                fileWriter.close();
                fileReader.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }*/

        try {
            File file = new File("D://test.json");
            File fileNew = new File("D://test_new.json");
            FileInputStream fileInputStream = new FileInputStream(file);
            FileOutputStream fileOutputStream = new FileOutputStream(fileNew);
            int tempByte ;
            while((tempByte = fileInputStream.read()) != -1){
                fileOutputStream.write(tempByte);
            }
            fileInputStream.close();
            fileOutputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
