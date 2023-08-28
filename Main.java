public class Main{
	public static void main(String[] args){
	    //selection sort
	    short[] arr = {4, 2, 3, 7, 6, 9, 8, 1, 0, 5};
	    for(int i = 0; i < arr.length - 1; i++){ // ignore the last element case because we can no longer swap elements
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] > arr[j]){// sort ascending
                    short mid = arr[i];
                    arr[i] = arr[j];
                    arr[j] = mid;
                }
            }
	    }
	    for(short item : arr){
            System.out.print(item + " "); // iterate over arr array and print each element
	    }
	    // this is my first java application!

//	    int a, b, c;
//	    a = b = c = 69;
//	    String text = "value of a + b + c : ";
//	    long longVariable = 1000000L;
//	    double doubleVariable = longVariable;
//	    long longVariable1 = (long) doubleVariable;
//		int ranNum = (int) ((Math.random()*7) + 1);
//		System.out.println("random number: " + ranNum);
//		System.out.print(text);
//		System.out.println(a + b + c);
//		System.out.println("value of doubleVariable : " + doubleVariable);
//		System.out.println("value of longVariable1 : " + longVariable1);
	}
}
