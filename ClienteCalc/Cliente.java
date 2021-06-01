/* COM242 - SISTEMAS DISTRIBUIDOS 
   2018005379 - Flavio Mota Gomes
*/

import java.rmi.*;
import java.util.Scanner;

public class Cliente
{
	public Cliente()
	{
		System.out.println("Executando Cliente... \n");
		try
		{   // Acessa o servidor de nomes para localização das funções remotas
			msi = (InterfaceServidorMat) Naming.lookup("rmi://192.168.56.1:1099/ServidorMat_1");
		}
		catch (Exception e)
		{
			System.out.println("Falhou a execucao do Cliente.\n"+e);				
			System.out.println("Certifique se a aplicacao no servidor esta em execucao.\n");				
			System.exit(0);
		}
	}
	
	public static void main (String[] argv)
	{
		Cliente c = new Cliente();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Entre com valores de a, b e c separados por espaco:");
		double x = keyboard.nextDouble();
		double y = keyboard.nextDouble();
		double z = keyboard.nextDouble();
		System.out.println("");
		
		try
		{   // Cada chamada de uma função remota é uma instância da classe Cliente
			System.out.println("bhaskara (x, y, z): " + c.add(x,y,z));
		}
		catch (Exception e)
		{
			System.out.println("Excepção durante chamadas remotas:" +e);
		}
	}

	private InterfaceServidorMat msi; // A interface para o objecto remoto
	
	
	// Chamada as funções remotas para realização das operações matemáticas
	public String add(double a, double b, double c) throws RemoteException{
		 return msi.bhaskara(a,b,c);	
	}
}