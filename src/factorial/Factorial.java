package factorial;

public class Factorial {

    public static void main(String[] args) {

        int numbertofactorize;
        int increasenumber;

        numbertofactorize = 8;

        int i;
        if (numbertofactorize == 0) {
            increasenumber = 1;
        } else {
            increasenumber = 1;
            for (i = numbertofactorize; i >= 1; i--) {
                increasenumber = increasenumber * i;
            }
        }

        System.out.println(increasenumber);

    }

}

}
