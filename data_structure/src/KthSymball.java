public class KthSymball {
    public int solve(int n,int e){
        if(n==0|| e==0){
            return 0;
        }
        int value = (int) Math.pow(2,n-1);
        if(e<=(value/2)){
            return solve(n-1,e);
        }
        else{
            return solve(n-1,value-e)^1;
        }
    }
    public static void main(String[] args) {
        KthSymball kthSymball = new KthSymball();
        System.out.print(kthSymball.solve(3,1));
    }
}
