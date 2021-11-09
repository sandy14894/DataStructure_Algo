package importProduct;

class problem1
{	
	
	
	public static void sortSumMethod(int[] arr) {
		int sum = 0;
        for(int i : arr)
        {
        	sum += i;
        }
        for(int i=arr.length-1; i>=0; i--)
        {	
        	if(sum > 0)
        	{
        		arr[i] = 1;
        		sum--;
        	}
        	else
        		arr[i] = 0;
        }
        //return arr;
    }
	
	public static void sortSwap(int []arr)
	{
		int left = 0;
		int right = arr.length-1;
		
		while(left < right)
		{
			if(arr[left] > arr[right])
			{
				arr[left] = 0;
				arr[right] = 1;
				left++;
				right--;
			}
			else if(arr[left] == 1)
				right--;
			else if(arr[left] == 0)
				left++;
		}
	}
	
	public static void main(String ...args) throws InterruptedException
	{
		int[] arr = {1,0,0,1,0,0,1,0};
		
		sortSwap(arr);
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]);
			if(i != arr.length-1)
				System.out.print(",");
		}
	}
}