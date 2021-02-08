class Search {
    public static void main(String[] args) {
        int nums[] = {6, 8, 3, 7, 5, 6, 1, 4};
        int val = 5;
        boolean found = false;

        for (int element : nums) {
            if (element == val){
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("Value is found.");

        String string = new String("In Java chains are objects.");
        String string2 = "You can create them in many ways.";
        String string3 = new String(string2);

        System.out.println(string);
        System.out.println(string2);
        System.out.println(string3);

    }
}
