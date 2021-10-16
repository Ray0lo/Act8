import java.util.Scanner;
import java.io.*;
import javax.swing.plaf.basic.BasicTreeUI.TreeIncrementAction;

public class App {
    public static BufferedReader entrada = 
    new BufferedReader (new InputStreamReader(System.in));
    public static void main(String[] args) throws Exception {
        char opcion;
        int opcionAP;
        float area, perimetro, radio, base, altura, lado1, lado2, lado3, ladosA, ladoS, perimetrocir;
        Scanner sc = new Scanner(System.in);
        Circle circulo = new Circle();
        Triangle triangulo = new Triangle();
        Square cuadrado = new Square();

        System.out.println("Menu de calduladora de perimetro y area de figuras. ");
        System.out.println("Seleccione cual es la figura que desea saber el Perimetro y Area. ");
        System.out.println("1. Triángulo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Circulo");
        System.out.println("4. Salir");

        opcion = sc.next().charAt(0);
        switch(opcion){
            case '1': 
            System.out.println("Dijite la base del Triángulo: ");
            base = Integer.parseInt(entrada.readLine());
            System.out.println("Dijite la altura del Triángulo: ");
            altura = Integer.parseInt(entrada.readLine());
            triangulo.setAltura(altura);
            triangulo.setBase(base);
            area = (float) triangulo.getArea();
            System.out.println("Dijite el primer lado del Triángulo: ");
            lado1 = Integer.parseInt(entrada.readLine());
            System.out.println("Dijite el segundo lado del Triángulo: ");
            lado2 = Integer.parseInt(entrada.readLine());
            System.out.println("Dijite el tercer lado del Triángulo: ");
            lado3 = Integer.parseInt(entrada.readLine());
            triangulo.setLado1(lado1);
            triangulo.setLado2(lado2);
            triangulo.setLado3(lado3);
            perimetro = (float) triangulo.getPerimeter();
            System.out.println("El Area del Triágulo es: " + area);
            System.out.println("El Perimetro del Triágulo es: " + perimetro);
            break;

            case '2':
            System.out.println("Dijite el lado del Cuadrado: ");
            ladosA = Integer.parseInt(entrada.readLine());
            cuadrado.setLado(ladosA);
            System.out.println("Dijite el lado del Cuadrado: ");
            area = (float) cuadrado.getArea();
            ladoS = Integer.parseInt(entrada.readLine());
            cuadrado.setLado(ladoS);
            perimetro = (float) cuadrado.getPerimeter();
            System.out.println("El Area del Cuadrado es : " + area);
            System.out.println("El Perimetro del Cuadrado es : " + perimetro);
            break;

            case '3':
            System.out.println("Dijite el radio del Circulo: ");
            radio = Integer.parseInt(entrada.readLine());
            circulo.setRadio(radio);
            area = (float) circulo.getArea();
            System.out.println("Dijite el perimetro del Circulo: ");
            perimetrocir = Integer.parseInt(entrada.readLine());
            circulo.getPerimeter();
            perimetro = (float) circulo.getPerimeter();
            System.out.println("El Area del Circulo es : " + area);
            System.out.println("El Perimetro del Circulo es : " + perimetro);
            break;

            case '4':
            break;

        }

    }
    
    
}
