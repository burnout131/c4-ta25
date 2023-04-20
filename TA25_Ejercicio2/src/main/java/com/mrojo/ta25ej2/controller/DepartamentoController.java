/**
 * 
 */
package com.mrojo.ta25ej2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mrojo.ta25ej2.dto.Departamento;
import com.mrojo.ta25ej2.service.DepartamentoService;

/**
 * @author Marc
 *
 */
@RestController
@RequestMapping("/api")
public class DepartamentoController {

	@Autowired
	DepartamentoService departamentoService;

	@GetMapping("/departamentos")
	public List<Departamento> listDepartamentos() {
		return departamentoService.listDepartamentos();
	}

	@GetMapping("/departamentos/{id}")
	public Departamento departamentoById(@PathVariable(name = "id") Long id) {
		Departamento departamentoxID = new Departamento();

		departamentoxID = departamentoService.DepartamentoById(id);

		return departamentoxID;
	}

	@PostMapping("/departamentos")
	public Departamento saveDepartamento(@RequestBody Departamento departamento) {
		return departamentoService.saveDepartamento(departamento);
	}

	@PutMapping("/departamentos/{id}")
	public Departamento updateDepartamento(@PathVariable(name = "id") Long id, @RequestBody Departamento departamento) {
		Departamento selectedDepartamento = new Departamento(id, departamento.getNombre(),
				departamento.getPresupuesto());
		Departamento updatedDepartamento = new Departamento();

		updatedDepartamento = departamentoService.updateDepartamento(selectedDepartamento);
		return updatedDepartamento;
	}

	@DeleteMapping("/departamentos/{id}")
	public void deleteDepartamento(@PathVariable(name = "id") Long id) {
		departamentoService.deleteDepartamento(id);
	}
}
