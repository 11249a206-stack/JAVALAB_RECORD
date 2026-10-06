class StaticSquare {

    static int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {
        int num = 5;

        int result = square(num);

        System.out.println("Square of " + num + " = " + result);
    }
}
