package school.mjc.stage0.loops.task3;

public class NinesSum {
    public long calculateSum(int lengthOfLastNumber) {
        long sum = 0;
        long term = 0;

        for (int i = 1; i <= lengthOfLastNumber; i++) {
            term = term * 10 + 9; // Generate the ith term
            sum += term; // Add the term to the sum
        }

        return sum;
    }

    }
