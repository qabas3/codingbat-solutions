public int caughtSpeeding(int speed, boolean isBirthday) {
    int allowance = isBirthday ? 5 : 0;
    int adjustedSpeed = speed - allowance;

    if (adjustedSpeed <= 60) {
        return 0;

    } else if (adjustedSpeed <= 80) {
        return 1;

    } else {
        return 2;
    }
}
