package base.demo.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author wangzezhou
 * @create 2018-09-13 下午4:18
 * @desc 读取配置文件
 **/
public class ReadProperties {

    public static void main(String[] args) throws IOException {
        InputStream propertiesStream = new FileInputStream("/etc/demo/demo.properties");
        Properties properties = new Properties();
        properties.load(propertiesStream);

        System.out.println(properties.get("jar.path"));
    }
}
