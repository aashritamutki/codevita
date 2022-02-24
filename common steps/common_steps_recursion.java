// recursion

import java.util.*;

public class common_steps_recursion {

    static int find_ways(int steps)
    {
        if(steps == 0 || steps == 1)
        {
            return 1;
        }
        else if(steps == 2)
        {
            return 2;
        }
        else
        {
            return find_ways(steps - 1) + find_ways(steps - 2) + find_ways(steps - 3);
        }
    }
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int steps = in.nextInt();
        int result = find_ways(steps);
        System.out.println(result);
    }
}





