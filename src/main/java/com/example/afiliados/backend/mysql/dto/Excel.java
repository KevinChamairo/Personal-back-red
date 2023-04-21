package com.example.afiliados.backend.mysql.dto;

public class Excel {

public Integer id;
	
	public String numero_dni_titular;
	public String tipo_rp_o_a;
	public String numero_dni_afiliado;
	public String apellido_paterno_afiliado;
	public String apellido_materno_afiliado;
	public String primer_nombre_afiliado;
	public String segundo_nombre_afiliado;
	public String fecha_de_nacimiento_afiliado;
	public String edad_afiliado;
	public String sexo_afiliado;
	public String estado_civil_afiliado;
	public String parentesco_afiliado;
	public String direccion_afiliado;
	public String telefono_afiliado;
	public String email_afiliado;
	public String prima_incl_igv;
	public String tipo_doc_afiliado;
	public String cert_num;
	public String codigo_plan;
	public String cert_estado;
	public String fech_ini_vig;
	public String fech_fin_vig;
	public String campo_cliente_id;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNumero_dni_titular() {
		return numero_dni_titular;
	}
	public void setNumero_dni_titular(String numero_dni_titular) {
		this.numero_dni_titular = numero_dni_titular;
	}
	public String getTipo_rp_o_a() {
		return tipo_rp_o_a;
	}
	public void setTipo_rp_o_a(String tipo_rp_o_a) {
		this.tipo_rp_o_a = tipo_rp_o_a;
	}
	public String getNumero_dni_afiliado() {
		return numero_dni_afiliado;
	}
	public void setNumero_dni_afiliado(String numero_dni_afiliado) {
		this.numero_dni_afiliado = numero_dni_afiliado;
	}
	public String getApellido_paterno_afiliado() {
		return apellido_paterno_afiliado;
	}
	public void setApellido_paterno_afiliado(String apellido_paterno_afiliado) {
		this.apellido_paterno_afiliado = apellido_paterno_afiliado;
	}
	public String getApellido_materno_afiliado() {
		return apellido_materno_afiliado;
	}
	public void setApellido_materno_afiliado(String apellido_materno_afiliado) {
		this.apellido_materno_afiliado = apellido_materno_afiliado;
	}
	public String getPrimer_nombre_afiliado() {
		return primer_nombre_afiliado;
	}
	public void setPrimer_nombre_afiliado(String primer_nombre_afiliado) {
		this.primer_nombre_afiliado = primer_nombre_afiliado;
	}
	public String getSegundo_nombre_afiliado() {
		return segundo_nombre_afiliado;
	}
	public void setSegundo_nombre_afiliado(String segundo_nombre_afiliado) {
		this.segundo_nombre_afiliado = segundo_nombre_afiliado;
	}
	public String getFecha_de_nacimiento_afiliado() {
		return fecha_de_nacimiento_afiliado;
	}
	public void setFecha_de_nacimiento_afiliado(String fecha_de_nacimiento_afiliado) {
		this.fecha_de_nacimiento_afiliado = fecha_de_nacimiento_afiliado;
	}
	public String getEdad_afiliado() {
		return edad_afiliado;
	}
	public void setEdad_afiliado(String edad_afiliado) {
		this.edad_afiliado = edad_afiliado;
	}
	public String getSexo_afiliado() {
		return sexo_afiliado;
	}
	public void setSexo_afiliado(String sexo_afiliado) {
		this.sexo_afiliado = sexo_afiliado;
	}
	public String getEstado_civil_afiliado() {
		return estado_civil_afiliado;
	}
	public void setEstado_civil_afiliado(String estado_civil_afiliado) {
		this.estado_civil_afiliado = estado_civil_afiliado;
	}
	public String getParentesco_afiliado() {
		return parentesco_afiliado;
	}
	public void setParentesco_afiliado(String parentesco_afiliado) {
		this.parentesco_afiliado = parentesco_afiliado;
	}
	public String getDireccion_afiliado() {
		return direccion_afiliado;
	}
	public void setDireccion_afiliado(String direccion_afiliado) {
		this.direccion_afiliado = direccion_afiliado;
	}
	public String getTelefono_afiliado() {
		return telefono_afiliado;
	}
	public void setTelefono_afiliado(String telefono_afiliado) {
		this.telefono_afiliado = telefono_afiliado;
	}
	public String getEmail_afiliado() {
		return email_afiliado;
	}
	public void setEmail_afiliado(String email_afiliado) {
		this.email_afiliado = email_afiliado;
	}
	public String getPrima_incl_igv() {
		return prima_incl_igv;
	}
	public void setPrima_incl_igv(String prima_incl_igv) {
		this.prima_incl_igv = prima_incl_igv;
	}
	public String getTipo_doc_afiliado() {
		return tipo_doc_afiliado;
	}
	public void setTipo_doc_afiliado(String tipo_doc_afiliado) {
		this.tipo_doc_afiliado = tipo_doc_afiliado;
	}
	public String getCert_num() {
		return cert_num;
	}
	public void setCert_num(String cert_num) {
		this.cert_num = cert_num;
	}
	public String getCodigo_plan() {
		return codigo_plan;
	}
	public void setCodigo_plan(String codigo_plan) {
		this.codigo_plan = codigo_plan;
	}
	public String getCert_estado() {
		return cert_estado;
	}
	public void setCert_estado(String cert_estado) {
		this.cert_estado = cert_estado;
	}
	public String getFech_ini_vig() {
		return fech_ini_vig;
	}
	public void setFech_ini_vig(String fech_ini_vig) {
		this.fech_ini_vig = fech_ini_vig;
	}
	public String getFech_fin_vig() {
		return fech_fin_vig;
	}
	public void setFech_fin_vig(String fech_fin_vig) {
		this.fech_fin_vig = fech_fin_vig;
	}
	public String getCampo_cliente_id() {
		return campo_cliente_id;
	}
	public void setCampo_cliente_id(String campo_cliente_id) {
		this.campo_cliente_id = campo_cliente_id;
	}
	@Override
	public String toString() {
		return "Excel [id=" + id + ", numero_dni_titular=" + numero_dni_titular + ", tipo_rp_o_a=" + tipo_rp_o_a
				+ ", numero_dni_afiliado=" + numero_dni_afiliado + ", apellido_paterno_afiliado="
				+ apellido_paterno_afiliado + ", apellido_materno_afiliado=" + apellido_materno_afiliado
				+ ", primer_nombre_afiliado=" + primer_nombre_afiliado + ", segundo_nombre_afiliado="
				+ segundo_nombre_afiliado + ", fecha_de_nacimiento_afiliado=" + fecha_de_nacimiento_afiliado
				+ ", edad_afiliado=" + edad_afiliado + ", sexo_afiliado=" + sexo_afiliado + ", estado_civil_afiliado="
				+ estado_civil_afiliado + ", parentesco_afiliado=" + parentesco_afiliado + ", direccion_afiliado="
				+ direccion_afiliado + ", telefono_afiliado=" + telefono_afiliado + ", email_afiliado=" + email_afiliado
				+ ", prima_incl_igv=" + prima_incl_igv + ", tipo_doc_afiliado=" + tipo_doc_afiliado + ", cert_num="
				+ cert_num + ", codigo_plan=" + codigo_plan + ", cert_estado=" + cert_estado + ", fech_ini_vig="
				+ fech_ini_vig + ", fech_fin_vig=" + fech_fin_vig + ", campo_cliente_id=" + campo_cliente_id + "]";
	}
	
	
}