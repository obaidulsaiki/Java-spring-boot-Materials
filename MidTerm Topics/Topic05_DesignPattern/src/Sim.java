public interface Sim {
    void call();
}
class GrameenPhone implements Sim {
    public void call() {
        System.out.println("Calling using GrameenPhone SIM...");
    }
}
class Robi implements Sim {
    public void call() {
        System.out.println("Calling using Robi SIM...");
    }
}
//Factory Design pattern implementation:
class SimFactory {
    public Sim getSim(String simType) {
        if (simType.equals("GP")) {
            return new GrameenPhone();
        } else if (simType.equals("ROBI")) {
            return new Robi();
        }
        else {
            return null;
        }
    }
}
class Phone {
    private Sim sim;
    // Example of Dependencies Injection
    public Phone(Sim sim) {
        this.sim = sim;
    }

    public void makeCall() {
        sim.call();
    }
}
