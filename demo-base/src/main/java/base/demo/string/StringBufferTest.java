package base.demo.string;

/**
 * @author wangzezhou
 * @create 2020-04-15 4:42 PM
 * @desc StringBuffer的一系列API
 **/
public class StringBufferTest {

    public static void main(String[] args) {

        testStringBuffer();
    }

    public static void testStringBuffer(){


        StringBuffer stringBuffer = new StringBuffer();
        System.out.println(stringBuffer.append(121).reverse().toString());
        System.out.println(stringBuffer.append("testInterFace").toString());

    }

    public static void testStringBuilder() {
        new StringBuilder().append(121).reverse().toString();
    }

    public static void testString() {
        new String("121");
    }

}
