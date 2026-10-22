public class Ejercicio09 {
    public static void main(String[] args) {
        int num1=81;
        int num2=25;
        int num3=10;
        int num4=50;
        double raiz1=Math.sqrt(num1);
        double raiz2=Math.sqrt(num2);
        int operacion1= (int)(raiz2*num3);
        int operacion2=(int)(raiz1+operacion1);
        boolean resultado= operacion2>=num4;
        System.out.println("El resultado de la operacion raiz(81) + raiz(25) * 10 es: " + operacion2);
        System.out.println("El resultado de la condicion (" + operacion2 + " >= " + num4 + ") es: " + resultado);
    } 
}
