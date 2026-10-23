void main()
{
    int row=Integer.parseInt(IO.readln("Enter the number of rows: "));
    IO.println((row));
    // int col=Integer.parseInt(IO.readln("Enter the number of columns: "));
    // IO.println((col));
    for(int i=1;i<=row;i++)
    {
        for(int j=1;j<=row;j++)
        {
            if(i==1 || i==row || j==1 || j==row)
            {
                IO.print("*");
            }
            else
            {
                IO.print(" ");
            }
        }
        IO.println();
    }
}