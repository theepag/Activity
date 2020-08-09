package normal;

public class SonyAdvanceRemoteControl extends AdvancedRemoteControl{

    @Override
    public void setChannel(int number) {
        System.out.println("Sony : setChannel");
    }

    @Override
    public void turnOn() {
        System.out.println("Sony: turnOn");

    }

    @Override
    public void turnOff() {
        System.out.println("Sony : TurnOff");

    }
}
