package base.demo.IO;

import java.io.*;

/**
 * @author wangzezhou
 * @create 2018-08-28 下午5:21
 * @desc 解析日志
 **/
public class ParseLog {

    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream =
                new FileInputStream(new File("/Users/lblw/Downloads/dc.log"));

        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);

        BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/lblw/Downloads/result.log"));


        BufferedReader reader = new BufferedReader(inputStreamReader);
        String lineText = null;
        while((lineText = reader.readLine()) != null){
            if(lineText.contains("id_type=-1")) {
                continue;
            }

            System.out.println(lineText);
            writer.write(lineText+"\n\r");
        }

        reader.close();
    }

}
