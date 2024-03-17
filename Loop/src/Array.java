public class Array {

    public static void main(String[] args) {

        String[] name= {"Volvo","BMW","Mazda","toyota","Tesla"};
        System.out.println(name.length);

        int[]grades = {6, 7, 9, 3, 4, 2};

        System.out.println(grades[0]);
        System.out.println(grades[1]);
        System.out.println(grades[2]);
        System.out.println(grades[3]);
        System.out.println(grades[4]);
        System.out.println(grades[5]);

        for(int i = 0; i <=5 ;i++){  //print together
            System.out.println(i);
            System.out.println(grades[i]);
            System.out.println(grades[3]);
        }

    }
}
