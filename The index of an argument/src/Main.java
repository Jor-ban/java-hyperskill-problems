class Problem {
    public static void main(String[] args) {
        int index = -1;
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("test")) {
                index = i;
            }
        }
        System.out.println(index);
    }
}