package adote.com.amor.backend.api;

import static adote.com.amor.backend.api.util.Conversor.toPorteResponse;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import adote.com.amor.backend.api.request.PorteRequest;
import adote.com.amor.backend.api.response.PorteResponse;
import adote.com.amor.backend.domain.Porte;
import adote.com.amor.backend.repository.PorteRepository;

@RestController
public class PorteController {

	@Autowired
	private PorteRepository repository;

	@RequestMapping(value = "/portes", method = RequestMethod.GET, produces = "application/json")
	public List<PorteResponse> findAll() {

		List<Porte> list = (List<Porte>) repository.findAll();
		List<PorteResponse> result = new ArrayList<PorteResponse>();
		for (Porte item : list) {
			result.add(toPorteResponse(item));
		}
		return result;

	}

	@RequestMapping(value = "/portes/{id}", method = RequestMethod.GET, produces = "application/json")
	public PorteResponse findOne(@PathVariable Integer id) {

		Porte result = repository.findOne(id);
		return toPorteResponse(result);

	}

	@RequestMapping(value = "/portes", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public PorteResponse create(@RequestBody PorteRequest request) {

		Porte entity = new Porte(request.getNome(), request.getDescricao());
		return toPorteResponse(repository.save(entity));

	}

	@RequestMapping(value = "/portes/{id}", method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
	public PorteResponse update(@PathVariable Integer id, @RequestBody PorteRequest request) {

		Porte entity = new Porte(id, request.getNome(), request.getDescricao());
		return toPorteResponse(repository.save(entity));

	}

	@RequestMapping(value = "/portes/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable Integer id) {

		repository.delete(id);

	}
}
