package MarteGroup;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FuegosArtificiales> fuegosArtificiales = new ArrayList<>();
        FuegosArtificialesIndividuales fuegosArtificialesIndividuales1_1 = new FuegosArtificialesIndividuales();
        FuegosArtificialesIndividuales fuegosArtificialesIndividuales1_2 = new FuegosArtificialesIndividuales();
        FuegosArtificialesIndividuales fuegosArtificialesIndividuales1_3 = new FuegosArtificialesIndividuales();
        fuegosArtificiales.add(fuegosArtificialesIndividuales1_1);
        fuegosArtificiales.add(fuegosArtificialesIndividuales1_2);
        fuegosArtificiales.add(fuegosArtificialesIndividuales1_3);

        FuegosArtificialesPack fuegosArtificialesPack = new FuegosArtificialesPack();
        FuegosArtificialesIndividuales fuegosArtificialesIndividuales2_1 = new FuegosArtificialesIndividuales();
        FuegosArtificialesIndividuales fuegosArtificialesIndividuales2_2 = new FuegosArtificialesIndividuales();
        FuegosArtificialesIndividuales fuegosArtificialesIndividuales2_3 = new FuegosArtificialesIndividuales();
        fuegosArtificialesPack.addFuegosArtificiales(fuegosArtificialesIndividuales2_1);
        fuegosArtificialesPack.addFuegosArtificiales(fuegosArtificialesIndividuales2_2);
        fuegosArtificialesPack.addFuegosArtificiales(fuegosArtificialesIndividuales2_3);
        FuegosArtificialesPack fuegosArtificialesPack1_2 = new FuegosArtificialesPack();
        FuegosArtificialesIndividuales fuegosArtificialesIndividuales1_2_1 = new FuegosArtificialesIndividuales();
        FuegosArtificialesIndividuales fuegosArtificialesIndividuales1_2_2 = new FuegosArtificialesIndividuales();
        FuegosArtificialesIndividuales fuegosArtificialesIndividuales1_2_3 = new FuegosArtificialesIndividuales();
        fuegosArtificialesPack1_2.addFuegosArtificiales(fuegosArtificialesIndividuales1_2_1);
        fuegosArtificialesPack1_2.addFuegosArtificiales(fuegosArtificialesIndividuales1_2_2);
        fuegosArtificialesPack1_2.addFuegosArtificiales(fuegosArtificialesIndividuales1_2_3);
        fuegosArtificialesPack.addFuegosArtificiales(fuegosArtificialesPack1_2);

        fuegosArtificiales.add(fuegosArtificialesPack);

        List<Invitados> invitados = new ArrayList<>();
        InvitadosMeli invitadosMeli1 = new InvitadosMeli();
        InvitadosMeli invitadosMeli2 = new InvitadosMeli();
        InvitadosMeli invitadosMeli3 = new InvitadosMeli();
        invitados.add(invitadosMeli1);
        invitados.add(invitadosMeli2);
        invitados.add(invitadosMeli3);

        InvitadosStandard invitadosSInvitadosStandard1 = new InvitadosStandard();
        InvitadosStandard invitadosSInvitadosStandard2 = new InvitadosStandard();
        InvitadosStandard invitadosSInvitadosStandard3 = new InvitadosStandard();

        invitados.add(invitadosSInvitadosStandard1);
        invitados.add(invitadosSInvitadosStandard2);
        invitados.add(invitadosSInvitadosStandard3);

        Evento evento = new Evento(fuegosArtificiales, invitados);
        evento.LaChiqui();

        System.out.println("Cantidad de fuegos artificiales: " + evento.cantidadFuegosArtificiales());

    }
}
