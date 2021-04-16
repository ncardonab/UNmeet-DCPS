import java.util.ArrayList;
import java.util.List;

public class Sucursal implements Departamento {
	private  Integer id;
	private String nombre;
	private List<Departamento> DepartamentoHijos;
	public Sucursal(Integer id, String nombre) {
		this.id = id;
		this.nombre = nombre;
		this.DepartamentoHijos = new ArrayList<>();
	}
	public void imprimirNombreDepartamento() {
		DepartamentoHijos.forEach(Departamento::imprimirNombreDepartamento);
	}
	public void addDepartamento(Departamento departamento) {
		DepartamentoHijos.add(departamento);
	}
	public void removeDepartamento(Departamento departamento) {
		DepartamentoHijos.remove(departamento);
	}
	public List<Departamento> getChildren() {
		return this.DepartamentoHijos;
	}
}


