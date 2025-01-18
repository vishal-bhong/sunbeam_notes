class Program {
    public static void main(String[] args) {
        String n1 = args[0];
        String n2 = args[1];
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
        int n3 = Integer.parseInt(n1); // UnBoxing
        int n4 = Integer.parseInt(n2); // UnBoxing
        System.out.println("Addition = " + (n3 + n4));
    }
}