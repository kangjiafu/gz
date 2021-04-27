package gzsb;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author kangjiafu
 * @date 2021/4/27 16:58
 */
public class main2 {
    public static void main(String[] args) {
  /*   int[] a = new int[2];
       Scanner scanner = new Scanner(System.in);
       try {
         int i = scanner.nextInt();
         int j = scanner.nextInt();
         a[0] = i;
         a[2] = j;
            System.out.println(a[0] + a[1]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("越界异常");
        } catch (InputMismatchException e) {
            System.out.println("数据格式不对");
        } catch (AbstractMethodError e) {
            System.out.println("算术异常");
        }*/
        int [] a = new int[2];
        Scanner scanner = new Scanner(System.in);
        try {
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            a[0] = i;
            a[2] = j;
            System.out.println(a[0] / a[1]);
        }catch (IndexOutOfBoundsException | InputMismatchException | ArithmeticException e ){
            System.out.println("其中的一个错误");
        }
    }
}
