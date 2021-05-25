package Dakar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Carrera {
    private Double distancia;
    private Integer premioEnDolares;
    private String nombre;
    private Integer cantidadDeVehiculosPermitidos;
    private List<Vehiculo> vehiculos;
    private SocorristaAuto socorristaAuto;
    private SocorristaMoto socorristaMoto;

    public Carrera(Double distancia, Integer premioEnDolares, String nombre, Integer cantidadDeVehiculosPermitidos,
            List<Vehiculo> vehiculos) {
        this.vehiculos = new ArrayList<Vehiculo>();
        this.distancia = distancia;
        this.premioEnDolares = premioEnDolares;
        this.nombre = nombre;
        this.cantidadDeVehiculosPermitidos = cantidadDeVehiculosPermitidos;
        this.vehiculos = vehiculos;
        this.socorristaAuto = new SocorristaAuto();
        this.socorristaMoto = new SocorristaMoto();
    }

    public Carrera() {
    }

    public void darDeAltaAuto(Double velocidad, Double aceleracion, Double anguloDeGiro, String patente) {
        if (this.vehiculos.size() < this.cantidadDeVehiculosPermitidos)
            this.vehiculos.add(new Auto(velocidad, aceleracion, anguloDeGiro, patente));

    }

    public void darDeAltaMoto(Double velocidad, Double aceleracion, Double anguloDeGiro, String patente) {
        if (this.vehiculos.size() < this.cantidadDeVehiculosPermitidos)
            this.vehiculos.add(new Moto(velocidad, aceleracion, anguloDeGiro, patente));

    }

    public void eliminarVehiculo(Vehiculo vehiculo) {
        this.vehiculos.remove(vehiculo);

    }

    public void eliminarVehiculoConPatente(String unaPatente) {
        this.vehiculos.removeIf(v -> v.getPatente().equals(unaPatente));

    }

    public Vehiculo ganador() {
        // Se realiza el calculo y se obtiene una lista por cada vehiculo
        List<Double> ganador = this.vehiculos.stream().map(vh -> 1 / 2.0 * vh.getVelocidad() * vh.getAceleracion()
                / (vh.getAnguloDeGiro() * (vh.getPeso() - vh.getRuedas() * 100))).collect(Collectors.toList());
        // Se devuelve el vehiculo que obtuvo el valor mayor del calculo
        return this.vehiculos.get(ganador.indexOf(Collections.max(ganador)));
    }

    public void socorrerAuto(String patente) {
        Optional<Vehiculo> auto = this.vehiculos.stream()
                .filter(v -> v.getPatente().equals(patente) && v.getRuedas() == 4).findFirst();

        if (auto.isPresent())
            this.socorristaAuto.socorrer((Auto) auto.get());

    }

    public void socorrerMoto(String patente) {
        Optional<Vehiculo> moto = this.vehiculos.stream()
                .filter(v -> v.getPatente().equals(patente) && v.getRuedas() == 2).findFirst();
        if (moto.isPresent())
            this.socorristaMoto.socorrer((Moto) moto.get());
    }

    public SocorristaAuto getSocorristaAuto() {
        return socorristaAuto;
    }

    public void setSocorristaAuto(SocorristaAuto socorristaAuto) {
        this.socorristaAuto = socorristaAuto;
    }

    public SocorristaMoto getSocorristaMoto() {
        return socorristaMoto;
    }

    public void setSocorristaMoto(SocorristaMoto socorristaMoto) {
        this.socorristaMoto = socorristaMoto;
    }

    public Double getDistancia() {
        return distancia;
    }

    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }

    public Integer getPremioEnDolares() {
        return premioEnDolares;
    }

    public void setPremioEnDolares(Integer premioEnDolares) {
        this.premioEnDolares = premioEnDolares;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCantidadDeVehiculosPermitidos() {
        return cantidadDeVehiculosPermitidos;
    }

    public void setCantidadDeVehiculosPermitidos(Integer cantidadDeVehiculosPermitidos) {
        this.cantidadDeVehiculosPermitidos = cantidadDeVehiculosPermitidos;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

}
