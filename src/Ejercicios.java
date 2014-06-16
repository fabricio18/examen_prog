
public class Ejercicios
{	
	//Estos ejercicios fueron realizados con la ayuda de Iveth Sabillon y Kevin Lanza
	//devuelve true si numero es multiplo de 3, de lo contrario devuelve false
	//2 puntos
	static boolean esMultiploDeTres(int num)
	//se uso el if para poder valorar si el resultado del numero es verdadero o falso siempre y cuando sea multiplo.
	{
		if(num%3==0)
	           return true;
	        else
	            return false;
	}
	
	//devuelve el numero menor entre a, b o c
	//3 puntos
	static int getMenor(int a, int b, int c)
	{
		// en este ejemplo podemos ver el resulatado mayor a menor usando el if para calcular "si" el numero es mayor o menor y al final de los tres calcular el mayor
		if(a < b)
	           if(a<c)
	              return a;
	           else
	              return c;
	        else if(b<c)
	              return b;
	                else
	              return c;
	}
	
	//devuelve el promedio los elementos de un arreglo
	//5 puntos
	static int getPromedio(int arreglo[])
	{
		// primero abrimos o creamos una variable que se llama resultado que nos permitira guardar o almacenar los calculos introducidos
		int resultado = 0;
	int cantidad_numeros = 0;
	// se utiliza en for para que en el arreglo se acumule la cantidad de la variable o el valor de los elementos y al final s de divide la suma total de los valore.
	//ejemplo obtenido por el compañero kevin. 									
	for (int i=0; i<arreglo.length;i++)
		resultado +=arreglo[i];
	cantidad_numeros++;
	resultado = (resultado / cantidad_numeros);
	return resultado;
	
	}
	
	//Realizar una funcion con las siguientes indicaciones:
	//Si el parametro recibido es "Honduras" devolvera "Tegucigalpa"
	//Si el parametro recibido es "Francia" devolvera "Paris" j
	//Si el parametro recibido es "Inglaterra" devolvera "Londres"
	static String getCapital(String pais)
	{
		return "";
	}
	
	//realizarla siguiente funcion recurisva:
	
	/* Pseudocodigo*/
	//funcionRecursiva(num)
	//  si num == 0
	//    devolver 0
	//  fin si
	//  devolver num + funcionRecursiva(num-1)
	
	/*Notacion matematica*/
	//funcionRecusriva(num) = num + funcionRecursiva(num-1)
	//Donde funcionRecursiva(0) = 0
	
	//1 punto oro extra
	static int funcionRecursiva(int num)
	// ejercicio obtenido por el compañero kevin en este ejericio podemos ver la funcion recursiva del problema al momento de definir una variable y al encontrarla va haver la operacion matematica
	{
		int resultado;
		if (num == 0)
		{
			resultado=0;
		}
		else
		{
			resultado = num +funcionRecursiva(num -1);
		}
	return resultado;
}
	


	
	public static void main(String args[])
	{
	}
}
