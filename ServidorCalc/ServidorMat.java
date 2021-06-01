/* COM242 - SISTEMAS DISTRIBUIDOS 
   2018005379 - Flávio Mota Gomes
*/

import java.rmi.*;
import java.rmi.server.*;

// Classe no servidor que implementa os métodos remotos
public class ServidorMat extends UnicastRemoteObject implements InterfaceServidorMat
{
    public ServidorMat() throws RemoteException
    {
        System.out.println("Novo Servidor instanciado...");
    }
	
    public String bhaskara(double a, double b, double c) throws RemoteException
    {
	double delta, x1, x2, raiz_delta;
	delta = (b*b)-4*a*c;
	if (delta < 0){
		return "Valor de delta eh inferior a 0. Impossivel calcular.";
	}
	else{
		raiz_delta = Math.sqrt(delta);
		x1 = ((b*(-1))-(raiz_delta))/2*a;
		x2 = ((b*(-1))+(raiz_delta))/2*a;
        	System.out.println("Equacao: (" + a + ")x^2 + ("+  b + ")x + (" + c + ") = 0");
		return "x1 = " + x1 + " || x2 = " + x2;
	}
    }
} 