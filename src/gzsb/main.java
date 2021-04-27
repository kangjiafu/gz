package gzsb;

/**
 * @author kangjiafu
 * @date 2021/4/27 16:45
 */
public class main {
    public static void main(String [] args){
        int divisor = 100;
        int dividend = 0;
        try{
            System.out.println( divisor / dividend);
        }catch (Exception e ){
            //e.printStackTrace();
            System.out.println("除数不能为0");
       } finally {

            System.out.println("必须要执行的步骤,一定会执行");
        }

        System.out.println("哈哈哈哈哈哈");
    }
}
