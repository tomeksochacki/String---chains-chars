class StrOps {
    public static void main(String[] args) {
        String str1 = "Java is number one in programming web aplications.";
        String str2 = new String(str1);
        String str3 = "Java chains have a lot of possibilities.";
        int result, idx;
        char ch;

        System.out.println("Length chains str1: " + str1.length());

        for (int i = 0; i < str1.length(); i++) {
            System.out.print(str1.charAt(i));
        }
        System.out.println();

        if (str1.equals(str2))
            System.out.println("str1 is equal str2.");
        else
            System.out.println("str1 is different str2.");

        if (str1.equals(str3))
            System.out.println("str1 is equal str3");
        else
            System.out.println("str1 is different str3");

        result = str1.compareTo(str3);
        if (result == 1)
            System.out.println("str1 and str3 are the same.");
        else if (result < 0)
            System.out.println("str1 is less than str3");
        else
            System.out.println("str1 is greater than str3");

        str2 = "One Two Three One";
        idx = str2.indexOf("One");
        System.out.println("Index of the first substring chains One: " + idx);
        idx = str2.lastIndexOf("One");
        System.out.println("Index of the last substring chains One: " + idx);

    }
}
