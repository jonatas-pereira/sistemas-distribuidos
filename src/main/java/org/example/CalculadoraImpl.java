package org.example;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

// Implementação da interface remota
public class CalculadoraImpl extends UnicastRemoteObject implements Calculadora {

    // Construtor
    public CalculadoraImpl() throws RemoteException {
        super();
    }

    // Implementa o método soma
    public int soma(int a, int b) throws RemoteException {
        return a + b;
    }

    // Método main para iniciar o servidor
    public static void main(String[] args) {
        try {
            // Cria uma instância do servidor
            CalculadoraImpl calc = new CalculadoraImpl();

            // Cria o registro RMI na porta 1099
            Registry registry = LocateRegistry.createRegistry(1099);

            // Registra o objeto remoto com o nome "Calculadora"
            registry.rebind("Calculadora", calc);

            System.out.println("Servidor de Calculadora pronto!");
        } catch (Exception e) {
            System.err.println("Erro no servidor: " + e.toString());
            e.printStackTrace();
        }
    }
}

