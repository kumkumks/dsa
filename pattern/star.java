void main()
{
    int row=Integer.parseInt(IO.readln("Enter the number of rows: "));
    IO.println((row));
    int col=Integer.parseInt(IO.readln("Enter the number of columns: "));
    IO.println((col));
    for(int i=0;i<=row;i++)
    {
        for(int space=col-i;space>=1;space--)
        {
            IO.print(" ");
        }
        for(int j=1;j<=i;j++)
        {
            IO.print("*");
        }
        IO.println();
    }
}