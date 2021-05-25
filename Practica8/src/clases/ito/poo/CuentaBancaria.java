package clases.ito.poo;

import java.time.LocalDate;

public class CuentaBancaria implements Comparable<CuentaBancaria>{
	
	private long numCuenta =0L;
	public String nomCliente="";
	public float saldo=0f;
	private LocalDate fechaApertura= null;
	private LocalDate fechaActualizacion= null;
	
	
	public CuentaBancaria(long numCuenta, String nomCliente, float saldo, LocalDate fechaApertura) {
		super();
		if(numCuenta<999)
			throw new RuntimeException("Tu numero de cuenta debe de ser mayor a $9999");
		this.numCuenta = numCuenta;
		this.nomCliente = nomCliente;
		
		if(saldo<5000) {
			throw new RuntimeException("El minimo para abrir una cuenta debe ser $5,000");}
		this.saldo = saldo;
		
		this.fechaApertura = fechaApertura;
	}
	
	public CuentaBancaria() {
		// Start of user code constructor for CuentaBancaria)
		super();
		// End of user code
	}

	/**
	 * Description of the method deposito.
	 * @param cantidad 
	 * @return 
	 */
	public boolean deposito(float cantidad) {
		// Start of user code for method deposito
		boolean deposito = false;
		if(this.fechaApertura!=null) {
			deposito=true;
		this.saldo=saldo+cantidad;
		this.fechaActualizacion=LocalDate.of(2021, 03, 12);
		}
		return deposito;
		// End of user code
	}
	
	/**
	 * Description of the method retiro.
	 * @param cantidad 
	 * @return 
	 */
	public boolean retiro(float cantidad) {
		// Start of user code for method retiro
		boolean retiro = false;
		if(cantidad <this.saldo) {
			this.saldo= saldo- cantidad;
			this.fechaActualizacion=LocalDate.of(2021, 03, 11);
			retiro=true;
		}
		return retiro;
		// End of user code
	}

	// Start of user code (user defined methods for CuentaBancaria)

	// End of user code
	/**
	 * Returns numCuenta.
	 * @return numCuenta 
	 */
	public long getNumCuenta() {
		return this.numCuenta;
	}

	/**
	 * Sets a value to attribute numCuenta. 
	 * @param newNumCuenta 
	 */
	public void setNumCuenta(long newNumCuenta) {
		if(numCuenta<999)
			throw new RuntimeException("Tu numero de cuenta debe de ser mayor a $9999");
		this.numCuenta = newNumCuenta;
	}

	/**
	 * Returns nomCliente.
	 * @return nomCliente 
	 */
	public String getNomCliente() {
		return this.nomCliente;
	}

	/**
	 * Sets a value to attribute nomCliente. 
	 * @param newNomCliente 
	 */
	public void setNomCliente(String newNomCliente) {
		this.nomCliente = newNomCliente;
	}

	/**
	 * Returns saldo.
	 * @return saldo 
	 */
	public float getSaldo() {
		return this.saldo;
	}

	/**
	 * Sets a value to attribute saldo. 
	 * @param newSaldo 
	 */
	public void setSaldo(float saldo) {
		if(saldo<5000)
			throw new RuntimeException("El minimo para abrir una cuenta debe ser $5,000");
		
		this.saldo = saldo;
	}

	/**
	 * Returns fechaApertura.
	 * @return fechaApertura 
	 */
	public java.time.LocalDate getFechaApertura() {
		return this.fechaApertura;
	}

	/**
	 * Sets a value to attribute fechaApertura. 
	 * @param newFechaApertura 
	 */
	public void setFechaApertura(java.time.LocalDate newFechaApertura) {
		this.fechaApertura = newFechaApertura;
	}

	/**
	 * Returns fechaActualizacion.
	 * @return fechaActualizacion 
	 */
	public java.time.LocalDate getFechaActualizacion() {
		return this.fechaActualizacion;
	}

	/**
	 * Sets a value to attribute fechaActualizacion. 
	 * @param newFechaActualizacion 
	 */
	public void setFechaActualizacion(java.time.LocalDate newFechaActualizacion) {
		this.fechaActualizacion = newFechaActualizacion;
	}
	


	@Override
	public String toString() {
		return "CuentaBancaria [numCuenta=" + numCuenta + ", nomCliente=" + nomCliente + ", saldo=" + saldo
				+ ", fechaApertura=" + fechaApertura  + "]";
	}
	public int compareTo(CuentaBancaria o) {
		int compare=0;
		if(this.numCuenta<o.getNumCuenta())
			compare=-1;
		else if(this.numCuenta>o.getNumCuenta())
			compare=1;
		return compare;
		
	}
}