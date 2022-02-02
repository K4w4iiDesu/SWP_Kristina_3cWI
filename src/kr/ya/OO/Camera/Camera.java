package kr.ya.OO.Camera;

public class Camera {
    public int pixel;
    public int weight;
    public String color;
    public Manufacturer manufacturer;
    public Lens lens;
    public SDCard sdCard;
    public Settings settings;

    public Camera(int pixel, int weight, String color, Manufacturer manufacturer, Lens lens, SDCard sdCard, Settings settings) {
        this.pixel = pixel;
        this.weight = weight;
        this.color = color;
        this.manufacturer = manufacturer;
        this.lens = lens;
        this.sdCard = sdCard;
        this.settings = settings;
    }

    public void takePicture(){
        if (sdCard.checkSpace(settings.imageFileSize)){
            sdCard.imageList.add(new Image((sdCard.imageList.size()+1) + ".jpeg", settings.imageSize, settings.imageFileSize));
        }
    }

    public void getAllPictures(){
        for (Image image :
                sdCard.imageList) {
            System.out.println(image.name);
            System.out.println(image.date);
            System.out.println(image.imageSize + "x" + image.imageSize + " px");
            System.out.println(image.imageFileSize + "GB");
            System.out.println("------------");
        }
    }

    public void setSettings(Settings newSetting){
        this.settings = newSetting;
        System.out.println("---The Setting " + settings.name + " is being used---");
    }

    public void setSdCard(SDCard sdCard){
        this.sdCard = sdCard;
        System.out.println("---new SDCard, with " + this.sdCard.capacity + " GB, is inside---");
    }
}




