package org;

public class CarroEstadoDesligado extends CarroEstado {

    private CarroEstadoDesligado() {};
    private static CarroEstadoDesligado instance = new CarroEstadoDesligado();
    public static CarroEstadoDesligado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Desligado";
    }

    public boolean ligar(Carro carro) {
        carro.setEstado(CarroEstadoLigado.getInstance());
        return true;
    }
}
