package class23;

public abstract class Phone {
    abstract void displayPictures();
    abstract void unlockPhone();
    abstract void sendText();
}class Iphone extends Phone{
    @Override
    void displayPictures() {
        System.out.println("iphone picture quality is good");
    }

    @Override
    void sendText() {
        System.out.println("iphone uses messenger for the text");
    }

    @Override
    void unlockPhone() {
        System.out.println("iphone uses faceID fot he unlocking phone");
    }
}
