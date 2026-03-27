//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main()
{
    String combo;
    for (int i = 0; i <= 9; i++)
    {
        for(int j = 0; j <= 9; j++)
        {
            for(char c1 = 'A'; c1 <= 'Z'; c1++)
            {
                for(char c2 = 'A'; c2 <= 'Z'; c2++)
                {
                    for(int k = 0; k <=9; k++)
                    {
                        combo = "" + i + j + c1 + c2 + k;
                        System.out.println(combo);
                    }
                }
            }
        }
    }

}
