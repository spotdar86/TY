class MyDate {
    int dd, mm, yy;

    MyDate(int dd, int mm, int yy) {
        this.dd = dd;
        this.mm = mm;
        this.yy = yy;
    }

    void display() {
        System.out.printf("%02d-%02d-%04d", dd, mm, yy);
    }
}

public class s11q1 {
    public static void main(String[] args) {
        MyDate date = new MyDate(15, 4, 2023);
        date.display();
    }
}