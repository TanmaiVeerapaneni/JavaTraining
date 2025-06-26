package Arrays;

public class ArrayNoDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {1,2,3,3,4,4,5,5};
		int n=ar.length;
		
		int tempar[]=new int[n];
		
		int newLength=0;
		
		for(int i=0; i<n; ++i) {
			boolean isDuplicate=false;
			for(int j=0; j<newLength; ++j) {
				if(ar[i]==tempar[j]) {
					isDuplicate=true;
					break;
				}
			}
			if(!isDuplicate) {
				tempar[newLength++]=ar[i];
			}
		}
		//print
		System.out.println("Array without dup:");
		for(int i=0;i<newLength;++i) {
			System.out.println(tempar[i]);
		}
		

	}

}
