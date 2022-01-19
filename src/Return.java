public class Return {
    public static void main(String[] args) {
        //return se foloseste la metode

        int sum = 0;
        int a = 6;
        int b = 18;
        sum = sum(a, b);
        System.out.println("Suma este: " + sum);
        doPrint(sum);

        int c = 17;
        int d = 30;

        sum = sum(c, d);
        System.out.println("Suma este: " + sum);
        doPrint(sum);
    }

    public static int sum(int operandOne, int operandTwo) {
        System.out.println("Calculate sum of: " + operandOne + " and " + operandTwo);
        return operandOne + operandTwo;
        //nu mai pot pune nimic dupa, este eroare de compilare. Return incheie executia metodei curente
    }

    public static void doPrint(int sum) {
        if (sum < 30) {
            return;
        }
        System.out.println("This sum is awesome");
    }
}

