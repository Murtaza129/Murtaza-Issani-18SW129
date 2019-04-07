class Result{
public static void main(String args[]){
String name="MurtazaIssani";
boolean possibility;
int totalmarks=400;
int gotmarks=350;//don't know yet,for operation use only.
    float percent=((float)gotmarks / totalmarks)*(int)100;
    System.out.println(name);
    System.out.println("\nTotal Marks:"+totalmarks);
System.out.println("\nMARKS GOT:"+gotmarks);
    System.out.println("\nPERCENTAGE:"+percent+"%");
    if(percent>=40){
        System.out.println("\nPASS");
        possibility=true;
    }
    
    if(percent<=39)
    {
        System.out.println("\nFAIL");
        possibility=false;
    }
        
}
} 
