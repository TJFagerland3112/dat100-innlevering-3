package no.hvl.dat100.oppgave3;

import no.hvl.dat100.oppgave1.*;

public class Blogg {

	protected Innlegg[] innleggtabell;
    protected int nesteledig;

	public Blogg() {
        this.innleggtabell = new Innlegg[20];
        this.nesteledig = 0;
    }

	public Blogg(int lengde) {
        this.innleggtabell = new Innlegg[lengde];
        this.nesteledig = 0;
    }

	public int getAntall() {
        return nesteledig;
	}
	
	public Innlegg[] getSamling() {
		return this.innleggtabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {
        int innleggPeker = -1;
        int i = 0;
        while (i < nesteledig && innleggPeker < 0) {
            if (innleggtabell[i].erLik(innlegg)) {
                innleggPeker = i;
            } else {
                i++;
            }
        }
        return innleggPeker;
	}

	public boolean finnes(Innlegg innlegg) {
        return (finnInnlegg(innlegg) >= 0);
	}

	public boolean ledigPlass() {
        return (nesteledig < innleggtabell.length);
	}
	
	public boolean leggTil(Innlegg innlegg) {

        boolean sattinn = false;

        if (!finnes(innlegg) && ledigPlass()) {
            innleggtabell[nesteledig] = innlegg;
            nesteledig++;
            sattinn = true;
        }
        return sattinn;
	}
	@Override
	public String toString() {

        StringBuilder result = new StringBuilder(nesteledig + "\n");

        for (int i = 0; i < nesteledig; i++) {
            result.append(innleggtabell[i].toString());
        }
        return result.toString();
	}

	// valgfrie oppgaver nedenfor
	

}