public String oneTwo(String str) {
    StringBuilder result = new StringBuilder();

    for (int i = 0; i <= str.length() - 3; i += 3) {
        String group = str.substring(i, i + 3);
        result.append(group.substring(1));
        result.append(group.charAt(0));
    }

    return result.toString();
}

