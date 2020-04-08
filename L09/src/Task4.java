public  class Task4 <T extends Number> {
    T a;
    T b;

    public Task4(T a, T b) {
        this.a = a;
        this.b = b;
    }

    public Number sum(Object o) {

        Number result = null;
        if (a instanceof Integer) {
            result = (Integer) (a.intValue() + b.intValue());
        } else if (a instanceof Double) {
            result = (Double) (a.doubleValue() + b.doubleValue());
            return result;
        }
        return result;
    }

    public static void main(String[] args) {

    }
}

