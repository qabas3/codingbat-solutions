public String wordEnds(String str, String word) {
    StringBuilder result = new StringBuilder();
    int wordLen = word.length();

    for (int i = 0; i <= str.length() - wordLen; i++) {
        if (str.substring(i, i + wordLen).equals(word)) {

            if (i > 0) {
                result.append(str.charAt(i - 1));
            }
            if (i + wordLen < str.length()) {
                result.append(str.charAt(i + wordLen));
            }
        }
    }

    return result.toString();
}
