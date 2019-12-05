package study.jk.logging.wio.animal;

public class PoliceBird implements Bird {

    @Override
    public void sound() {
        System.out.println("PoliceBird ㄲ?");

    }

    @Override
    public void eat() {
        System.out.println("PoliceBird is eating");

    }

    @Override
    public void fly() {
        System.out.println("PoliceBird is flying");
    }

}