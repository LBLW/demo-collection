package base.demo.string;


/**
 * @author wangzezhou
 * @create 2018-08-31 上午10:46
 * @desc 字符串比对
 **/
public class StringCount {

    public static void main(String[] args) {

        String key_word_1 = "关键字1,关键字12,关键字13 ";
        String key_word_2 = "关键字1,关键字2";
        String key_word_3 = "关键字5,关键字4";

        String content = "有关键字11跟关键字2还有排除关键字3跟关键字6看看你到底报警不报警";

//        System.out.println(alarm(key_word_1,key_word_2,key_word_3,content));

        String key_word_4 = "松赞干布";

        System.out.println(key_word_4.length());

    }

    public static boolean alarm(String key_word_1, String key_word_2, String key_word_3, String content) {

        String[] keyWord3Array = key_word_3.split(",");

        for (String keyWord : keyWord3Array) {

            boolean result = content.contains(keyWord);

            if(result) {
                return false;
            }
        }
//
        String[] keyWord2Array = key_word_1.split(",");

        for(String keyWord : keyWord2Array) {

            boolean result = content.contains(keyWord);

            if(result) {
                return true;
            }
        }
//
        String[] keyWord1Array = key_word_2.split(",");

        boolean checkMark = true;

        for (String keyWord : keyWord1Array) {

            boolean result = content.contains(keyWord);

            if(!result) {
                return false;
            }
        }

        return true;
    }
}
