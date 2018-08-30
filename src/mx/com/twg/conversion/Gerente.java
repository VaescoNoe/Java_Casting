package mx.com.twg.conversion;

public class Gerente extends Empleado{
	
	private String departamento;
	
	public Gerente(String nombre,double sueldo,String departamento) {
		super(nombre,sueldo);
		this.departamento=departamento;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	public String toString(){
		return super.toString()+"\nDepartamento: "+departamento;
	}

}
