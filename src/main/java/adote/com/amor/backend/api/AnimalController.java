package adote.com.amor.backend.api;

import static adote.com.amor.backend.api.util.Conversor.stringToDate;
import static adote.com.amor.backend.api.util.Conversor.toAnimalResponse;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import adote.com.amor.backend.api.request.AnimalRequest;
import adote.com.amor.backend.api.response.AnimalResponse;
import adote.com.amor.backend.domain.Animal;
import adote.com.amor.backend.domain.Proprietario;
import adote.com.amor.backend.domain.Raca;
import adote.com.amor.backend.repository.AnimalRepository;

@RestController
public class AnimalController {

	@Autowired
	private AnimalRepository repository;

	@RequestMapping(value = "/animais", method = RequestMethod.GET, produces = "application/json")
	public List<AnimalResponse> findAll() {

		List<Animal> list = (List<Animal>) repository.findAll();
		List<AnimalResponse> result = new ArrayList<AnimalResponse>();
		for (Animal item : list) {
			result.add(toAnimalResponse(item));
		}
		return result;

	}

	@RequestMapping(value = "/animais/{id}", method = RequestMethod.GET, produces = "application/json")
	public AnimalResponse findOne(@PathVariable String id) {

		Animal result = repository.findOne(id);
		return toAnimalResponse(result);

	}

	@RequestMapping(value = "/animais", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public AnimalResponse create(@RequestBody AnimalRequest request) {

		Animal entity = new Animal(request.getNome(), request.getSexo(), request.getDescricao(),
				stringToDate(request.getDataNascimento()), new Raca(request.getIdRaca()),
				new Proprietario(request.getIdProprietario()));
		return toAnimalResponse(repository.save(entity));

	}

	@RequestMapping(value = "/animais/{id}", method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
	public AnimalResponse update(@PathVariable String id, @RequestBody AnimalRequest request) {

		Animal entity = new Animal(id, request.getNome(), request.getSexo(), request.getDescricao(),
				stringToDate(request.getDataNascimento()), new Raca(request.getIdRaca()),
				new Proprietario(request.getIdProprietario()));
		return toAnimalResponse(repository.save(entity));

	}

	@RequestMapping(value = "/animais/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable String id) {

		repository.delete(id);

	}
}
