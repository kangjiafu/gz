package gzsb;

/**
 * @author kangjiafu
 * @date 2021/4/27 17:31
 */
public class main3 {
    public static void main(String [] args)  throws Exception {
   /*     try{
            setSex("afaqfae");
        }catch (Exception e ){
            System.out.println("上级处理下级抛出的异常");
    }*/
        setSex("sfwf");

    }

    public static void setSex(String sex ) throws  Exception{
        if ( ! (sex.equals("男") || sex.equals("女")) ){
            System.out.println("发现了异常全款，无法处理，交给上级处理");
            throw new Exception("发现了异常情况，无法处理，交给上级处理");
        }
        }
    }

