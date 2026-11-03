void main(){
    int n=Integer.parseInt(IO.readln("Enter the number of rows: "));
    IO.println(n);
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=Integer.parseInt(IO.readln("Enter the element: "));
    }
    int temp[]=new int[n];
     int k = 0;
    IO.println("after removing duplicates: ");
    for(int i=0;i<n;i++){
        boolean flag = false;
     for(int j=0;j<k;j++){
            if(arr[i]==temp[j]){
                flag = true;
                break;
            }
        }
        if(!flag){         
            temp[k]=arr[i];
            k++;
        }
     }
    for(int i=0;i<k;i++){
        IO.println(temp[i]);
    }

    IO.println("after sorting: ");
    for (int i= 0; i<k; i++) {
        for (int j = i + 1; j < k; j++) {
           if(temp[i] > temp[j]) {
               int t = temp[i];
               temp[i] = temp[j];
               temp[j] = t;
           }
        }
    }
    for(int i=0;i<k;i++){
        IO.println(temp[i]);
    }
}      