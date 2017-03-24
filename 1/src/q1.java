/**
 * Created by Osy on 2017-03-16.
 */
public class q1 {
    public static void main(String[] args){
        q1 q = new q1();

        q.add(2,3);
        q.mul(4,5);
        q.div(21,7);
        q.sub(60,30);
    }
    public void add(int a,int b){
        int sum = a + b;
        System.out.println(a + " + " + b + " = " +sum);
    }
    public void sub(int a,int b){
        int sub = a-b;
        System.out.println(a + " - " + b + " = " +sub);
    }
    public void mul(int a,int b){
        System.out.println(a + " X " + b + " = " +a*b);
    }
    public void div(int a,int b){
        System.out.println(a + " / " + b + " = " +a/b);
    }
}
