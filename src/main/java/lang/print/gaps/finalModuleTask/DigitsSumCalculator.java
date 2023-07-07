package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        // 4895
        int ans = number % 10 + (number / 10) % 10 + (number / 100) % 10 + number / 1000;
        System.out.println(ans);
    }

    public static void main(String[] args){
        var classInstance = new DigitsSumCalculator();
        classInstance.calculateSum(489);
    }
}
