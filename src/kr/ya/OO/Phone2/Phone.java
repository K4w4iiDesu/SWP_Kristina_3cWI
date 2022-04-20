package kr.ya.OO.Phone2;

public class Phone {
    private String color;
    private SIM sim;
    private Camera camera;
    private SDcard sd_card;

    public Phone(String color, SIM sim, Camera camera, SDcard sd_card) {
        this.color = color;
        this.sim = sim;
        this.camera = camera;
        this.sd_card = sd_card;
    }

    public void makeCall(String number) {
        this.sim.doCall(number);
    }

    public void takePicture(String extension,int size, String name){
        PhoneFile file = this.camera.makePicture(extension, size, name);
        this.sd_card.addFile(file);
    }

    public void printAllFiles(){
        int numberofFiles = this.sd_card.getAllFiles().size();
        for (int i = 0; i < numberofFiles; i++) {
            System.out.println(this.sd_card.getAllFiles().get(i).getName() + " " + this.sd_card.getAllFiles().get(i).getExtension() + " " + this.sd_card.getAllFiles().get(i).getSize());
        }
    }

    public int getFreeSpace(){
        return this.sd_card.getFreeSpace();
    }



}