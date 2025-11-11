package no.hvl.dat100.oppgave4;


import java.io.PrintWriter;


import no.hvl.dat100.oppgave3.*;
import java.io.IOException;

public class SkrivBlogg {

    public static boolean skriv(Blogg samling, String mappe, String filnavn) {

        boolean skrevet = false;

        PrintWriter writer;

        try {
            writer = new PrintWriter(mappe + filnavn);

            writer.print(samling.toString());

            writer.close();

        } catch (IOException e) {
            System.out.println("Feil ved skriving til fil: " + e.getMessage());
        }

        return skrevet;

    }
}
