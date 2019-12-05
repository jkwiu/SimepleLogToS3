package study.jk.logging.wio.animal;

public class Eagle implements Bird {

    @Override
    public void sound() {
        System.out.println("Eagle 꺄악?");
    }

    @Override
    public void eat() {
        System.out.println("Eagle is eating");

    }

    @Override
    public void fly() {
        System.out.println("Eagle is flying");

    }

}