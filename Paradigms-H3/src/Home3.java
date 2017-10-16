import java.util.Arrays;
import java.util.Random;

public class Home3 {

	public static int[] array = new int[100];
	public static void main(String[] args) {
		int length;
		// Exercise 1 and 2
		/*
		createArray(array);
		length = findPositiveSequence(array);
		System.out.println(length);
		*/
		//Exercise 3
		/*
		length = maxDiff(array,array.length);
		System.out.println(length);
		*/
		//Exercise 4
		/*
		fun1(array);
		*/
		//Exercise 5
		/*
		bubbleSort(array);
		*/
		//Exercise 6
		/*
		overloadSort(array);
		*/
		//Exercise 7
		/*
		Ack(2,1);
		*/
		//Exercise 8
		/*
		Binary search= new Binary();

        search.search(1, 100,33 );
        */
	}
	private static void overloadSort(int[] array2) {
		Arrays.sort(array2);
		
	}
	public static int[] createArray(int[] array)
	{
		Random rn = new Random();
		for(int i=0; i < array.length;i++)
		{
			array[i] = rn.nextInt(100);
		}
		return array;
		
	}
	
	public static int findPositiveSequence(int[] array)
    {
        int maxSequenceStartIndex = 0;
        int maxSequenceLength = 0;
        int currentSequenceStartIndex = 0;
        int currentSequenceLength = 0;
        for (int i = 0; i < array.length; i++)
        {
            if((array[i] & 2) != 0)
            {
                if(currentSequenceLength > maxSequenceLength)
                {
                    maxSequenceLength = currentSequenceLength;
                    maxSequenceStartIndex = currentSequenceStartIndex;
                }
                currentSequenceStartIndex = i + 1;
                currentSequenceLength = 0;
            }
            else
            {
                currentSequenceLength++;
            }
        }

        if(currentSequenceLength > maxSequenceLength)
        {
            maxSequenceStartIndex = currentSequenceStartIndex;
            maxSequenceLength = currentSequenceLength;
        }

        int maxSequenceEndIndex = maxSequenceStartIndex + maxSequenceLength;
        return maxSequenceLength;
    }
	
	  public static int maxDiff(int arr[], int arr_size) 
	    {
	        int max_diff = 0;
	        int i, j;
	        for (i = 0; i < arr_size; i++) 
	        {
	            for (j = i + 1; j < arr_size; j++) 
	            {
	                if (arr[j] - arr[i] > max_diff)
	                    max_diff = arr[j] - arr[i];
	            }
	        }
	        return max_diff;
	    }
	  
	  public static int[] fun1(int array[])
	  {
		  for(int i = 0; i < array.length / 2; i++)
		  {
		      int temp = array[i];
		      array[i] = array[array.length - i - 1];
		      array[array.length - i - 1] = temp;
		  }
		  return array;
	  }
	  
	  public static void bubbleSort(int[] numArray) {

		    int n = numArray.length;
		    int temp = 0;

		    for (int i = 0; i < n; i++) {
		        for (int j = 1; j < (n - i); j++) {

		            if (numArray[j - 1] > numArray[j]) {
		                temp = numArray[j - 1];
		                numArray[j - 1] = numArray[j];
		                numArray[j] = temp;
		            }

		        }
		    }
		}

	public static int Ack(int m, int n) {

		//I assume that you check that n and m are non-negative before you run this
	    if (m == 0) {
	         return n + 1;
	    } else if (n == 0) {
	        return Ack(m - 1, 1);
	    } else {
	        return Ack(m - 1, Ack(m, n - 1));
	    }
	}
	
	
	  

}
