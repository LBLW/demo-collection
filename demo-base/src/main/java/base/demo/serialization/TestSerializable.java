package base.demo.serialization;

import base.demo.serialization.pojo.SerializableObject;

import java.io.*;

/**
 * @author wangzezhou
 * @create 2020-05-07 2:31 PM
 * @desc java对象序列化实验
 **/
public abstract class TestSerializable {

    public static void main(String[] args) {

        SerializableObject s_object = new SerializableObject();

        s_object.setProperty_1(10);

        s_object.setProperty_2("this is one object");

        SerializableObject.staticProperty = "t100";

        s_object.setT_property("this is t object");

        try {
//            writeObject(s_object);
            SerializableObject s_obj = readObject();

            System.out.println(s_obj.getProperty_1());
            System.out.println(s_obj.getProperty_2());
            System.out.println(s_obj.getT_property());
            System.out.println(s_obj.staticProperty);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 对象序列化
     * @param object
     * @throws IOException
     */
    public  static void writeObject(SerializableObject object) throws IOException {

        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("s_obj.dat"));
        outputStream.writeObject(object);
        outputStream.close();

    }

    /**
     * 对象反序列化
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static SerializableObject readObject() throws IOException, ClassNotFoundException {

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("s_obj.dat"));
        SerializableObject s_obj = (SerializableObject) inputStream.readObject();
        inputStream.close();
        return s_obj;
    }

}
