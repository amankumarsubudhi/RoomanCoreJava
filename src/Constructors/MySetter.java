package Constructors;

class Auto{
    String name;

    public Auto(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class MySetter {
    public static void main(String[] args) {
        Auto a = new Auto("Bajaj");
        //Before Setter
        System.out.println(a.getName());
        //After Setter
        a.setName("Tata");
        System.out.println(a.getName());
    }
}
