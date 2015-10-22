package adote.com.amor.backend.api;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import adote.com.amor.backend.api.request.PorteRequest;
import adote.com.amor.backend.domain.Porte;
import adote.com.amor.backend.repository.PorteRepository;

@RestController
public class PorteController {

	@Autowired
	private PorteRepository repository;

	@RequestMapping(value = "/portes", method = RequestMethod.GET, produces = "application/json")
	public List<Porte> findAll() {

		return (List<Porte>) repository.findAll();

	}

	@RequestMapping(value = "/portes/{id}", method = RequestMethod.GET, produces = "application/json")
	public Porte findOne(@PathVariable Integer id) {

		Porte result = repository.findOne(id);
		return result;

	}

	@RequestMapping(value = "/portes", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public Porte create(@RequestBody PorteRequest request) {

		Porte entity = new Porte(request.getNome(), request.getDescricao());
		return repository.save(entity);

	}

	@RequestMapping(value = "/portes/{id}", method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
	public Porte update(@PathVariable Integer id, @RequestBody PorteRequest request) {

		Porte entity = new Porte(id, request.getNome(), request.getDescricao());
		return repository.save(entity);

	}

	@RequestMapping(value = "/portes/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable Integer id) {

		repository.delete(id);

	}
}
