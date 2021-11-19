package kr.ya.OO.Phone;

import java.util.List;

public class Phone {
    private SIM sim;
    private Camera cam;
    private SDCard card;

    public Phone(SIM sim, Camera cam, SDCard card) {
        this.sim = sim;
        this.cam = cam;
        this.card = card;
    }

    public void makeCall(){
        sim.doCall("06606968823");
    }

    public void takePicture(){
        PhoneFile pic = this.cam.takePicture();
        this.card.save(pic);
    }

    public void printAllFiles(){
        List<PhoneFile> files = this.card.getPhoneFiles();
        for (PhoneFile file: files){
            System.out.println(file.getInfo());
        }
    }
    public int getFreeSpace(){
        return this.card.getFreeSpace();
    }
}
