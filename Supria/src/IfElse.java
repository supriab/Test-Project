public class IfElse {
    //insurance

    public static void main(String[] args){

        int accident = 6;
        int base = 500;

        if(accident == 1){
            System.out.println(base + 50);

        } else if(accident == 2){
            System.out.println(base + 120);
        }else if(accident == 3){
            System.out.println(base + 220);
        }else if(accident == 4){
            System.out.println(base + 370);
        }else if(accident == 5){
            System.out.println(base + 570);
        }else if(accident >= 6){
            System.out.println("No insurance");
        }
    }
}
