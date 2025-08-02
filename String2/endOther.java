public boolean endOther(String a, String b) {
    String lowerA = a.toLowerCase();
    String lowerB = b.toLowerCase();
    return lowerA.endsWith(lowerB) || lowerB.endsWith(lowerA);
}
