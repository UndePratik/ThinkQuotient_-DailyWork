interface XYZ {
    void show();
}

interface GHI extends XYZ {
    void print();
}

class C implements GHI {
    public void show() {
        System.out.println("Hello");
    }

    public void print() {
        System.out.println("Welcome");
    }

    public static void main(String[] args) {
        C obj = new C();
        obj.show();
        obj.print();
    }
}
