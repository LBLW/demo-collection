package base.demo.gc;

/**
 * @author wangzezhou
 * @create 2020-08-31 2:34 PM
 * @desc finlize方法防止gc回收对象
 **/
public class FinalizeEscapeGC {

    public static FinalizeEscapeGC SAVE_HOCK = null;

    public void isAlive(){
        System.out.println("yes i am still alive :");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("finalize method executed!");
        FinalizeEscapeGC.SAVE_HOCK = this;
    }

    public static void main(String[] args) throws InterruptedException {
        SAVE_HOCK = new FinalizeEscapeGC();

        SAVE_HOCK = null;

        System.gc();

        Thread.sleep(500);

        if(SAVE_HOCK != null) {
            SAVE_HOCK.isAlive();
        } else {
            System.out.println("no i am dead...");
        }

        SAVE_HOCK = null;

        System.gc();

        Thread.sleep(500);

        if(SAVE_HOCK != null) {
            SAVE_HOCK.isAlive();
        } else {
            System.out.println("no i am dead...");
        }
    }
}
