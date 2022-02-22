import java.util.*;

class coin_distribution
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int total;
        int coin5;
        int coin2;
        int coin1;

        if(num % 5 < 4)
        {
            coin5 = num / 5 - 1;
            num = 5 + (num % 5);
        } 
        else
        {
            coin5 = num / 5;
            num = num % 5;
        }
        if(num % 2 < 1)
        {
            coin2 = num / 2 - 1;
            num = 2 + (num % 2);
            coin1 = num;
        } 
        else
        {
            coin2 = num / 2;
            num = num % 2;
            coin1 = 1;
        }
        System.out.println((coin5 + coin2 + coin1) + " " + coin5 + " " + coin2 + " " + coin1);

    }
}
