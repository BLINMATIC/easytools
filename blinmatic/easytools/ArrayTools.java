package blinmatic.easytools;


public class ArrayTools 
{
    public static Object[] append(Object[] array, Object new_item) 
    {
        int n = array.length;
        Object[] new_array = new Object[n + 1];

        for (int i = 0; i < n; i++) 
        {
            new_array[i] = array[i];
        }

        new_array[n] = new_item;
        return new_array;
    }
}
