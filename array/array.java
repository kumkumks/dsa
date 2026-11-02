void main(){
    int n=Integer.parseInt(IO.readln("Enter the number of rows: "));
    IO.println(n);
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=Integer.parseInt(IO.readln("Enter the element: "));
    }
    int smallest = arr[0];
    int largest = arr[0];
    for(int i=0;i<n;i++){
        
       if(arr[i]>smallest && arr[i]!=smallest && arr[i]<largest){
        smallest =arr[i];
       }
    }
       IO.println(smallest);
}      