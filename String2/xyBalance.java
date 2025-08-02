public boolean xyBalance(String str) {
    boolean ySeen = false;
    for (int i = str.length() - 1; i >= 0; i--) {
        if (str.charAt(i) == 'y') {
            ySeen = true;
        } else if (str.charAt(i) == 'x') {
            if (!ySeen) {
                return false;
            }
        }
    }
    return true;
}

