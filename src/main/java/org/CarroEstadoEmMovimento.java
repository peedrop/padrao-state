package org;

public class CarroEstadoEmMovimento extends CarroEstado {

    private CarroEstadoEmMovimento() {};
    private static CarroEstadoEmMovimento instance = new CarroEstadoEmMovimento();
    public static CarroEstadoEmMovimento getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Em Movimento";
    }

    public boolean frear(Carro carro) {
        carro.setEstado(CarroEstadoParado.getInstance());
        return true;
    }

    public boolean quebrar(Carro carro) {
        carro.setEstado(CarroEstadoComPane.getInstance());
        return true;
    }
}
