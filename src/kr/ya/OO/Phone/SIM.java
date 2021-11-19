package kr.ya.OO.Phone;

public class SIM {
    private int id;
    private String number;

    public SIM(int id, String number) {
        this.id = id;
        this.number = number;
    }

    public void doCall(String number){
        System.out.println("i do call");
    }
}
