
class loop {
    public static void main(String[] args) {
        int n = 4;
        int v = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= v; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}