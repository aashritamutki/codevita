// dynamic programming

import java.util.*;

public class common_steps {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int steps = in.nextInt();
        int result = 0;
        if(steps == 0 || steps == 1)
        {
            result = 1;
        }
        else if(steps == 2)
        {
            steps = 2;
        }
        else{
            int result_1 = 2;
            int result_2 = 1;
            int result_3 = 1;
            
            for(int i = 3; i <= steps; i++)
            {
                result = result_1 +result_2 + result_3;
                result_3 = result_2;
                result_2 = result_1;
                result_1 = result;
            }
        }
        System.out.println(result);
    }
}





