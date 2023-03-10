public class DemoSuper {
    public static void main(String[] args) {
        BoxWeight my_box1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight my_box2 = new BoxWeight(2, 3, 4, 0.076);
        BoxWeight my_box3 = new BoxWeight(); //default

        BoxWeight cube =  new BoxWeight(3, 2);
        BoxWeight clone = new BoxWeight(my_box1);
        double vol;

        vol = my_box1.Volume();
        System.out.println("Volume of my_box1 is :" + vol);

    }
}
