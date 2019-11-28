package BufferedStream;

import java.io.*;
import java.util.HashMap;

/**
 * @author gongzizhao
 * @date 2019/11/27 15:29
 */
public class Demo1Test {
    public static void main(String[] args) throws IOException {
        HashMap<String, String> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new FileReader("AboutFile\\src\\BufferedStream\\in.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("AboutFile\\src\\BufferedStream\\out.txt"));

        String line;
        while ((line = br.readLine()) != null) {
            String[] arr = line.split("\\.");
            map.put(arr[0], arr[1]);
        }

        //key序号是有序的   会自动排序
        for (String key : map.keySet()) {
            String value = map.get(key);
            line = key + "." + value;
            bw.write(line);
            bw.newLine();//写个换行
        }

        bw.close();
        br.close();
    }
}
