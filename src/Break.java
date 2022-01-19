public class Break {
    public static void main(String[] args) {
        for (int counter = 0; counter < 25; counter++) {
            if (counter == 10)
                break;
            System.out.println("FOR1 - counter are valoarea: " + counter);
        }

        int counter = 0;
        while (counter < 25) {
            if (counter == 20)
                break;
            System.out.println("WHILE - counter are valoarea " + counter);
            counter++;
        }

        counter = 0;
        do {
if (counter == 30)
    break;
            System.out.println("DOWHILE - counter are valoarea: " + counter);
            counter++;
        }while (counter < 50);
    }
}
