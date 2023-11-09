public class Main {
    public static void main(String[] args) {
        int a= 5;
        int b=3;
        int c= a & b;
        int d = a | b;
        int e = a ^ b;

        System.out.println("AND Result: "+c +"\n"+"OR Result: "+d +"\n"+"XOR Result: "+e);
        System.out.println(" not "+~5);
    }
}