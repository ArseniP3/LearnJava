class ThreadA extends Thread {
    @Override
    public void run() {
        System.out.println("Привет из побочного потока!!!");
    }
}
class Progr{

    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        threadA.start();

        System.out.println("Главный поток завершён!!!");
    }
}
