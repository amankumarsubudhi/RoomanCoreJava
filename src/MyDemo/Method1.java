package MyDemo;

public class Method1 {

    public static void main(String[] args) {
        String s = "ROOMAN";
        String s1 = "rooman";
        String s2 = "oDiSha";
        String temp = "";
        String temp1 = "";
        String temp2 = "";
        int temp01;

        for(int i=0;i<s.length();i++){
            temp01 = (s.charAt(i)+32);
            temp = temp+((char)temp01);
        }

        for(int j=0;j<s1.length();j++){
            temp1 = temp1 + ((char)(s1.charAt(j)-32));
        }

        for(int m=0;m<s2.length();m++){
            if(s2.charAt(m)>=65 &&  s2.charAt(m)<=90){
                temp2 = temp2 + ((char)(s2.charAt(m)+32));
            }
            else{
                temp2 = temp2 + s2.charAt(m);
            }
        }

        System.out.println(temp);

        System.out.println(temp1);

        System.out.println(temp2);

    }

}
