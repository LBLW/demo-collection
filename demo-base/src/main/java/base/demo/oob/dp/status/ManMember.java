package base.demo.oob.dp.status;

import lombok.AllArgsConstructor;

/**
 * @author wangzezhou
 * @create 2020-06-01 12:26 PM
 * @desc 男干员
 **/

@AllArgsConstructor
public class ManMember {

    private State stateA;
    private State stateB;

    public void request(String state){

        if(state.equals("A")) stateA.handle();
        else stateB.handle();

    }
}
