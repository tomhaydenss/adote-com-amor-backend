package adote.com.amor.backend.api;

import static adote.com.amor.backend.api.util.Conversor.toEspecieResponse;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import adote.com.amor.backend.api.request.EspecieRequest;
import adote.com.amor.backend.api.response.EspecieResponse;
import adote.com.amor.backend.domain.Especie;
import adote.com.amor.backend.repository.EspecieRepository;

@RestController
public class EspecieController {

	@Autowired
	private EspecieRepository repository;

	@RequestMapping(value = "/especies", method = RequestMethod.GET, produces = "application/json")
	public List<EspecieResponse> findAll() {

		List<Especie> list = (List<Especie>) repository.findAll();
		List<EspecieResponse> result = new ArrayList<EspecieResponse>();
		for (Especie item : list) {
			result.add(toEspecieResponse(item));
		}
		return result;

	}

	@RequestMapping(value = "/especies/{id}", method = RequestMethod.GET, produces = "application/json")
	public EspecieResponse findOne(@PathVariable Integer id) {

		Especie result = repository.findOne(id);
		return toEspecieResponse(result);

	}

	@RequestMapping(value = "/especies", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public EspecieResponse create(@RequestBody EspecieRequest request) {

		Especie entity = new Especie(request.getNome());
		return toEspecieResponse(repository.save(entity));

	}

	@RequestMapping(value = "/especies/{id}", method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
	public EspecieResponse update(@PathVariable Integer id, @RequestBody EspecieRequest request) {

		Especie entity = new Especie(id, request.getNome());
		return toEspecieResponse(repository.save(entity));

	}

	@RequestMapping(value = "/especies/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable Integer id) {

		repository.delete(id);

	}
}
