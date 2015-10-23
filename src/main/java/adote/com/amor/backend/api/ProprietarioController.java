package adote.com.amor.backend.api;

import static adote.com.amor.backend.api.util.Conversor.toProprietarioResponse;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import adote.com.amor.backend.api.request.LocalizacaoRequest;
import adote.com.amor.backend.api.request.ProprietarioRequest;
import adote.com.amor.backend.api.response.LocalizacaoResponse;
import adote.com.amor.backend.api.response.ProprietarioResponse;
import adote.com.amor.backend.domain.Localizacao;
import adote.com.amor.backend.domain.Proprietario;
import adote.com.amor.backend.repository.ProprietarioRepository;

@RestController
public class ProprietarioController {

	@Autowired
	private ProprietarioRepository repository;

	@RequestMapping(value = "/proprietarios", method = RequestMethod.GET, produces = "application/json")
	public List<ProprietarioResponse> findAll() {

		List<Proprietario> list = (List<Proprietario>) repository.findAll();
		List<ProprietarioResponse> result = new ArrayList<ProprietarioResponse>();
		for (Proprietario item : list) {
			result.add(toProprietarioResponse(item));
		}
		return result;

	}

	@RequestMapping(value = "/proprietarios/{id}", method = RequestMethod.GET, produces = "application/json")
	public ProprietarioResponse findOne(@PathVariable Integer id) {

		Proprietario result = repository.findOne(id);
		return toProprietarioResponse(result);

	}

	@RequestMapping(value = "/proprietarios", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public ProprietarioResponse create(@RequestBody ProprietarioRequest request) {

		Proprietario entity = new Proprietario(request.getNome(), request.getEmail(), request.getTelefone(),
				new Localizacao(request.getIdLocalizacao()));
		return toProprietarioResponse(repository.save(entity));

	}

	@RequestMapping(value = "/proprietarios/{id}", method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
	public ProprietarioResponse update(@PathVariable Integer id, @RequestBody ProprietarioRequest request) {

		Proprietario entity = new Proprietario(id, request.getNome(), request.getEmail(), request.getTelefone(),
				new Localizacao(request.getIdLocalizacao()));
		return toProprietarioResponse(repository.save(entity));

	}

	@RequestMapping(value = "/proprietarios/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable Integer id) {

		repository.delete(id);

	}
}
