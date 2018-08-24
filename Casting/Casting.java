package casting;

public class Casting {

    public static void main(String[] args) {

        Available available = new SubClass1();
        Available available1 = new SubClass2();

        SubClass1 sub1 = (SubClass1) available;
        SubClass2 sub2 = (SubClass2) available1;

        Call call = new Call();

        call.invoke(available);
//        call.invoke(available1);
//        call.invoke(sub1);
//        call.invoke(sub2);

    }

}
