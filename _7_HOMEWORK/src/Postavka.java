import java.util.Date;

public class Postavka extends Register{
    int number;
    String type;
    int kol_vo;
    Date data;

    public Postavka(String s1, String s, int number, String type, int kol_vo, Date data) {
        super(s1, s);
        this.number = number;
        this.type = type;
        this.kol_vo = kol_vo;
        this.data = data;
    }

    public Postavka(String s1, String s) {
        super(s1, s);
    }
}
