public String mirrorEnds(String string) {

    int len = string.length();
    StringBuilder mirror = new StringBuilder();

    for (int i = 0; i < len; i++) {

        if (string.charAt(i) == string.charAt(len - 1 - i)) {
            mirror.append(string.charAt(i));
        } else {
            break;
        }
    }

    return mirror.toString();
}