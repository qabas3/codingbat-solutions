public String sameEnds(String string) {
    int maxLen = string.length() / 2;
    for (int i = maxLen; i >= 0; i--) {
        String start = string.substring(0, i);
        String end = string.substring(string.length() - i);
        if (start.equals(end)) {
            return start;
        }
    }
    return "";
}
