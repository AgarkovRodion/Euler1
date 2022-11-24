public class Main {
    public static void main(String[] args) {

        int counter = 0;

        for (int i = 0; i < 1000; i += 3, i +=5) {
            counter = counter + i;

        }
        System.out.println(counter);
    }
}