package Week5;

import java.util.Scanner;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.poi.util.ArrayUtil;

public class Matrix {

	public static void main(String[] args) {

		//Defining matrix
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number of row in matrix:");
		int rowCount=s.nextInt();
		int matrix[][] = new int[rowCount][rowCount];
		int arrSize = ((rowCount*rowCount)-rowCount)/2;

		//for creating array for elements above diagonal and below diagonal
		int upperDiag[] = new int[arrSize];
		int lowerDiag[] = new int[arrSize];

		//Creating matrix by user input 
		for(int i=0;i<rowCount;i++){
			for(int j=0;j<rowCount;j++){
				System.out.print("Enter the matrix value for Row-"+(i+1)+" Column-"+(j+1)+":");
				matrix[i][j]=s.nextInt();
			}
		}
		s.close();



		int upperDiagSum = 0,lowerDiagSum = 0;
		//pos1 and pos2 are position of elements at diagonal
		int pos1=0,pos2=rowCount-1;//suppose rowcount 4 so diagonal element will be 04 13 22 31 40
		int k=0,l=0;
		
		for(int i=0;i<rowCount;i++){
			for(int j=0;j<rowCount;j++){
				if(matrix[i][j]!=matrix[pos1][pos2])//if element is not diagonal element 
				{
					if(j<pos2){//position of j is less dan diagonal element den it belongs to upper array
						upperDiagSum=upperDiagSum+matrix[i][j];//addition of elements
						upperDiag[k]=matrix[i][j];//creating new array for upper diagonal elements
						k++;
					}
					if(j>pos2){//position of j is greater dan diagonal element den it belongs to upper array
						lowerDiagSum=lowerDiagSum+matrix[i][j];
						lowerDiag[l]=matrix[i][j];//creating new array for lower diagonal elements
						l++;
					}
				}
			}
			pos1=pos1+1;//for shifting diagonal positions for each row
			pos2=pos2-1;//for shifting diagonal positions for each column
		}
		
		System.out.println("sum of upper half:"+upperDiagSum);
		System.out.println("sum of lower half:"+lowerDiagSum);
		System.out.print("half which is greater is ");
		if(upperDiagSum>lowerDiagSum){
			System.out.print(ArrayUtil.toString(upperDiag));
		}else{
			System.out.print(ArrayUtils.toString(lowerDiag));
		}
	}
}

	}

}
