package adote.com.amor.backend.api.util;

import adote.com.amor.backend.api.response.EspecieResponse;
import adote.com.amor.backend.api.response.PorteResponse;
import adote.com.amor.backend.api.response.RacaResponse;
import adote.com.amor.backend.domain.Especie;
import adote.com.amor.backend.domain.Porte;
import adote.com.amor.backend.domain.Raca;

public class Conversor {

	public static EspecieResponse toEspecieResponse(Especie e) {
		return new EspecieResponse(e.getId(), e.getNome());
	}

	public static PorteResponse toPorteResponse(Porte p) {
		return new PorteResponse(p.getId(), p.getNome(), p.getDescricao());
	}

	public static RacaResponse toRacaResponse(Raca r) {
		return new RacaResponse(r.getId(), r.getNome(), toEspecieResponse(r.getEspecie()),
				toPorteResponse(r.getPorte()));
	}

}
