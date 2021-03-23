import com.HW6.Phone;

public class Main {

    public static void main(String[] args) {
        //Phone phone = new Phone();
        Phone petr = new Phone("+380971112233", "i9564", "243g");
            petr.displayInfo("petr");
        Phone dima = new Phone("+380501112233", "m45", "189g");
            dima.displayInfo("dima");
        Phone masha = new Phone("+380923332211", "razrv3", "256g");
            masha.displayInfo("masha");
        Phone somebody = new Phone();
            somebody.displayInfo("somebody");


       petr.receiveCall("petr ");
       System.out.println(petr.getNumber());
        dima.receiveCall("dima ");
        System.out.println(dima.getNumber());
        masha.receiveCall("masha ");
        System.out.println(masha.getNumber());
    }
}
