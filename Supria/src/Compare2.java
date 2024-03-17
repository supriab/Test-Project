public class Compare2 {

    //&&(and operator),||(or),!(not)

    public static void main(String[] args){

        System.out.println(5 == 5 && 7 == 7);//both side true(true)
        System.out.println(5 == 4 && 7 == 7);//left side false(false)

//(&& and operator both side true is true,if one side false, it false )
        // true && true = true
        // true && false =false
        //false && true = false
        //false && false = false

//(||or operator one side true but another side is false,result will de true)

        System.out.println(5 == 5 || 7 == 7);//true
        System.out.println(5 == 5 || 7 == 3);//true

        // true || true = true
        // true || false =true
        //false || true = true
        //false || false = false
        System.out.println(true);//true
        System.out.println(!true);//false




    }
}
