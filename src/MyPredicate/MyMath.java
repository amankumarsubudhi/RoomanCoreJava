package MyPredicate;

public class MyMath {
    public static void main(String[] args) {
        String otp = "";
        for(int j=0;j<6;j++){
            otp = otp + (int)(Math.random()*10);
        }
        System.out.println("OTP = " + otp);
    }
}
