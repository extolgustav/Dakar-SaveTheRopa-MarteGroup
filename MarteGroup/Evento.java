package MarteGroup;

import java.util.ArrayList;
import java.util.List;

public class Evento {

    private List<FuegosArtificiales> fuegosArtificiales = new ArrayList<>();

    private List<Invitados> invitados = new ArrayList<>();

    public Evento(List<FuegosArtificiales> fuegosArtificiales, List<Invitados> invitados) {
        this.fuegosArtificiales = fuegosArtificiales;
        this.invitados = invitados;
    }

    public List<Invitados> getInvitados() {
        return invitados;
    }

    public void setInvitados(List<Invitados> invitados) {
        this.invitados = invitados;
    }

    public List<FuegosArtificiales> getFuegosArtificiales() {
        return fuegosArtificiales;
    }

    public void setFuegosArtificiales(List<FuegosArtificiales> fuegosArtificiales) {
        this.fuegosArtificiales = fuegosArtificiales;
    }

    public void LaChiqui() {
        this.fuegosArtificiales.forEach(f -> f.explotar());
        this.invitados.forEach(f -> f.comerTorta());
    }

    public Integer cantidadFuegosArtificiales() {
        return fuegosArtificiales.stream().mapToInt(c -> c.cantidad()).sum();
    }

}
