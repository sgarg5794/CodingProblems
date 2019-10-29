package amz;

public class Mustafa {

    double e=2.71828;
    public void myfunc(){
        int i=1;
        double sum=0;
        for(;i<=100000000;i++){
            sum=sum+(((double)(Math.pow(2,i)/fact(i)))*(1/Math.pow(e,2)));
            if(sum>=0.95){
                System.out.println(i);
                break;
            }
        }
        System.out.println(i);

    }

    public int fact(int n){
        int fact=1;
        int i=1;
        while(i<=n){
           fact=fact*i;
           i++;
        }
        return fact;
    }

    public static void main(String[] args) {
        Mustafa mustafa=new Mustafa();
        mustafa.myfunc();
        System.out.println(mustafa.fact(4));
    }



}
