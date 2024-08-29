public class call_by_refference {
    int a=10;

    void update(call_by_refference r){
       r.a=r.a+200;
    }

    public static void main(String[] args){
call_by_refference obj=new call_by_refference();
System.out.println("before update: "+obj.a);

obj.update(obj);
System.out.println("after update: "+ obj.a);

    }}