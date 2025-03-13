public class vowel
{
    public static void main(String args[])
    {
        int a=3;
        if(a<=10)
        {
            if(a<=5)
            {
                if(a%2==0)
                {
                    System.out.println(a+"is even number");
                }
                else
                {
                    System.out.println(a+"is odd number");
                }
            }
        }
        else
        {
            System.out.println("invalid");
        }
    }
}