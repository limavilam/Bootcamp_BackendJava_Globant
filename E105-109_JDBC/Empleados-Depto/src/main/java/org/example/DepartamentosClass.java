package org.example;

import java.util.Collection;

public class DepartamentosClass {
    private Object idDepto;
    private String nombreDepto;
    private String ciudad;
    private String nombreJefeDepto;
    private Collection<EmpleadosClass> empleadosByIdDepto;

    public Object getIdDepto() {
        return idDepto;
    }

    public void setIdDepto(Object idDepto) {
        this.idDepto = idDepto;
    }

    public String getNombreDepto() {
        return nombreDepto;
    }

    public void setNombreDepto(String nombreDepto) {
        this.nombreDepto = nombreDepto;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNombreJefeDepto() {
        return nombreJefeDepto;
    }

    public void setNombreJefeDepto(String nombreJefeDepto) {
        this.nombreJefeDepto = nombreJefeDepto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DepartamentosClass that = (DepartamentosClass) o;

        if (idDepto != null ? !idDepto.equals(that.idDepto) : that.idDepto != null) return false;
        if (nombreDepto != null ? !nombreDepto.equals(that.nombreDepto) : that.nombreDepto != null) return false;
        if (ciudad != null ? !ciudad.equals(that.ciudad) : that.ciudad != null) return false;
        if (nombreJefeDepto != null ? !nombreJefeDepto.equals(that.nombreJefeDepto) : that.nombreJefeDepto != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idDepto != null ? idDepto.hashCode() : 0;
        result = 31 * result + (nombreDepto != null ? nombreDepto.hashCode() : 0);
        result = 31 * result + (ciudad != null ? ciudad.hashCode() : 0);
        result = 31 * result + (nombreJefeDepto != null ? nombreJefeDepto.hashCode() : 0);
        return result;
    }

    public Collection<EmpleadosClass> getEmpleadosByIdDepto() {
        return empleadosByIdDepto;
    }

    public void setEmpleadosByIdDepto(Collection<EmpleadosClass> empleadosByIdDepto) {
        this.empleadosByIdDepto = empleadosByIdDepto;
    }
}
