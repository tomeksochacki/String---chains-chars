class StringArrays {
    public static void main(String[] args) {
        String strs[] = {"This", "is", "only", "test."};
        System.out.println("Start value array: ");
        for (String s : strs)
            System.out.println(s + " ");
        System.out.println("\n");

        strs[1] = "was";
        strs[3] = "plain test!";

        System.out.println("Modified array contents: ");
        for (String s : strs)
            System.out.println(s + " ");


        int myTab[] = {1, 2, 3, 4, 5};
        for (int element : myTab) {
            System.out.println("Content myTab: " + element);
        }

        myTab[1] = 4;
        myTab[3] = 1;

        System.out.println("MyTab after change:");
        for (int elementCh : myTab) {
            System.out.print(elementCh + ", ");
        }
    }
}
