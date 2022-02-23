package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Empleado;

public interface IEmpleadoService {
	
	public List<Empleado> listarEmpleados();
	
	public Empleado guardarEmpleado(Empleado empleado);
	
	public Empleado empleadoXID(Long id);
	
	public List<Empleado> listarEmpleadoNombre(String nombre);
	
	public Empleado actualizarEmpleado(Empleado empleado);
	
	public void eliminarEmpleado(Long id);

}
