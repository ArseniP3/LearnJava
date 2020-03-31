class Test {
    int a;
    Test (int a){
        this.a = a;
    }
    Test isrByTen (){
        Test temp = new Test(a+10);
        return temp;
    }
static class TestBoo{
    public static void main(String[] args) {
        Test test = new Test(4);
        Test test1;
        test1 = test.isrByTen();
        System.out.println("a before change: " + test.a);
        System.out.println("a after first change: " + test1.a);
        System.out.println("a after second change: " + test1.a);
        test1 = test1.isrByTen();
        System.out.println("a after second change: " + test1.a);
    }
}
}
