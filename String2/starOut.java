public String starOut(String str) {
    StringBuilder result = new StringBuilder();

    for (int i = 0; i < str.length(); i++) {
        boolean isStar = str.charAt(i) == '*';
        boolean prevIsStar = i > 0 && str.charAt(i - 1) == '*';
        boolean nextIsStar = i < str.length() - 1 && str.charAt(i + 1) == '*';


        if (!isStar && !prevIsStar && !nextIsStar) {
            result.append(str.charAt(i));
        }
    }

    return result.toString();
}
