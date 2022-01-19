public class For {
    public static void main(String[] args) {
        /* for(statement de initializare; conditia de oprire; statement care se intampla dupa fiecare iteriatie) {
        blocul de cod
        }
        */

        for (int counter = 0; counter < 25; counter++) {
            System.out.println("FOR1 - counter-ul are valoarea: " + counter);
        }

        System.out.println("-------------------------------------------------");

        int iterator;
        for (iterator = 0; iterator < 100; iterator++) {
            System.out.println("FOR2 - interatorul are valoarea " + iterator);
        }

        System.out.println("Dupa FOR2 interatorul are valoarea " + iterator);

        iterator = 0;
        for (; iterator < 25; ) {
            System.out.println("FOR3 - iteratorul are valoarea: " + iterator);
            iterator++;
        }

        System.out.println("Dupa FOR3 iteratorul are valoarea: " + iterator);
    }
}

