package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if (lastInRow < 0) {
            System.out.println("last number in row is negative");
           return;
        }
        if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bigger then the last");
            return;
        }
        int sumOfSkip=0;
        int sumOfCounted=0;
        for (int i= 1; i <=lastInRow; i++) {
            if(numberToSkip>0){
                numberToSkip--;
                sumOfSkip +=i;
                continue;
            }
            sumOfCounted +=i;
        }
        System.out.println("skipped sum is "+sumOfSkip);
        System.out.println("counted sum is "+sumOfCounted);

    }
}
