public class TestStack {
    public static void main(String[] args) {
        Stack mystack2 = new Stack();
        Stack mystack1 = new Stack();

        //push number
        for (int i =0;  i < 10; i++) mystack1.push(i);
        for (int i =10;  i < 20; i++) mystack2.push(i);

        //pop numbers off stack
        System.out.println("Stack in mystack1");
        for (int i =0;  i < 8; i++)
            System.out.println(mystack1.pop());

        System.out.println("Stack in mystack2");
        for (int i =0;  i < 8; i++)
            System.out.println(mystack2.pop());



    }
}
