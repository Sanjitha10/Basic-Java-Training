class frequency{
    public static void main(String[] args) {
        String str="Sanjitha";
        int[] freq=new int[256];
        for(char ch1:str.toCharArray())
            freq[ch1]++;
            for(char ch1:str.toCharArray()){
                if(freq[ch1]!=0){
                    System.out.println(ch1+"-"+freq[ch1]);
                    freq[ch1]=0;
                }

        }

    }
}