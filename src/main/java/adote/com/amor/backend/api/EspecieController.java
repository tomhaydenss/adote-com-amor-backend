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

import adote.com.amor.backend.api.request.EspecieRequest;
import adote.com.amor.backend.domain.Especie;
import adote.com.amor.backend.repository.EspecieRepository;

@RestController
public class EspecieController {
	private static final Logger logger = LoggerFactory.getLogger(EspecieController.class);

	@Autowired
	private EspecieRepository repository;

	@RequestMapping(value = "/especies", method = RequestMethod.GET, produces = "application/json")
	public List<Especie> findAll() {

		return (List<Especie>) repository.findAll();

	}

	@RequestMapping(value = "/especies/{id}", method = RequestMethod.GET, produces = "application/json")
	public Especie findOne(@PathVariable Integer id) {

		Especie result = repository.findOne(id);
		return result;

	}

	@RequestMapping(value = "/especies", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public Especie create(@RequestBody EspecieRequest request) {

		Especie entity = new Especie(request.getNome());
		return repository.save(entity);

	}

	@RequestMapping(value = "/especies/{id}", method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
	public Especie update(@PathVariable Integer id, @RequestBody EspecieRequest request) {

		Especie entity = new Especie(id, request.getNome());
		return repository.save(entity);

	}

	@RequestMapping(value = "/especies/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable Integer id) {

		repository.delete(id);

	}
}
