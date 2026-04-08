class Solution {
    public int factorial(int n) {
        if(n ==0)
        return 1;

        int fact = n * factorial(n-1);
        return fact;

    }
    public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(factorial(num));

    }
}