public class Car
{
    private int X = 0;
    public int Y = 0;

    public void setX(int x) {
        X = x;
    }

    public int getX() {
        return X;
    }

    public void setY(int y) {
        Y = y;
    }

    public int getY() {
        return Y;
    }
    class Engine1
    {
        //this.X = 8; Not Allowed
        //this.Y = 8; Not Allowed
        void Display()
        {
            System.out.println("X" + getX());
            System.out.println("Y" + getY());
            Y = 0;
            Car Z = new Car();
            Z.X = 0;
        }
        void Run()
        {
            Car.this.X++;
        }
    }
    static class Engine2
    {
        int ABC = 0;
        public void setABC(int ABC) {
            this.ABC = ABC;
        }

        public int getABC() {
            return ABC;
        }
    }
}
