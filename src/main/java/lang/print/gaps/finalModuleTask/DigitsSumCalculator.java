package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int ans = 0;
        while(number > 0){
            ans += number % 10;
            number /= 10;
        }
        System.out.println(ans);
    }

    public static void main(String[] args){
        var classInstance = new DigitsSumCalculator();
        classInstance.calculateSum(489);
    }
}
