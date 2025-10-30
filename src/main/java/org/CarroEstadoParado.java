package org;

public class CarroEstadoParado extends CarroEstado {

    private CarroEstadoParado() {};
    private static CarroEstadoParado instance = new CarroEstadoParado();
    public static CarroEstadoParado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Parado";
    }

    public boolean acelerar(Carro carro) {
        carro.setEstado(CarroEstadoEmMovimento.getInstance());
        return true;
    }

    public boolean desligar(Carro carro) {
        carro.setEstado(CarroEstadoDesligado.getInstance());
        return true;
    }
}
