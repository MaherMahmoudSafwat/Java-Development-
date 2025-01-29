class Square extends Shape {
    int side;

    Square(int side) {
        this.side = side;
    }

    @Override
    void draw() {
        System.out.println("Drawing a square with side " + side);
    }
}