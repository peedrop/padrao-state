package org;

public abstract class CarroEstado {

    public abstract String getEstado();

    public boolean ligar(Carro carro) {
        return false;
    }

    public boolean desligar(Carro carro) {
        return false;
    }

    public boolean acelerar(Carro carro) {
        return false;
    }

    public boolean frear(Carro carro) {
        return false;
    }

    public boolean quebrar(Carro carro) {
        return false;
    }

    public boolean consertar(Carro carro) {
        return false;
    }
}
