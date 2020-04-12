package CrazyScientist;

import java.util.List;
import java.util.Random;

public enum  SpareParts {

    HEAD,
    BODY,
    LEFT_HAND,
    RIGHT_HAND,
    LEFT_LEG,
    RIGHT_LEG,
    CPU,
    RAM,
    HDD;

    static Random RANDOM = new Random();

    static List<SpareParts> list;
    static int size = list.size();

    public static SpareParts randomDetail()  {
        return list.get(RANDOM.nextInt(size));
    }






}
