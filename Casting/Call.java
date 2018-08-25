package casting;

public class Call {

    SubClass1 sub1 = new SubClass1();
    SubClass2 sub2 = new SubClass2();

//    DownCasting
    public void invoke(Available available) {

        if (available instanceof SubClass1) {

            System.out.println(sub1.instanceOfSubClass());

        } else {

            System.out.println(sub2.instanceOfSubClass());
            
        }

    }

//    UpCasting (SubClass1)
    public void invoke(SubClass1 subClass1) {

        if (subClass1 instanceof Available) {

            System.out.println(sub1.instanceOfAvailable());

        } else {

            System.out.println("Is not instance of Available interface !!!");

        }

    }

    //    UpCasting (SubClass2)
    public void invoke(SubClass2 subClass2) {

        if (subClass2 instanceof Available) {

            System.out.println(sub2.instanceOfAvailable());

        } else {

            System.out.println("Is not instance of Available interface !!!");

        }

    }
}
