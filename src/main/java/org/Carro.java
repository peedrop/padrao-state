package org;

public class Carro {

    private String modelo;
    private CarroEstado estado;

    public Carro() {
        this.estado = CarroEstadoDesligado.getInstance();
    }

    public void setEstado(CarroEstado estado) {
        this.estado = estado;
    }

    public boolean ligar() {
        return estado.ligar(this);
    }

    public boolean desligar() {
        return estado.desligar(this);
    }

    public boolean acelerar() {
        return estado.acelerar(this);
    }

    public boolean frear() {
        return estado.frear(this);
    }

    public boolean quebrar() {
        return estado.quebrar(this);
    }

    public boolean consertar() {
        return estado.consertar(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public CarroEstado getEstado() {
        return estado;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }
}
