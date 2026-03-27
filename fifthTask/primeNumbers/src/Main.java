//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main()
{
    for(int n = 2; n <= 300; n++)
    {
        if(isPrime(n))
        {
            System.out.println(n);
        }
    }


}

public static boolean isPrime(int n)
{
    if (n < 2){
        return false;
    }

    for(int i = 2; i * i <= n; i++)
    {
        if(n % i == 0)
        {
            return false;
        }
    }
    return true;
}
