public class call_by_value {
    int a=10;

    void update(int u){
       a=a+u;
    }

    public static void main(String[] args){
        call_by_value obj =new call_by_value();
        System.out.println("before update: "+obj.a);
        obj.update(200);
        System.out.println("after update:"+obj.a);
    }
}
