package clases;

public interface Sujeto {
	void suscribirObservador(Observador o);
	void desuscribirObservador(Observador o);
	void avisarObservadorer();
}
