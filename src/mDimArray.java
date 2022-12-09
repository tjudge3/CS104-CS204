/* tjudge3 - Final - Multidimensional Array*/
//The final just asked us to make another Multidimensional Array
//It's very similar to the one done for the regular assignment
class mDimArray 
{
    public static void treeDisplay(int[] treeRow) 
    {
        for (int t : treeRow) 
        {
            System.out.print(t);
            System.out.print("\t");
        }
        System.out.println();
    }
    public static void main(String[] args) 
    {
        int[][] treeGrid = 
        {
                {4, 4, 4},
                {4, 4, 4},
                {4, 4},
                {4, 4}
        };
        for(int[] treeRow : treeGrid) 
        {
        	treeDisplay(treeRow);
        }
    }
}
