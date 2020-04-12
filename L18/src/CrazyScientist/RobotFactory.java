package CrazyScientist;


import java.util.HashMap;
import java.util.Map;

public class RobotFactory implements Runnable {
    Dump dump;

    public RobotFactory(Dump dump) {
        this.dump = dump;
    }

    public Map<String, Integer> putDet (int count){
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < count; i++) {
            String putDetail = String.valueOf(SpareParts.randomDetail());

            if(map.containsKey(putDetail)) {
                map.put(putDetail, map.get(putDetail) + 1);
            }else {
                map.put(putDetail, 1);
            }
        }return map;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            if (i == 0) {
                dump.putDet(putDet(20));
            } else {
                dump.putDet(putDet((int) (1 + Math.random() * 4)));
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
