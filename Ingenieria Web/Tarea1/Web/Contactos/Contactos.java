package Contactos;

public class Contactos {
	private String prefijo;
	private String nombre;
	private String apellido;
	private String sufijo;
	private String foneticaNombre;
	private String foneticaSegundo;
	private String foneticaApellido;
	private String apodo;
	private String archivarComo;
	private String empresa;
	private String cargo;
	private String departamento;
	private String correo;
	private int telefono;
	private String pais;
	private String direccion;
	private String direccion2;
	private String codigoPostal;
	private String ciudad;
	private String provincia;
	private String apartadoPostal;
	private String etiqueta;
	private String nacimiento;
	private String eventos;
	private String web;
	private String relacion;
	private String chat;
	private String llamadaWeb;
	private String personalizado;
	private String notas;

	// Prefijo
	public void setPrefijo(String arg) {
		prefijo = arg;

	}

	public String getPrefijo() {
		return prefijo;
	}

	// Nombre
	public void setNombre(String arg) {

		if (arg == null) {
			return;
		}

		if (arg.trim().length() == 0) {
			return;
		}

		nombre = arg;

	}

	public String getNombre() {
		return nombre;
	}

	
	// apellido
	public void setApellido(String arg) {
		apellido = arg;

	}

	public String getApellido() {
		return apellido;
	}

	// sufijo
	public void setSufijo(String arg) {
		sufijo = arg;

	}

	public String getSufijo() {
		return sufijo;
	}

	// foneticaNombre
	public void setFoneticaNombre(String arg) {
		foneticaNombre = arg;

	}

	public String getFoneticaNombre() {
		return foneticaNombre;
	}

	// foneticaSegundoNombre
	public void setFoneticaSegundoNombre(String arg) {
		foneticaSegundo = arg;

	}

	public String getFoneticaSegundoNombre() {
		return foneticaSegundo;
	}

	// foneticaApellido
	public void setFoneticaApellido(String arg) {
		foneticaApellido = arg;

	}

	public String getFoneticaApellido() {
		return foneticaApellido;
	}

	// apodo
	public void setApodo(String arg) {
		apodo = arg;

	}

	public String getApodo() {
		return apodo;
	}

	// archivarComo
	public void setArchivarComo(String arg) {
		archivarComo = arg;

	}

	public String getArchivarComo() {
		return archivarComo;
	}

	// empresa
	public void setEmpresa(String arg) {
		empresa = arg;

	}

	public String getEmpresa() {
		return empresa;
	}

	// cargo
	public void setCargo(String arg) {
		cargo = arg;

	}

	public String getCargo() {
		return cargo;
	}

	// departamento
	public void setDepartamento(String arg) {
		departamento = arg;

	}

	public String getDepartamento() {
		return departamento;
	}

	// correo
	public void setCorreo(String arg) {
		correo = arg;

	}

	public String getCorreo() {
		return correo;
	}

	// telefono
	public void setTelefono(int arg) {
		telefono = arg;

	}

	public int getTelefono() {
		return telefono;
	}

	// pais
	public void setPais(String arg) {
		pais = arg;

	}

	public String getPais() {
		return pais;
	}

	// direccion
	public void setDireccion(String arg) {
		direccion = arg;

	}

	public String getDireccion() {
		return direccion;
	}

	// direccion2
	public void setDireccion2(String arg) {
		direccion2 = arg;

	}

	public String getDireccion2() {
		return direccion2;
	}

	// codigoPostal
	public void setCodigo(String arg) {
		codigoPostal = arg;

	}

	public String getCodigo() {
		return codigoPostal;
	}

	// ciudad
	public void setCiudad(String arg) {
		ciudad = arg;

	}

	public String getCiudad() {
		return ciudad;
	}

	// provincia
	public void setProvincia(String arg) {
		provincia = arg;

	}

	public String getProvincia() {
		return provincia;
	}

	// apartadoPostal
	public void setApartado(String arg) {
		apartadoPostal = arg;

	}

	public String getApartado() {
		return apartadoPostal;
	}

	// etiqueta
	public void setEtiqueta(String arg) {
		etiqueta = arg;

	}

	public String getEtiqueta() {
		return etiqueta;
	}

	// nacimiento
	public void setNacimiento(String arg) {
		nacimiento = arg;

	}

	public String getNacimiento() {
		return nacimiento;
	}

	// eventos
	public void setEventos(String arg) {
		eventos = arg;

	}

	public String getEventos() {
		return eventos;
	}

	// web
	public void setWeb(String arg) {
		web = arg;

	}

	public String getWeb() {
		return web;
	}

	// relacion
	public void setRelacion(String arg) {
		relacion = arg;

	}

	public String getRelacion() {
		return relacion;
	}

	// chat
	public void setChat(String arg) {
		chat = arg;

	}

	public String getChat() {
		return chat;
	}

	// llamadaWeb
	public void setLlamada(String arg) {
		llamadaWeb = arg;

	}

	public String getLlamada() {
		return llamadaWeb;
	}

	// personalizado
	public void setPersonalizado(String arg) {
		personalizado = arg;

	}

	public String getPersonalizado() {
		return personalizado;
	}

	// notas
	public void setNotas(String arg) {
		notas = arg;

	}

	public String getNotas() {
		return notas;
	}

}
