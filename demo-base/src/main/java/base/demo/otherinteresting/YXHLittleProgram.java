package base.demo.otherinteresting;

import lombok.Data;

/**
 * @author wangzezhou
 * @create 2020-04-13 3:13 PM
 * @desc 营销号生成小程序
 **/
@Data
public class YXHLittleProgram {

    private final static String templateStr
            = "${1}${2}是怎么回事呢?${1}相信大家都很熟悉，但是${1}${2}是怎么回事呢，下面就让小编带大家一起了解吧。\n"
            + "${1}${2}，其实就是${3},大家可能会很惊讶${1}怎么会${2}呢？但事实就是这样，小编也感到非常惊讶。\n"
            + "这就是关于${1}${2}的事情了，大家有什么想法呢，欢迎在评论区告诉小编一起讨论哦！";

    public static String generateYXMessage(String mainIdentity, String event, String otherEvent) {

        return templateStr.replace("${1}",mainIdentity).replace("${2}",event).replace("${3}",otherEvent);
    }

    public static void main(String[] args) {
        int[] aaa = new int[]{1,3};
        System.out.println(YXHLittleProgram.generateYXMessage("ACT","更新以后不生成日志了","ACT更新以后不生成日志文件"));
    }

}
