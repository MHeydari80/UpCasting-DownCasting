package casting;

public class SubClass2 implements Available {

    @Override
    public String instanceOfSubClass() {

        return "Instance of SubClass2 !!! DownCasting";

    }

    @Override
    public String instanceOfAvailable() {

        return "SubClass2 object that you entered is ---> Instance of Available interface !!! UpCasting";

    }
}
