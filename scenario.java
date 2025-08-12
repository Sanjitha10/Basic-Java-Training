class scenario{
    public static void main(String[] args) {
        int n=9;
        int a=1;
        int b=1;
        int c = 0;
        for(int i=2;i<=n;i++){
        c=a+b;
        a=b;
        b=c;
        }
        System.out.println(c);
    }
}

//if we want to find scenario based questions and find no of ways questions we use fibanocci series.