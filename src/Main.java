public class Main {
    public static void main(String[] args) {

        int counterForThree = 0;
        int counterForFive = 0;

        for (int i = 0; i < 1000; i += 3) {
            counterForThree = counterForThree + i;
        }
        for (int b = 0; b < 1000; b += 5){
            counterForFive = counterForFive + b;
        }
        System.out.println(counterForThree + counterForFive);
    }
}