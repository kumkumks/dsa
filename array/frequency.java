void main(){
    int n=Integer.parseInt(IO.readln("Enter the number of rows: "));
    IO.println(n);
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=Integer.parseInt(IO.readln("Enter the element: "));
    }
    int temp[]=new int[n];
     int k = 0;
     boolean visited[] = new boolean[n];
    IO.println("The frequency of each element is: ");
    for(int i=0;i<n;i++){
        int count=0;
        if(visited[i]) {
            continue;
        }
        for(int j=0;j<n;j++){
            if(arr[i]==arr[j]){
                count++;
                visited[j] = true;
            }
        }
          IO.println(arr[i]+" occurs "+count+" times");
    }

}      