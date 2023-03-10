public class Box {
    private  double width;
    private  double height;
    private  double depth;

    //Construct clone of an object
    Box(Box ob){
        this.width = ob.width;
        this.height = ob.height;
        this.depth = ob.depth;

    }

    //Constructor used when all dimensions are specified
    Box(double w, double h, double d){ //Pass object to constructor
        this.width = w;
        this.height = h;
        this.depth = d;

    }

    //Constructor used when dimensions specified
    Box(){
        this.width = -1;
        this.height = -1;
        this.depth = -1;
    }

    //Constructor used when cube is created
    Box(double len){
        this.width = this.height = this.depth = len;
    }

    //compute and return volume
    double Volume(){
        return this.width * this.height * this.depth;
    }

}
