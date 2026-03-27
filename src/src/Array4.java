// call by reference array

public static void update(int marks[]) {
    for (int i=0; i<marks.length; i++) {  // here i is index of array
        marks[i] = marks[i] + 1;
    }
}

void main() {
    int marks[] = {98,93,96};
    update(marks);
    for (int i=0; i<marks.length; i++) {
        System.out.println(marks[i]);
    }
}