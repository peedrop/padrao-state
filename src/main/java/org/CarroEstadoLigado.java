package org;

public class CarroEstadoLigado extends CarroEstado {

    private CarroEstadoLigado() {};
    private static CarroEstadoLigado instance = new CarroEstadoLigado();
    public static CarroEstadoLigado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Ligado";
    }

    public boolean desligar(Carro carro) {
        carro.setEstado(CarroEstadoDesligado.getInstance());
        return true;
    }

    public boolean acelerar(Carro carro) {
        carro.setEstado(CarroEstadoEmMovimento.getInstance());
        return true;
    }

    public boolean quebrar(Carro carro) {
        carro.setEstado(CarroEstadoComPane.getInstance());
        return true;
    }
}