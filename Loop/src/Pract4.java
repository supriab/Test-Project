public class Pract4 {

    public static void main(String[] args){
        int num = 67687;
        int count = 0;
        for(; num!=0;num/=10,++count){
            System.out.println("the number of digits;" + count);
        }
    }
}
