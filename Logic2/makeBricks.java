public boolean makeBricks(int small, int big, int goal) {
    int maxBigBricks = goal / 5;
    int bigBricksToUse = Math.min(big, maxBigBricks);
    int remainingLength = goal - (bigBricksToUse * 5);
    return small >= remainingLength;
}

