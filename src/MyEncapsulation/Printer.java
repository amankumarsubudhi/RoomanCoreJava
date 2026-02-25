package MyEncapsulation;

class Printer {

    public void print(int a) {
        System.out.println("Inside print 1 int");
    }

    public void print(double a) {
        System.out.println("Inside print 2 double");
    }

    public void print(String a) {
        System.out.println("Inside print 3 string");
    }

    public void print(int a,float b) {
        System.out.println("Inside print 4 int & float");
    }

    public void print(String a,double b) {
        System.out.println("Inside print 5 string & double");
    }

    public void print(int a,float b,String c) {
        System.out.println("Inside int, float,string");
    }

    public void print(String a,float b,int c) {
        System.out.println("Inside string, float,int");
    }

}
