public class SumOfArray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;
        
        System.out.print("Numbers: ");
        for (int num : numbers) {
            System.out.print(num + " ");
            sum += num;
        }
        
        System.out.println("\nTotal Sum: " + sum);
    }
}
