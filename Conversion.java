class Conversion{
public static void main(String[] args){
double d=20.25;
    System.out.print("Original Number:\n"+d);
int ab;
long a;

ab=(int)d;
    a=(long)ab;
    System.out.println("\nConverted From double to int AND int to Long:\n"+a);
    double b= ( d - ab);
    System.out.println("Retrieved And Seperated Fractional part:\n"+b);

}
}
