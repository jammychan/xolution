
class Apple {
    
    public static void main(String[] args) {
        System.out.println(f(7));
        System.out.println(f(8));
        System.out.println(f(11));
        System.out.println(f(51));
    }
    
    private static int[] max = new int[]{0, 0, 7, 7, 14};
    private static int f(int n) {
        return n<5 ? max[n] : Math.max(f(n-5)+20, f(n-2)+7);
    }
    
    /*
     if (n<2) {
     return 0;
     } else if (n == 2) {
     return 7;
     } else if (n < 5) {
     return f(n-2) + 7;
     } else {
     return Math.max(f(n-5)+20, f(n-2)+7);
     }
     */
}