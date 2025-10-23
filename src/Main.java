import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double sum = 0;
        double[] arr = new double[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random();
            sum += arr[i];
        }
        Arrays.sort(arr);
        System.out.println("Максимальное число: " + arr[arr.length - 1]);
        System.out.println("Минимальное число: " + arr[0]);
        System.out.println("Среднее значение:" + sum / arr.length);
    }
}