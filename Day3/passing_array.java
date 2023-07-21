public class passing_array {
    static void min(int arr[])//int arr[]=a=100
    {
        int min1=arr[0]; //{33,3,4,5} min1=33
        for(int i=1;i<arr.length;i++){ //i=1 2<4
            if(min1>arr[i]) //33>3 //3>4 false //3>5
                min1=arr[i]; //min1=3 min=3 min=3
        }
        System.out.println(min1);
    }
    public static void main(String[] args) {
        int a[]={33,2,3,4,5}; //declaring the array 
        System.out.print("Min value in array is ");
        min(a);
    }
}
