void main() {
    int[] marks = new int[100];
    Scanner sc = new Scanner(System.in);
    marks[0] = sc.nextInt();
    marks[1] = sc.nextInt();
    marks[2] = sc.nextInt();

    System.out.println("Phy : "+marks[0]);
    System.out.println("Chem : "+marks[1]);
    System.out.println("Math : "+marks[2]);

    marks[1] = 87;
    System.out.println("Chem : "+marks[1]);
}