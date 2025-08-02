public int makeChocolate(int small, int big, int goal) {

    int maxBigBars = goal / 5;
    int bigBarsToUse = Math.min(big, maxBigBars);
    int remainder = goal - bigBarsToUse * 5;

    if (small >= remainder) {
        return remainder;
    } else {
        return -1;
    }
}

