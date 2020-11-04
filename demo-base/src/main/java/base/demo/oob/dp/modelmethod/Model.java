package base.demo.oob.dp.modelmethod;

/**
 * @author wangzezhou
 * @create 2020-05-29 11:21 AM
 * @desc 模板
 **/
public abstract class Model {


    final void templateMethod(int length) {

        int[] tArray = generateTArray(length);
        printArray(tArray);
        sort(tArray);
        if(hockCondition())
            printArray(tArray);
    }

    abstract int[] generateTArray(int length);

    abstract void printArray(int[] tArray);

    abstract void sort(int[] tArray);

    //一个钩子，子类可以选择覆盖这个钩子实现不同的逻辑
    boolean hockCondition(){
        return true;
    }
}
