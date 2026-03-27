//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    int[] toys ={1, 6, 7, 9, 5, 7, 3};
    double[] priceOfToys={2.5, 3.6, 8.9, 7.5, 2.0, 2.3, 6,3};

    int totalSum=0;

    for(int i=0; i<toys.length; i++)
    {
        totalSum+=toys[i]*priceOfToys[i];
    }
    System.out.println(totalSum);
}
