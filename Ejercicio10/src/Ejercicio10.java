public class Ejercicio10 {
    public static void main(String[] args) {
        int num1=25;
        int num2=10;
        int num3=100;
        int num4=5;
        int num5=2;
        boolean var1=true;
        boolean var2= false;
        double raiz=Math.sqrt(num1);
        int operacion1=(int)(raiz*num2);
        int operacion2=(num2/num4);
        boolean condicion1=operacion1>=num3;
        boolean condicion2=operacion2>=num5;
        boolean condicion3=condicion1&&var1;
        boolean condicion4=condicion3||var2;
        boolean respuesta=condicion4||condicion2;
        System.out.println("El resultado de la operacion raiz(25) * 10 es: " + operacion1);
        System.out.println("El resultado de la operacion 10 / 5 es: " + operacion2);
        System.out.println("La primera condicion (" + operacion1 + " >= " + num3 + "): " + condicion1);
        System.out.println("La segunda condicion (10 / 5 >= " + num5 + "): " + condicion2);
        System.out.println("El resultado de la operacion logica (" + condicion1 + " && " + var1 + "): " + condicion3);
        System.out.println("El resultado de la operacion logica (" + condicion3 + " || " + var2 + "): " + condicion4);
        System.out.println("El resultado final de la operacion logica (" + condicion4 + " || " + condicion2 + "): " + respuesta);
    }
}
