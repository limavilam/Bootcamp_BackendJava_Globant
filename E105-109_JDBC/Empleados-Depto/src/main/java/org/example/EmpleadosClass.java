package org.example;

import java.sql.Date;

public class EmpleadosClass {
    private Object idEmp;
    private String nombre;
    private String sexEmp;
    private Date fecNac;
    private Date fecIncorporacion;
    private double salEmp;
    private double comisionEmp;
    private String cargoEmp;
    private Object idDepto;
    private DepartamentosClass departamentosByIdDepto;

    public Object getIdEmp() {
        return idEmp;
    }

    public void setIdEmp(Object idEmp) {
        this.idEmp = idEmp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexEmp() {
        return sexEmp;
    }

    public void setSexEmp(String sexEmp) {
        this.sexEmp = sexEmp;
    }

    public Date getFecNac() {
        return fecNac;
    }

    public void setFecNac(Date fecNac) {
        this.fecNac = fecNac;
    }

    public Date getFecIncorporacion() {
        return fecIncorporacion;
    }

    public void setFecIncorporacion(Date fecIncorporacion) {
        this.fecIncorporacion = fecIncorporacion;
    }

    public double getSalEmp() {
        return salEmp;
    }

    public void setSalEmp(double salEmp) {
        this.salEmp = salEmp;
    }

    public double getComisionEmp() {
        return comisionEmp;
    }

    public void setComisionEmp(double comisionEmp) {
        this.comisionEmp = comisionEmp;
    }

    public String getCargoEmp() {
        return cargoEmp;
    }

    public void setCargoEmp(String cargoEmp) {
        this.cargoEmp = cargoEmp;
    }

    public Object getIdDepto() {
        return idDepto;
    }

    public void setIdDepto(Object idDepto) {
        this.idDepto = idDepto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpleadosClass that = (EmpleadosClass) o;

        if (Double.compare(salEmp, that.salEmp) != 0) return false;
        if (Double.compare(comisionEmp, that.comisionEmp) != 0) return false;
        if (idEmp != null ? !idEmp.equals(that.idEmp) : that.idEmp != null) return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;
        if (sexEmp != null ? !sexEmp.equals(that.sexEmp) : that.sexEmp != null) return false;
        if (fecNac != null ? !fecNac.equals(that.fecNac) : that.fecNac != null) return false;
        if (fecIncorporacion != null ? !fecIncorporacion.equals(that.fecIncorporacion) : that.fecIncorporacion != null)
            return false;
        if (cargoEmp != null ? !cargoEmp.equals(that.cargoEmp) : that.cargoEmp != null) return false;
        if (idDepto != null ? !idDepto.equals(that.idDepto) : that.idDepto != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = idEmp != null ? idEmp.hashCode() : 0;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (sexEmp != null ? sexEmp.hashCode() : 0);
        result = 31 * result + (fecNac != null ? fecNac.hashCode() : 0);
        result = 31 * result + (fecIncorporacion != null ? fecIncorporacion.hashCode() : 0);
        temp = Double.doubleToLongBits(salEmp);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(comisionEmp);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (cargoEmp != null ? cargoEmp.hashCode() : 0);
        result = 31 * result + (idDepto != null ? idDepto.hashCode() : 0);
        return result;
    }

    public DepartamentosClass getDepartamentosByIdDepto() {
        return departamentosByIdDepto;
    }

    public void setDepartamentosByIdDepto(DepartamentosClass departamentosByIdDepto) {
        this.departamentosByIdDepto = departamentosByIdDepto;
    }
}
