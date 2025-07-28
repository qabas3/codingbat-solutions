public boolean startHi(String str) {
    if (str.length() < 2) return false;
    String firstTwo = str.substring(0, 2);
    return firstTwo.equals("hi");
}
