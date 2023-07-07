package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int first = number % 10;
        int second = (number / 10) % 10;
        int third = number / 100;
        System.out.println(first * 100 + second * 10 + third);
    }

    public static void main(String[] args){
        var classInstance = new NumberReverter();
        classInstance.revert(489);
    }
}
