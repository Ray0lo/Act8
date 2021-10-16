public class Triangle implements Shape{
    private float altura;
    private float base;
    private float lado1;
    private float lado2;
    private float lado3;

    public double getArea(){
        return (base *altura/2);

    }
    public double getPerimeter(){
        return lado1 + lado2 + lado3;
        
    }

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getBase() {
        return this.base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getLado1() {
        return this.lado1;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public float getLado2() {
        return this.lado2;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }

    public float getLado3() {
        return this.lado3;
    }

    public void setLado3(float lado3) {
        this.lado3 = lado3;
    }

}
