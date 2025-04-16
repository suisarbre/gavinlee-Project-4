
/**
 * Use a double recursion to compute the maximum of an array of values.
 * 
 * @author Charles Hoot
//- * @version 5.0
//vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv        
 * @version 5.1 (Modified for the Solution)
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
 */
public class RecursiveMaxOfArray
{

    
    /**
     * Compute the maximum of a range of values in an array recursively.
     *
     * @param data   An array of integers.
     * @param from  The low index for searching for the maximum.
     * @param to    The high index for searching for the maximum.
     * 
     * preconditions: from LTE Zero to, from LTE 0, to LT length, length GT 0
     *                
     * @return     The maximum value in the array.
     */
    
    public  int max(int data[], int from, int to)
    {
        //check for bad arguments
        if (data == null||
            data.length < 1||
            from > to||
            from < 0||
            to >= data.length)
        {
            throw new BadArgumentsForMaxException("check arguments");
        }
        //base case
        if (from == to){
            return data[from];
        }
        int mid = from + ((to - from) / 2);
        return Math.max(max(data,from,mid),max(data,mid+1,to));
    }
}
