package adote.com.amor.backend.api;

import static adote.com.amor.backend.api.util.Conversor.toLocalizacaoResponse;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import adote.com.amor.backend.api.request.LocalizacaoRequest;
import adote.com.amor.backend.api.response.LocalizacaoResponse;
import adote.com.amor.backend.domain.Localizacao;
import adote.com.amor.backend.repository.LocalizacaoRepository;

@RestController
public class LocalizacaoController {

	@Autowired
	private LocalizacaoRepository repository;

	@RequestMapping(value = "/localizacoes", method = RequestMethod.GET, produces = "application/json")
	public List<LocalizacaoResponse> findAll() {

		List<Localizacao> list = (List<Localizacao>) repository.findAll();
		List<LocalizacaoResponse> result = new ArrayList<LocalizacaoResponse>();
		for (Localizacao item : list) {
			result.add(toLocalizacaoResponse(item));
		}
		return result;

	}

	@RequestMapping(value = "/localizacoes/{id}", method = RequestMethod.GET, produces = "application/json")
	public LocalizacaoResponse findOne(@PathVariable Integer id) {

		Localizacao result = repository.findOne(id);
		return toLocalizacaoResponse(result);

	}

	@RequestMapping(value = "/localizacoes", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public LocalizacaoResponse create(@RequestBody LocalizacaoRequest request) {

		Localizacao entity = new Localizacao(request.getCep(), request.getEndereco(), request.getPontoReferencia(), request.getLatitude(), request.getLongitude());
		return toLocalizacaoResponse(repository.save(entity));

	}

	@RequestMapping(value = "/localizacoes/{id}", method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
	public LocalizacaoResponse update(@PathVariable Integer id, @RequestBody LocalizacaoRequest request) {

		Localizacao entity = new Localizacao(id, request.getCep(), request.getEndereco(), request.getPontoReferencia(), request.getLatitude(), request.getLongitude());
		return toLocalizacaoResponse(repository.save(entity));

	}

	@RequestMapping(value = "/localizacoes/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable Integer id) {

		repository.delete(id);

	}
}
