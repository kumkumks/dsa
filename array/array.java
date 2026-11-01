void main(){
    int n=Integer.parseInt(IO.readln("Enter the number of rows: "));
    IO.println(n);
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=Integer.parseInt(IO.readln("Enter the element: "));
    }
    int largest = arr[0];
    for(int i=0;i<n;i++){
        
       if(arr[i]>largest){
        largest =arr[i];
       }
    }
       IO.println(largest);
}      