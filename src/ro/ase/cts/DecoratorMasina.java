package ro.ase.cts;

public class DecoratorMasina implements IMasina{

    private Masina masina;

    public DecoratorMasina(Masina masina) {
        this.masina = masina;
    }

    @Override
    public void pornesteMotor() {
        System.out.println("Motor pornit " + incalzireScaun());
    }

    private String incalzireScaun(){
       return "Scaun incazlit";
    }
}
