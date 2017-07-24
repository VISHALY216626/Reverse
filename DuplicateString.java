class Check{
    int [] n=new int [5];
    Scanner in=new Scanner(System.in);
    boolean b=true;
    int temp=-1;

    void show(){
        System.out.println("Write five numbers");
        for(int i=0;i<n.length;i++){
        numbers[i]=in.nextInt();
    }

    System.out.print("\nNumbers that are repeated: ");
    for(int i=0;i<n.length;i++){

        if(!b)
        {
            System.out.print(temp + " ");
        }

        b=true;
        temp=n[i];
        for(int j=0;j<n.length;j++){
            if(i!=j&&temp==n[j]&&n[j]!=-2)
            {
                b=false;
                n[j]=-2;
            }
        }
    }

}
