package adote.com.amor.backend.api.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import adote.com.amor.backend.api.response.AnimalResponse;
import adote.com.amor.backend.api.response.EspecieResponse;
import adote.com.amor.backend.api.response.LocalizacaoResponse;
import adote.com.amor.backend.api.response.PorteResponse;
import adote.com.amor.backend.api.response.ProprietarioResponse;
import adote.com.amor.backend.api.response.RacaResponse;
import adote.com.amor.backend.domain.Animal;
import adote.com.amor.backend.domain.Especie;
import adote.com.amor.backend.domain.Localizacao;
import adote.com.amor.backend.domain.Porte;
import adote.com.amor.backend.domain.Proprietario;
import adote.com.amor.backend.domain.Raca;

public class Conversor {

	private static DateFormat dateTimeFormatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private static DateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy");

	public static LocalizacaoResponse toLocalizacaoResponse(Localizacao l) {
		return new LocalizacaoResponse(l.getId(), l.getCep(), l.getEndereco(), l.getPontoReferencia(), l.getLatitude(),
				l.getLongitude());
	}

	public static ProprietarioResponse toProprietarioResponse(Proprietario p) {
		return new ProprietarioResponse(p.getId(), p.getNome(), p.getEmail(), p.getTelefone(),
				toLocalizacaoResponse(p.getLocalizacao()));
	}

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

	public static AnimalResponse toAnimalResponse(Animal a) {
		return new AnimalResponse(a.getId(), a.getNome(), a.getSexo(), a.getDescricao(), dateToString(a.getDataNascimento()),
				dateTimeToString(a.getDataCadastro()), toRacaResponse(a.getRaca()), toProprietarioResponse(a.getProprietario()));
	}

	public static String dateToString(Date date) {
		return dateFormatter.format(date);
	}

	public static String dateTimeToString(Date dateTime) {
		return dateTimeFormatter.format(dateTime);
	}

	public static Date stringToDate(String str) {
		try {
			return dateFormatter.parse(str);
		} catch (ParseException e) {
			return new Date();
		}
	}

}
