package casting;

import java.io.IOException;

public class SubClass1 implements Available {

    @Override
    public String instanceOfSubClass() {

        return "Instance of SubClass1 !!! DownCasting";

    }

    @Override
    public String instanceOfAvailable() {

        return "SubClass1 object that you entered is ---> Instance of Available interface !!! UpCasting";

    }
}
