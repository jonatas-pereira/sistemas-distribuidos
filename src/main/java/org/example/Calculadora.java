package org.example;

import java.rmi.Remote;
import java.rmi.RemoteException;

// Definindo a interface remota
public interface Calculadora extends Remote {
    // Método remoto para somar dois números
    public int soma(int a, int b) throws RemoteException;
}

