public class Main {

    public static void main(String[] args) {
        int count = 0;
        for(Secret sect : Secret.values()) {
            count = sect.name().startsWith("STAR") ? count + 1 : count;
        }
        System.out.println(count);
    }
}

/* At least two constants start with STAR */
//enum Secret {
//    STAR, CRASH, START, // ...
//}