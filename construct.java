 public class construct {
private String name;
construct(){
    System.out.println("constructor called:");
 name ="program";}
 public static void main (String[]args){
    construct obj=new construct();
    System.out.println("The name is "+obj.name);
 }


}
