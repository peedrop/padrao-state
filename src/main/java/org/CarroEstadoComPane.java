package org;

public class CarroEstadoComPane extends CarroEstado {

    private CarroEstadoComPane() {};
    private static CarroEstadoComPane instance = new CarroEstadoComPane();
    public static CarroEstadoComPane getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Com Pane";
    }

    public boolean consertar(Carro carro) {
        carro.setEstado(CarroEstadoEmManutencao.getInstance());
        return true;
    }
}
