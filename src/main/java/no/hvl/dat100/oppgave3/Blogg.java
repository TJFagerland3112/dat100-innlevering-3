package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
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
        int antall = 0;

		for (int i = 0; i < innleggtabell.length; i++) {
            if (innleggtabell[i] != null) {
                antall = i;
            } else break;
        }
        return antall;
	}
	
	public Innlegg[] getSamling() {
		return this.innleggtabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {
        int innleggPeker = 0;
        for (int i = 0; i < innleggtabell.length; i++) {
            if (innlegg.erLik(innleggtabell[i])) {
                innleggPeker = i;
                break;
            } else;
        }
        return innleggPeker;
	}

	public boolean finnes(Innlegg innlegg) {
        boolean finnes = false;
		for (int i = 0; i < innleggtabell.length; i++) {
            if (innlegg.getId() != innleggtabell[i].getId()) {
                finnes = false;
            } else {
                finnes = true;
                break;}
        }
        return finnes;
	}

	public boolean ledigPlass() {
        boolean ledigplass = false;

		for (int i = 0; i < innleggtabell.length; i++) {
            if (innleggtabell[i] == null) {
                ledigplass = true;
                break;
            } else ledigplass = false;
        }
        return ledigplass;
	}
	
	public boolean leggTil(Innlegg innlegg) {

        boolean sattinn = false;

        if (nesteledig < innleggtabell.length) {
            innleggtabell[nesteledig] = innlegg;
            nesteledig++;
            sattinn = true;
        }
        return sattinn;
	}
	
	public String toString() {

        String result = this.innleggtabell.length + "\n";

		for (int i = 0; i < innleggtabell.length; i++) {
            result += innleggtabell[i].toString();
        }
        return result;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}