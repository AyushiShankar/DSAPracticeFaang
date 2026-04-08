class Solution {
    public int NnumbersSum(int N) {
        if(N==1){
            return 1;
        }
        return N+NnumbersSum(N-1);
    }


    public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        if(n>0)
        {
           System.out.println( NnumbersSum( n));
        }
    }
}