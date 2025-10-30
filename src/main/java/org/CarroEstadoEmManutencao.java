package org;

public class CarroEstadoEmManutencao extends CarroEstado {

    private CarroEstadoEmManutencao() {};
    private static CarroEstadoEmManutencao instance = new CarroEstadoEmManutencao();
    public static CarroEstadoEmManutencao getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Em Manutenção";
    }

    public boolean ligar(Carro carro) {
        carro.setEstado(CarroEstadoLigado.getInstance());
        return true;
    }
}
