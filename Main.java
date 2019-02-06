import java.util.*;
/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num;
        int result = 0;
        
        System.out.println("Gimmi a number, any number!");
        num = sc.nextInt();
        
        for(int i = 0; i <= num; i++)
        {
            result += i;
        }
        
        System.out.printf("The sum of all numbers from 1 to %d is %d\n!", num, result);

    }
}
