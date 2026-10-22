public class Ejercicio06 {
    public static void main(String[] args) {
        int num1=81;
        int num2=9;
        int num3=3;
        int num4=10;
        int num5=1;
        double raiz = Math.sqrt(num1);
        int operacion = (int)(raiz + num2)/num3;
        boolean condicion1 = (raiz + num2)/num3 == num2;
        boolean condicion2 = num4 > num5;
        boolean resultado = condicion1 && condicion2;
        System.out.println("El resultado de la primera operacion (raiz(81) + 9) / 3 es: " + operacion);
        System.out.println("Como " + operacion + " no es igual que 9: " + condicion1);
        System.out.println("Como 10 es mayor que 1: " + condicion2);
        System.out.println("El resultado final de la operacion es: ("+ condicion1+ "&&" + condicion2 + ") es: "+ resultado);
    }
     
}
