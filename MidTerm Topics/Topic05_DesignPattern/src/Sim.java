public interface Sim {
    String brandName();
}
class Robi implements Sim{

    @Override
    public String brandName() {
        return "Robi";
    }
}
class GrameenPhone implements Sim{

    @Override
    public String brandName() {
        return "GP";
    }
}
class Phone{
    String SimName;
    public Phone(String SimName){
        this.SimName = SimName;
    }
}

class SimFactory{
    public Sim getSim(String simType){
        // logic that differentiate design pattern
        if (simType.equals("Robi")){
            return new Robi();
        }
        else if(simType.equals("GP"))
        {
            return new GrameenPhone();
        }
        else {
            return null;
        }
    }
}