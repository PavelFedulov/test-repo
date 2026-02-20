public class Sum {
    public static void main(String[] args) {
        double sum = 0;

        for (String arg : args) {
            if (isDouble(arg)) {
                sum += Double.parseDouble(arg);
            }
        }

        System.out.println(sum);
    }

    private static boolean isDouble(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }

        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}