/* tjudge3 - Assignement for creating a basic Multi Dimensional Array */
//Nothing fancy, named everyhing "pi" and then chose the digits of pi for the array
//Has nothing to really do with pi though
class MultiDimArray 
{
    public static void piDisplay(int[] piRow)
    {
        for (int i : piRow) 
        {
            System.out.print(i);
            System.out.print("\t");
        }
        System.out.println();
    }
    public static void main(String[] args) 
    {
        int[][] piGrid = 
        {
                {3, 1, 4},
                {2, 5, 9},
                {2, 6},
                {5, 3}
        };
        for(int[] piRow : piGrid) 
        {
        	piDisplay(piRow);
        }
    }
}
