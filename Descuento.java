package pack1;

public abstract class Descuento {
	private double montoDesc;
	
	public double Monto() {
		return montoDesc;
	}
	public void asignaMonto(double montoFijo) {
		montoDesc = montoFijo;
	}
    public abstract double montoFinal(double montoInicial);
}