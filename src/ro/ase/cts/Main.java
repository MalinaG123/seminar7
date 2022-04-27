package ro.ase.cts;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        DECORATOR
        List<IMasina> list = new ArrayList<>();
        IMasina i1 = new Masina();
        IMasina i2 = new DecoratorMasina((Masina) i1);
        IMasina i3 = new Masina();
        list.add(i1);
        list.add(i2);
        list.add(i3);
        for (IMasina i: list) {
            i.pornesteMotor();
        }
    }
}
