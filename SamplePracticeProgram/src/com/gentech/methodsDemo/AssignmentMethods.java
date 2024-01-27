package com.gentech.methodsDemo;
class ReturnArrayMethods {
	int[] return1DReverseArray(int[] a) {
		int[] rev = new int[a.length];
		int index=0;
		for(int i = a.length-1; i>=0; i--) {
			rev[index] = a[i];
			index++;
		}
		return rev;
	}
	
	double[] ReturnSecondHalfArray(double[] d) {
		
		int middle = (d.length%2==0)?d.length/2:(d.length/2)+1;
		double[] secondHalf = new double[d.length-middle];
		int count=0;
		for(int i=middle; i<d.length; i++, count++) {
			secondHalf[count] = d[i];
		}
		return secondHalf;
	}
	int returnSum1DArray(int[] a) {
		int sum=0;
		for(int i=0; i<a.length; i++) {
			sum+=a[i];
		}
		return sum;
	}
	int[] returnOddNum(int start, int last) {
		int elements = (last-start);
		int size= elements%2==0?elements/2:(elements/2)+1;
		int[] a = new int[size];
		int index=0;
		for(int i=start; i<=last; i++) {
			if(!(i%2==0)) {
				a[index]=i;
				index++;
			}
		}
		return a;
	}
	int[] returnCubeArray(int start, int last) {
		int size = last-start;
		int[] ret = new int[size+1];
		for(int i=start,j=0; i<=last; i++,j++) {
			ret[j]=(int)Math.pow(i, 3);
		}
		return ret;
	}
	int[] returnFirstColumnArray(int[][] a) {
		int[] c = new int[a.length];
		for(int i=0; i<a.length; i++) {
			c[i]=a[i][0];
		}
		return c;
	}
	int returnSumOfFirstRow(int[][] a) {
		int sum=0;
		for(int i=0; i<a[0].length; i++) {
			sum+=a[0][i];
		}
		return sum;
	}
	int returnCountDivisibleBy2n4n6(int start, int last) {
		int count=0;
		for(int i=start; i<last; i++) {
			if(i%2==0&&i%4==0&&i%6==0) {
				count++;
			}
		}
		return count;
	}
	int[][] returnTransposeMatrix(int[][] a) {
		int[][] c = new int[a[0].length][a.length];
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				c[j][i] = a[i][j];
			}
		}
		return c;
	}
	
}
public class AssignmentMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnArrayMethods am = new ReturnArrayMethods();
		int[] a = {1,2,3,4,5,6,7,8,9};
		System.out.println("+++++++++Printing returned Reverse Array+++++++++");
		int[] rev = am.return1DReverseArray(a);
		for(int i=0; i<rev.length; i++) {
			System.out.print(rev[i]+" ");
		}
		System.out.println();
		System.out.println("+++++++++printing second half double Array+++++++");
		double[] da = {1.0,2.0,3.0,4.0};
		double[] halfD = am.ReturnSecondHalfArray(da);
		for(double d: halfD) {
			System.out.print(d+" ");
		}
		System.out.println();
		System.out.println("++++++++++++printing sum of 1D array+++++++++++++");
		System.out.println(am.returnSum1DArray(a));
		System.out.println();
		System.out.println("++++++++++++printing odd of 1D array+++++++++++++");
		int[] odd = am.returnOddNum(1, 20);
		for(int i=0; i<odd.length; i++) {
			System.out.print(odd[i]+" ");
		}
		System.out.println();
		System.out.println("++++++++++++printing cube of 1D array+++++++++++++");
		int[] cube = am.returnCubeArray(10, 20);
		for(int i=0; i<cube.length; i++) {
			System.out.print(cube[i]+", ");
		}
		System.out.println();
		System.out.println("++++++++++++printing 1st col of array+++++++++++++");
		int[][] a2D = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		int[] col = am.returnFirstColumnArray(a2D);
		for(int i=0; i<col.length; i++) {
			System.out.print(col[i]+" ");
		}
		System.out.println();
		System.out.println("+++++++++++++printing first row sum+++++++++++++++");
		System.out.println(am.returnSumOfFirstRow(a2D));
		System.out.println();
		System.out.println("++++++++printing count divisible by 2,4,6++++++++++");
		System.out.println(am.returnCountDivisibleBy2n4n6(1, 200));
		System.out.println();
		System.out.println("++++++++++++printing transposed Matrix+++++++++++++");
		int[][] t = am.returnTransposeMatrix(a2D);
		for(int i=0; i<t.length; i++) {
			for(int j=0; j<t[i].length; j++) {
				System.out.print(t[i][j]+" ");
			}
			System.out.println();
		}
	}

}
