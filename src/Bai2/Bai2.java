package Bai2;

public class Bai2 {
	static int n=4;
	static int max2duongcheochinh(int a[][], int n){
	    int firstMax, secondMax;
	    if (a[0][0] > a[1][1]){
	        firstMax = a[0][0];
	        secondMax = a[1][1];
	    }else{
	        firstMax = a[1][1];
	        secondMax = a[0][0];
	    }
	    for(int i = 2; i < n; i++){
	        if(a[i][i] >= firstMax){
	            secondMax = firstMax;
	            firstMax = a[i][i];
	        }else if (a[i][i] > secondMax){
	            secondMax = a[i][i];
	        }
	    }
	    return secondMax;
	}
	static int max2duongcheophu(int a[][], int n){
		int m=n-1;
	    int firstMax, secondMax;
	    if (a[0][m] > a[1][m-1]){
	        firstMax = a[0][m];
	        secondMax = a[1][m-1];
	    }else{
	        firstMax = a[1][m-1];
	        secondMax = a[0][m];
	    }
	    for(int i = 2; i < n; i++){
	    	 for(int j = 0; j < n; j++){
	    		 if (i+j == m) {
	    			// System.out.println(a[i][j]);
	    			 if(a[i][j] >= firstMax){
	    		            secondMax = firstMax;
	    		            firstMax = a[i][j];
	    		        }else if (a[i][j] > secondMax){
	    		            secondMax = a[i][j];
	    		        }
	    		 } 
	    	 }
	    }
	    return secondMax;
	}
	static int tongduongcheochinh(int a[][], int n){
		int tong = 0;
	    for(int i = 0; i < n; i++){
	    	tong=tong+a[i][i];
	    }
	    return tong;
	}
	static int tongduongcheophu(int a[][], int n){
		int tong = 0;
		int m=n-1;
		  for(int i = 0; i < n; i++){
		    	 for(int j = 0; j < n; j++){
		    		 if (i+j == m) {
		    			 tong=tong+a[i][j];
		    		 } 
		    	 }
		    }
	    return tong;
	}
	static int maxbiendoc(int a[][], int n) {
		int max = a[0][0];
		int m=n-1;
		 for(int i = 0; i < n; i++){
			if(a[i][m]>max)
			{
				max=a[i][m];
			}
	    };
		 for(int i = 0; i < n; i++){
				if(a[m][i]>max)
				{
					max=a[m][i];
				}
		    };
		 for(int i = 0; i < n; i++){
				if(a[0][i]>max)
				{
					max=a[0][i];
				}
		    };
		 for(int i = 0; i < n; i++){
				if(a[i][0]>max)
				{
					max=a[i][0];
				}
		    };
		return max;
	}
    public static void main(String[] args) {
    	 int[][] A = new int[n][n];
    	 A[0][0] = 50; 
    	 A[0][1] = -1; 
    	 A[0][2] = 22; 
     	 A[0][3] = 77; 
    	 A[1][0] = 1; 
    	 A[1][1] = 55; 
    	 A[1][2] = 50; 
    	 A[1][3] = 100; 
    	 A[2][0] = 7; 
    	 A[2][1] = 46; 
    	 A[2][2] = 30;
    	 A[2][3] = 40;
    	 A[3][0] = 60; 
    	 A[3][1] = 99; 
    	 A[3][2] = 88;
    	 A[3][3] = 49;
    	 System.out.println("Mảng vừa nhập: ");
    	    for (int i = 0; i < n; i++) {
    	        for (int j = 0; j < n; j++) 
    	            System.out.print(A[i][j] + "\t");
    	        System.out.println("\n");   
    	    }
    	    System.out.println("Lớn thứ 2 đường chéo chính :"+max2duongcheochinh(A, n));
    	    System.out.println("Lớn thứ 2 đường chéo phụ :"+max2duongcheophu(A, n));
    	    System.out.println("Tổng đường chéo chính :"+tongduongcheochinh(A, n));
    	    System.out.println("Tổng đường chéo phụ :"+tongduongcheophu(A, n));
    	    System.out.println(maxbiendoc(A, n));
    	    for (int i = 0; i < n; i++) {
    	        for (int j = 0; j < n; j++) 
    	           if (A[i][j]==-1) {
    	        	   A[i][j]=maxbiendoc(A, n);
    	           } 
    	    }
    	    System.out.println("Mảng sau khi thay: ");
    	    for (int i = 0; i < n; i++) {
    	        for (int j = 0; j < n; j++) 
    	            System.out.print(A[i][j] + "\t");
    	        System.out.println("\n");   
    	    }
    }
}
