package no.hvl.dat100.oppgave2;



public class Bilde extends Tekst {

	protected String url;

	public Bilde(int id, String bruker, String dato, String tekst, String url) {
		super(id, bruker, dato, tekst);
        this.url = url;
	}

	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
		super(id, bruker, dato, likes, tekst);
        this.url = url;
	}
	
	public String getUrl() {
		return this.url;

	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
        return
                "Bilde" + "\n" + super.getId() + "\n" + super.getBruker() + "\n" + super.getDato() + "\n" + super.getLikes() + "\n" + super.getTekst() + "\n" + url + "\n";
	}

	// Metoden nedenfor er kun for valgfri oppgave 6

}
