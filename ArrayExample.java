class ArrayExample {

	int arr[] = new int[10];
// declaration => int arr[];
// instatiation => arr= new int[10];

	void getData()
	{
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		arr[5]=6;
		arr[6]=7;
		arr[7]=8;
		arr[8]=9;
		arr[9]=10;
		//arr[10]=11; => ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10 & it is a Run-time Error
// int arr[]= {1,2,3,4,5,6,7,8,9};

	}
	void display()
	{
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}
public static void main(String args[]){
	Array obj = new Array();
	obj.getData();
	obj.display();

}

}