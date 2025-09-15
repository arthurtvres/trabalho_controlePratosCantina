package org.controlePratos.entity;

public class Prato {
    private int id;
    private String estado;

    public Prato(int id, String estado) {
        this.id = id;
        this.estado = estado;
    }
    public int getId() {
        return id;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Prato{id=" + id + ", estado='" + estado + "'}";
    }
}
