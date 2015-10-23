package adote.com.amor.backend.api;

import static adote.com.amor.backend.api.util.Conversor.toRacaResponse;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import adote.com.amor.backend.api.response.RacaResponse;
import adote.com.amor.backend.domain.Raca;
import adote.com.amor.backend.repository.RacaRepository;

@RestController
public class RacaController {

	@Autowired
	private RacaRepository repository;

	@RequestMapping(value = "/racas", method = RequestMethod.GET, produces = "application/json")
	public List<RacaResponse> findAll() {

		List<Raca> list = (List<Raca>) repository.findAll();
		List<RacaResponse> result = new ArrayList<RacaResponse>();
		for (Raca item : list) {
			result.add(toRacaResponse(item));
		}
		return result;

	}

	@RequestMapping(value = "/racas/{id}", method = RequestMethod.GET, produces = "application/json")
	public RacaResponse findOne(@PathVariable Integer id) {

		Raca result = repository.findOne(id);
		return toRacaResponse(result);

	}

}
