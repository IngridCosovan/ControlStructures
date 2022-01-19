public class ForEach {
    public static void main(String[] args) {
        int [] vectorOfInts = {1, 2 , 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Lungimea vectorului  este: " + vectorOfInts.length);

        for (int i = 0; i<  vectorOfInts.length; i++) {
            System.out.println("FOR1 Elementul de la pozitia " + i + " este " + vectorOfInts[i]);
        }


        System.out.println("---------------------------------------");

        //for enhanced loop - for each

        for(int element : vectorOfInts) {
            System.out.println("FOR2 - elementul este: " + element);
        }

        System.out.println("---------------------------------------");


        for(int i = 0; i < vectorOfInts.length; i=i+2) {
            System.out.println("FOR3 - elementul de pe pozitia " + i + " este: " + vectorOfInts[i]);
        }

        System.out.println("---------------------------------------");

        for (int i = 1; i < vectorOfInts.length; i=i+2) {
            System.out.println("FOR4 - elementul de pe positia " + i + " este: " + vectorOfInts[i]);
        }
    }
}
