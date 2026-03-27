//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public static void main(String[] args) {

    int divisibleCount = 0;

    for (int num = 1; num <= 300; num++)  
    {
        if (isDivisibleByPrime(num))
        {
            divisibleCount++;
        }
    }

    double percentage = (divisibleCount / 300.0) * 100;

    System.out.println("Percentage = " + percentage + "%");
}

public static boolean isDivisibleByPrime(int n)
{
    for (int p = 2; p <= 300; p++)
    {
        if (isPrime(p) && n % p == 0)
        {
            return true;
        }
    }
    return false;
}

public static boolean isPrime(int n)
{
    if (n < 2) return false;
    for (int i = 2; i * i <= n; i++)
    {
        if (n % i == 0) return false;
    }
    return true;
}