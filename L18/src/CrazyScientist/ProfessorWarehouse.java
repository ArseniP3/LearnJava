package CrazyScientist;


import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class ProfessorWarehouse implements Runnable {
    Dump dump;

    public ProfessorWarehouse(Dump dump) {
        this.dump = dump;
    }

    Map<String, Integer> details = new HashMap<>();

    public void collect() {
        dump.popDet(details);
        dump.map.clear();
    }

    public void show(){
        if(!details.isEmpty()) {

            for (Map.Entry<String, Integer> entry : details.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }

            int result = details.entrySet().stream().min(Comparator.comparingInt(Map.Entry::getValue)).map(Map.Entry::getValue).orElse(0);

            if (details.size() == 10) {
                System.out.println(result);
            }
        }
    }
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 1 + Math.random()*4; j++) {
                collect();
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        show();
    }
}
