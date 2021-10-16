

public class Circle implements Shape {
    private float radio;

    public double getArea(){
        return Math.PI * Math.pow(radio,2);
        
    }
    public double getPerimeter(){
        return Math.PI * (2 * radio);
    }
     public float getRadio(){
         return radio;
     }

     public void setRadio(float radio){
         this.radio = radio;
     }
}
