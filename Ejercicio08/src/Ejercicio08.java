public class Ejercicio08 {
    public static void main(String[] args) {
        int num1=10;
        int num2=9;
        int num3=20;
        int num4=500;
        int num5=2;
        int num6=3;
        int num7=200;
        int num8=50;
        int num9=51;
        int potencia = (num6*num6);
        int operacion1= (num1*num2);
        int operacion2= (num4/num5);
        int operacion3= (operacion1+num3-operacion2+potencia);
        int operacion4= (num8-num8+num9);
        boolean condicion1=operacion3>=num7;
        boolean condicion2=num8>=operacion4;
        boolean resultado= condicion1 || condicion2;
        System.out.println("El resultado de la primera operacion 10 * 9 es: " + operacion1);
        System.out.println("El resultado de la segunda operacion 500 / 2 es: " + operacion2);
        System.out.println("El resultado de la potencia 3^2 es: " + potencia);
        System.out.println("El resultado de la operacion 10 * 9 + 20 - 500 / 2 + 3^2 es: " + operacion3);
        System.out.println("El resultado de la operacion 50 - 50 + 51 es: " + operacion4);
        System.out.println("La primera condicion (" + operacion3 + " >= 200): " + condicion1);
        System.out.println("La segunda condicion (50 >= " + operacion4 + "): " + condicion2);
        System.out.println("El resultado final de la operacion logica (" + condicion1 + " || " + condicion2 + "): " + resultado);  
    }
}
