package mainHome;

public class spiral2DArray {

	public static void main(String[] args) {
		int[][] arr =  {{ 1, 2, 3, 4, 5, 6},
						{ 7, 8, 9,10,11,12},
						{13,14,15,16,17,18},
						{19,20,21,22,23,24},
						{25,26,27,28,29,30}};
		spiralPrint (arr.length ,arr[0].length ,arr); 
	}
	public static void spiralPrint(int m, int n, int arr[][])
	{
	    int i, k = 0, l = 0;
	    while (k < m && l < n)
	    {
	        for (i = 0; i < n; i++)
	        {
	        	System.out.print(arr[k][i]);
	        	System.out.print(" ");
	            //( a[k][i]);
	        }
	        k++;
	        for (i = k; i < m; i++)
	        {
	        	System.out.print(arr[i][n-1]);
	        	System.out.print(" ");
	            //( a[i][n-1]);
	        }
	        n--;
	        if ( k < m)
	        {
	            for (i = n-1; i >= l; i--)
	            {
	            	System.out.print(arr[m-1][i]);
	            	System.out.print(" ");
	                //(a[m-1][i]);
	            }
	            m--;
	        }
	        if (l < n)
	        {
	            for (i = m-1; i >= k; i--)
	            {
	            	System.out.print(arr[i][0]);
	            	System.out.print(" ");
	                //( a[i][l]);
	            }
	            l++;    
	        }        
	    }
	}
}
