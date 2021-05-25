package MarteGroup;

import java.util.ArrayList;
import java.util.List;

public class FuegosArtificialesPack extends FuegosArtificiales {
    private List<FuegosArtificiales> fuegosArtificiales = new ArrayList<>();

    public FuegosArtificialesPack() {
        super();
    }

    public void addFuegosArtificiales(FuegosArtificiales fuegosArtificiales) {
        this.fuegosArtificiales.add(fuegosArtificiales);
    }

    public void rmFuegosArtificiales(FuegosArtificiales fuegosArtificiales) {
        this.fuegosArtificiales.remove(fuegosArtificiales);
    }

    @Override
    public void explotar() {

        fuegosArtificiales.forEach(f -> f.explotar());

    }

    @Override
    public Integer cantidad() {

        return this.fuegosArtificiales.stream().mapToInt(c -> c.cantidad()).sum();
    }
}
