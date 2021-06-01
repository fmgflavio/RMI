/* COM242 - SISTEMAS DISTRIBUIDOS 
   2018005379 - Flavio Mota Gomes
*/

import java.rmi.*;

// Definição da interface que descreve os objetos remotos que poderao ser acessados pelo cliente
public interface InterfaceServidorMat extends Remote
{
    public String bhaskara(double a, double b, double c) throws RemoteException;
}