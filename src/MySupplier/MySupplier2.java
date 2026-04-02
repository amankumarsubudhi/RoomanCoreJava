package MySupplier;

import java.util.function.Supplier;

public class MySupplier2 {
    public static void main(String[] args) {

        /*Supplier<String> s = () -> {
            String newotp = "";
            String[] sa = {"@","*","&","A","B","C","D","E","F","G","H","I","J"};
            for(int i=0;i<8;i++){
                if(sa[(int)(Math.random()*sa.length)%2==0){
                    newotp = newotp + sa[(int)(Math.random()*sa.length)];
                }
                else{
                    newotp = newotp + (int)(Math.random()*10);
                }
            }
            return newotp;
        };
        String res = s.get();
        System.out.println(res);*/

        String symbols = "!@#$%ABDEJKLMRSTXYZ";
        Supplier<Character> s = () -> symbols.charAt((int) (Math.random()*symbols.length()));
        Supplier<Integer> i = () -> (int) (Math.random()*10);
        String secureotp = "";

        for(int j=0;j<7;j++){
            if(j % 2 == 0){
                secureotp = secureotp + i.get();
            }
            else {
                secureotp = secureotp + s.get();
            }
        }

        System.out.println(secureotp);


    }
}
