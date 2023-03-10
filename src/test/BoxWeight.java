public class BoxWeight extends  Box{
    double weight; //weight of box


    //construct clone of an object
    BoxWeight(BoxWeight ob){
        super(ob);
        this.weight = ob.weight;
    }

    //Constructor when all parameters all specified
    BoxWeight(double _w, double _h, double _d, double _m){
        //call of superclass of constructor
        super(_w, _h, _d);
        this.weight = _m;
    }

    //default constructor
    BoxWeight(){
        super();
        weight = -1;

    }

    //constructor used when cube is created
    BoxWeight(double len, double m){
        super(len);
        this.weight = m;
    }
}

