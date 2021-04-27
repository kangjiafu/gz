package gzsb;

/**
 * @author kangjiafu
 * @date 2021/4/27 17:51
 */
public class main4 {
    public static void main(String [] args)  throws SexException {
        try{
            setSex("afaqfae");
        }catch (Exception e ){
            System.out.println("上级处理下级抛出的异常");
    }


    }

    public static void setSex(String sex ) throws  SexException{
        if ( ! (sex.equals("男") || sex.equals("女")) ){
            //System.out.println("发现了异常全款，无法处理，交给上级处理");
            throw new SexException("发现了异常情况，无法处理，交给上级处理");
        }
    }
}

