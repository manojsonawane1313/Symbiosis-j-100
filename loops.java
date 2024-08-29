public class loops {
    public static void main(String[] args){
System.out.println("for loop");

for(int count=1; count<=10; count++){
    System.out.println("2 x " + count + " = " + (count*2));
}

System.out.println("");
System.out.println("while loop");

int count=1;
while(count<=10){
    System.out.println("2 x "+ count +" = "+ (count*2));
    count++;
}

System.out.println("");
System.out.println("do while loop");

int count3=1;
do{
    System.out.println("2 "+ count3+" = " +count3*2);
    count3++;
   
}while(count3<=10);



    }
}
