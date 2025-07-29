boolean doubleX(String str) {
    int firstX = str.indexOf("x");
    if (firstX == -1 || firstX + 1 >= str.length()) {
        return false;
    }
    return str.charAt(firstX + 1) == 'x';
}
