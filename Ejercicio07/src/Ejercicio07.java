public class Ejercicio07 {
    public static void main(String[] args) {
        int num1=81;
        int num2=9;
        int num3=3;
        int num4=10;
        int num5=1;
        int num6=100;
        int num7=25;
        double raiz1=Math.sqrt(num1);
        double raiz2=Math.sqrt(num6);
        int resultado1= (int)(raiz1+num2)/num3;
        int resultado2=(int)num6/num7;
        boolean condicion1= resultado1 == num2;
        boolean condicion2= num4>num5;
        boolean condicion3= resultado2>=raiz2;
        boolean resultado3= condicion2&&condicion3;
        boolean resultado4=condicion1||resultado3;
        System.out.println("El resultado de la primera operacion (raiz(81) + 9) / 3 es: " + resultado1);
        System.out.println("El resultado de la segunda operacion 100 / 25 es: " + resultado2);
        System.out.println("El resultado de la raiz cuadrada de 100 es: " + raiz2);
        System.out.println("La primera condicion (" + resultado1 + " == 9): " + condicion1);
        System.out.println("La segunda condicion (10 > 1): " + condicion2);
        System.out.println("La tercera condicion (" + resultado2 + " >= " + raiz2 + "): " + condicion3);
        System.out.println("El resultado de la operacion logica (" + condicion2 + " && " + condicion3 + "): " + resultado3);
        System.out.println("El resultado final de la operacion logica (" + condicion1 + " || " + resultado3 + "): " + resultado4);
    }
}
