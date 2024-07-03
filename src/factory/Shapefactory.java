package factory;

public class Shapefactory {

    public Shape getshape(String shapetype) throws Myexception {
        if (shapetype == null){
            return null;
        } else if (shapetype == "circle") {
            return new Circle();
        } else if (shapetype == "rectangle") {
            return new Rectangle();
        } else if (shapetype == "square") {
            return new Square() ;
        }else throw new Myexception("bele bir fiqur yoxdur");

    }


}
