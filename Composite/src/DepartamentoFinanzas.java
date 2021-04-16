
public class DepartamentoFinanzas implements Departamento{
	private Integer id;
	private String nombre;
	public void imprimirNombreDepartamento() {
		System.out.println(nombre);
	}
	
	DepartamentoFinanzas(Integer id, String nombre){
		this.id = id;
		this.nombre = nombre;
	}
}
