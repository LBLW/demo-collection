package base.demo.oob.dp.modelmethod;

import com.demo.util.ArrayUtil;

/**
 * @author wangzezhou
 * @create 2020-05-29 11:35 AM
 * @desc 具体方法
 **/
public class ModelImplement extends Model {

    @Override
    int[] generateTArray(int length) {
        return ArrayUtil.generateIntegerArray(length);
    }

    @Override
    void printArray(int[] tArray) {
        ArrayUtil.displayIntegerArray(tArray);
    }

    @Override
    void sort(int[] tArray) {

        for(int i=0; i<tArray.length; i++) {
            for(int j=1; j<tArray.length-i; j++) {
                if(tArray[j] < tArray[j-1] ) {
                    int temp = tArray[j-1];
                    tArray[j-1] = tArray[j];
                    tArray[j] = temp;
                }
            }
        }
    }

    boolean hockCondition() {
        return false;
    }
}


