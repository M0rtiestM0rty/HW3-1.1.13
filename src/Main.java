/*Write a code fragment to print the transposition
(rows and columns changed) of a two-dimensional array with M rows and N columns */

class Main
{
    public static void main(String[] args)
    {
        int [][] myNumbers = {{1,2,3},
                             {4,5,6},
                             {7,8,9}};

        System.out.println("Original array:");

        for (int m = 0; m < myNumbers.length; m++)
        {
            for (int n = 0; n < myNumbers[0].length; n++)
            {
                System.out.print(myNumbers[n][m] + " ");
            }//end n for loop
            System.out.println();
        }//end m for loop
/// //////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Transposed array:");

        int [][] transposed = new int[myNumbers[0].length][myNumbers.length];

        for(int m = 0; m < myNumbers.length; m++)
        {
             for(int n = 0; n < myNumbers.length; n++)
             {
                 transposed [n][m] = myNumbers[m][n];
                 System.out.print(transposed[n][m] + " ");
             }//end 2nd n for loop
        System.out.println();
        }// end 2nd m for loop

    }//end main
}//end class