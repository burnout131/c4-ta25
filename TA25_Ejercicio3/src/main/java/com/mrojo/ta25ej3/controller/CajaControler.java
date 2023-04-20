/**
 * 
 */
package com.mrojo.ta25ej3.controller;

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

import com.mrojo.ta25ej3.dto.Caja;
import com.mrojo.ta25ej3.service.CajaService;

/**
 * @author Marc
 *
 */
@RestController
@RequestMapping("/api")
public class CajaControler {
	
	@Autowired
	CajaService cajaService;

	@GetMapping("/cajas")
	public List<Caja> listCajas() {
		return cajaService.listCajas();
	}

	@GetMapping("/cajas/{id}")
	public Caja cajaById(@PathVariable(name = "id") Long id) {
		Caja cajaById = new Caja();
		cajaById = cajaService.CajaById(id);
		return cajaById;
	}

	@PostMapping("/cajas")
	public Caja saveCaja(@RequestBody Caja caja) {
		return cajaService.saveCaja(caja);
	}

	@PutMapping("/cajas/{id}")
	public Caja updateCaja(@PathVariable(name = "id") Long id, @RequestBody Caja caja) {
		Caja caja_Selected = new Caja(id, caja.getContenido(), caja.getValor(),caja.getAlmacen());
		Caja caja_Updated = new Caja();

		caja_Updated = cajaService.updateCaja(caja_Selected);

		return caja_Updated;
	}

	@DeleteMapping("/cajas/{id}")
	public void deleteCaja(@PathVariable(name = "id") Long id) {
		cajaService.deleteCaja(id);
	}
}
