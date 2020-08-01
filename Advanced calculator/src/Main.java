/* Please, do not rename it */
class Problem {

    public static void main(String[] args) {
        String operator = args[0];
        // write your code here
        long num = Long.MIN_VALUE;
        if (operator.equals("MAX")) {
            for (int i = 1; i < args.length; i++) {
                num = Math.max(num, Integer.parseInt(args[i]));
            }
        } else if (operator.equals("MIN")) {
            num = Long.MAX_VALUE;
            for (int i = 1; i < args.length; i++) {
                num = Math.min(num, Integer.parseInt(args[i]));
            }
        } else if (operator.equals("SUM")) {
            num = 0;
            for (int i = 1; i < args.length; i++) {
                num += Integer.parseInt(args[i]);
            }
        }
        System.out.println(num);
    }
}