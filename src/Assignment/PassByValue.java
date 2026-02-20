package Assignment;

public class PassByValue {


    public int add(int x,int y){

        x = 500;
        y = 300;
        int sum=x+y;
        return sum ;
    }

    public static void main(String[] args) {
        PassByValue d=new PassByValue();
        int a = 100;
        int b = 200;
        System.out.println("Value Of A Before Add Method = "+a);
        System.out.println("Value Of A Before Add Method = "+b);


        int res =  d.add(a,b);

        System.out.println("Result = "+res);
        System.out.println("Value Of A After Add Method = "+a);
        System.out.println("Value Of B After Add Method = "+b);

    }


}
