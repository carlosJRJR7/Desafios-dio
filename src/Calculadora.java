public class Calculadora {
        int n1 = 10;
        int n2 = 4;

        public static void soma(double numero1,double numero2){
            double total = 0;
            total = numero1 + numero2;
            System.out.println("A soma entre os dois numero é: " + total);
        }
        public static void subtracao(double numero1,double numero2){
            double total = 0;
            total = numero1 - numero2;
            System.out.println("A subtracao entre os dois numero é: " + total);
        }
        public static void multiplicacao(double numero1, double numero2){
            double total = 0;
            total = numero1 * numero2;
            System.out.println("A multiplicacao entre os dois numero é: " + total);
        }
        public static void divisao(double numero1, double numero2){
            double total = 0;
            total = numero1 / numero2;
            System.out.println("A divisao entre os dois numero é: " + total);
        }
}
