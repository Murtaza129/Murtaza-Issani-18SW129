class qtwo{
public static void main(String args[]){
boolean a=true;
boolean b = false;
boolean c = a & b;
boolean d = a | b;
boolean e = a ^ b;
boolean f = (!a & b) | (a&!b);
System.out.println("a="+a);
System.out.println("b="+b);
    if(c==false)
        System.out.println("working if statement");
System.out.println("AND="+c);
System.out.println("OR="+d);
System.out.println("NOT"+f);
System.out.println("XOR"+e);

}
}
