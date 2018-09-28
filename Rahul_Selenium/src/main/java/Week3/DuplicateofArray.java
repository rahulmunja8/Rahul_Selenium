package Week3;

public class DuplicateofArray {

	public static void main(String[] args) {
		int [] array1 = {13,65,15,67,88,65,13,99,67,13,65,87,13};
		int l = array1.length;
			
		System.out.print("The Duplicate Numbers are : ");
		for (int i=0;i<l;i++){
			
			for (int j=0;j<l;j++){
				
				if (i==j){
					continue;
				}
				
				else if (array1[i]==array1[j]){
					
					System.out.print(array1[i]+"\t");
				}
				
			}
			
		}
		
	}

}