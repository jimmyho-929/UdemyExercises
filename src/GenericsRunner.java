public class GenericsRunner {
    public static void main(String[] args) {

        MyCustomList<String> list = new MyCustomList<>();
        list.addElement("Hello world");
        list.addElement("Jimmy Ho");
        String value = list.get(0);
        System.out.println(value);


        MyCustomList<Integer> list2 = new MyCustomList<>();
        list2.addElement(1);
        list2.addElement(2);
        Integer number = list2.get(0);
        System.out.println(number);

    }
}
