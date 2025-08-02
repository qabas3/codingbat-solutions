public int sumNumbers(String str) {

    int sum = 0;
    String temp = "";

    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        if (Character.isDigit(ch)) {
            temp += ch;
        } else {
            if (!temp.equals("")) {
                sum += Integer.parseInt(temp);
                temp = "";
            }
        }
    }


    if (!temp.equals("")) {
        sum += Integer.parseInt(temp);
    }

    return sum;
}


