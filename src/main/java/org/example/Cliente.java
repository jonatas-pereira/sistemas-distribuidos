package org.example;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Cliente {
    public static void main(String[] args) {
        try {
            // Obtém o registro RMI
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
    
            // Procura pelo objeto remoto chamado "Calculadora"
            Calculadora stub = (Calculadora) registry.lookup("Calculadora");

            // Chama o método remoto soma
            int resultado = stub.soma(5, 3);
            System.out.println("Resultado da soma: " + resultado);
        } catch (Exception e) {
            System.err.println("Erro no cliente: " + e.toString());
            e.printStackTrace();
        }
    }
}

