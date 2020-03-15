import java.sql.SQLOutput;

public class Artifact{
    int number;
    int vek;
    String culture;
    static int count = 0;

    public Artifact(int number, String culture){
        this.number = number;
    }
    public Artifact (){
        count++;
    }
    public Artifact(int number, String culture, int vek){
        this.number = number;
        this.culture = culture;
        this.vek = vek;
    }

    public static void main(String[] args) {
    Artifact bulava = new Artifact();
    Artifact kniga = new Artifact(122, "Rus", 2);
    Artifact domino = new Artifact(825,"Иудщкгы");
        System.out.println(bulava);
        System.out.println(kniga.number + kniga.culture);
        System.out.println(domino.number + domino.culture + domino.vek);
    }
}
