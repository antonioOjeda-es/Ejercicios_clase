package com.hackaboss.datosCuriosos.entities;

public class DatoCurioso {

    private Integer id;
    private String datoCurioso;

    public DatoCurioso(){}

    public DatoCurioso(Integer id, String datoCurioso) {
        this.id = id;
        this.datoCurioso = datoCurioso;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDatoCurioso() {
        return datoCurioso;
    }

    public void setDatoCurioso(String datoCurioso) {
        this.datoCurioso = datoCurioso;
    }

    @Override
    public String toString() {
        return "DatoCurioso{" +
                "id=" + id +
                ", datoCurioso='" + datoCurioso + '\'' +
                '}';
    }
}
