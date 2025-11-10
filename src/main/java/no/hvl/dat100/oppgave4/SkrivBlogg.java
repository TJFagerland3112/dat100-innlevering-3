package no.hvl.dat100.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.Innlegg;
import no.hvl.dat100.oppgave2.Bilde;
import no.hvl.dat100.oppgave2.Tekst;
import no.hvl.dat100.oppgave3.*;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

        boolean skrevet = false;

		try {
            String filsti;
            if (mappe != null && !mappe.equals("")) {
                filsti = mappe + "/" + filnavn;
            } else {
                filsti = filnavn;
            }

            FileWriter filewriter = new FileWriter(filsti);
            PrintWriter writer = new PrintWriter(filewriter);

            writer.print(samling.toString());

            writer.close();

            skrevet = true;

        } catch (IOException e) {
            System.out.println("Feil ved skriving til fil: " + e.getMessage());
        }

        return skrevet;

    }

    //bare testet litt
    /*
    public static void main(String[] args) {
        Bilde innlegg1 = new Bilde(2, "hans", "22-03", "hei", "https://hvl.instructure.com/courses/31932");
        Tekst innlegg2 = new Tekst(2, "hans", "22-03", "hei");
        Blogg bloggen = new Blogg(2);

        boolean a = SkrivBlogg.skriv(bloggen, "Hans", "innlegg");

        System.out.println(a);

    }

     */
}
