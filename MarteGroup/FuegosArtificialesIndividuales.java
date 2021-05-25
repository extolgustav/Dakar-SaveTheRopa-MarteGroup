package MarteGroup;

public class FuegosArtificialesIndividuales extends FuegosArtificiales {

    public FuegosArtificialesIndividuales() {
        super();
    }

    @Override
    public void explotar() {

        System.out.println("Explotandoo,,,,,,,,,");

    }

    @Override
    public Integer cantidad() {
        return 1;

    }

}
