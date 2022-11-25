package org.BenyIbarr.poosobrecarga;
public class Calculadora
{

    //Creamos un constructor para restringir que se pueda crear una instancia, puesto que ya creamos métodos estáticos

    public Calculadora()
    {

    }

    //Sobrecarga de métodos, mismo nombre del método distintos argumentos.
      public static int sumar(int a, int b)
        {
          return a + b;
        }
        //Utilizando el método varargs para poder sobrecargar un metodo con distinto número de valores
        public static int sumar (int... argumentos)
        {
            //Inicializamos los elementos con una variable
            int total=0;
            //Con un foreach controlamos la cantidad de elementos a considerar en el método
            for(int i :argumentos)
            {
                total+=i;
            }
            return total;
        }
        //Suma de elementos de tipo distinto como float e integer
        public static float sumar (float a, int... argumentos)
        {
            //Inicializamos los elementos con una variable
            float total=a;
            //Con un foreach controlamos la cantidad de elementos a considerar en el método
            for(int i :argumentos)
            {
                total+=i;
            }
            return total;
        }
        //Creamos un metodo para sumar doubles con n numero de elementos
    public static double sumar (double... argumentos)
    {
        //Inicializamos los elementos con una variable
        double total=0.0;
        //Con un foreach controlamos la cantidad de elementos a considerar en el método
        for(double i :argumentos)
        {
            total+=i;
        }
        return total;
    }
        public static float sumar(float x, float y)
        {
            return x + y;
        }
        public static float sumar(float i, int j)
        {
            return i+j;
        }
        public static float sumar(int i, float j)
        {
            return i+j;
        }
        public static double sumar (double a, double b)
        {
            return a + b;
        }
        public static int sumar(String a, String b)
        {
            int resultado;
            try
            {
                return Integer.parseInt(a) + Integer.parseInt(b);
            }
            catch (NumberFormatException e)
            {
                resultado=0;
            }
            return resultado;
        }
        public static int sumar(int a, int b, int c)
        {
            return a + b + c;
        }
}
