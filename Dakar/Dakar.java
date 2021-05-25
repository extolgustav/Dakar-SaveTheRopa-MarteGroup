package Dakar;

import java.util.ArrayList;
import java.util.List;

public class Dakar {
    public static void main(String[] args) {

        Auto auto1 = new Auto(1200.0, 30.0, 10.0, "A");
        Auto auto2 = new Auto(110.0, 40.0, 10.0, "B");
        Auto auto3 = new Auto(103.0, 50.0, 10.0, "C");
        Auto auto4 = new Auto(107.0, 100.0, 10.0, "D");
        Auto auto5 = new Auto(102.0, 20.0, 10.0, "E");
        Moto moto1 = new Moto(1200.0, 30.0, 10.0, "E");
        Moto moto2 = new Moto(1200.0, 30.0, 10.0, "F");
        Moto moto3 = new Moto(1200.0, 30.0, 10.0, "G");
        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(auto1);
        vehiculos.add(auto2);
        vehiculos.add(auto3);
        vehiculos.add(auto4);
        vehiculos.add(auto5);

        vehiculos.add(moto1);
        vehiculos.add(moto2);
        vehiculos.add(moto3);

        Carrera carrera = new Carrera(100.0, 1000, "nombre", 2, vehiculos);
        carrera.eliminarVehiculo(auto2);
        carrera.eliminarVehiculoConPatente("A");
        System.out.println("Participantes de la Carrera: ");
        carrera.getVehiculos().forEach(v -> System.out.println("Patente: " + v.getPatente()));
        System.out.println("-------------------------------------------------");
        carrera.getVehiculos().forEach(v -> System.out.println("Vehiculo: " + v.getPatente() + " " + v.getVelocidad()
                + " " + v.getAceleracion() + " " + v.getPeso() + " " + v.getAnguloDeGiro()));
        System.out.println("Vehiculo ganador:" + carrera.ganador().getPatente());
        carrera.socorrerAuto("A");
    }
}