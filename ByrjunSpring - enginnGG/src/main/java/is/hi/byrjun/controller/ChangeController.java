package is.hi.byrjun.controller;

import is.hi.byrjun.model.Banquet;
import is.hi.byrjun.model.BanquetBookings;
import is.hi.byrjun.model.SportVenues;
import is.hi.byrjun.model.SportVenuesBookings;
import is.hi.byrjun.repository.BanquetRepository;
import is.hi.byrjun.repository.BanquetRepositoryImp;
import is.hi.byrjun.repository.SportVenuesRepositoryImp;
import is.hi.byrjun.services.SearchService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


/**
 *
 * @author Pétur Logi Pétursson
 * @date september 2017
 * HBV501G Hugbúnaðarverkefni 1
 * Háskóli Íslands
 * 
 * Tekur við skipunum frá vefviðmóti til að leita af veislusölum og birta 
 * leitarniðurstöðurnar.
 * 
 */

@Controller
@RequestMapping("/demo") //Request Mapping er gerd fyrir klasann til ad slidinn byrji a /demo fyrir allar skipanir.
public class ChangeController {

	// Tenging yfir í þjónustu klasa fyrir Search aðgerðina
	@Autowired
	SearchService searchService;
	
	@RequestMapping(value = "/innskra")
	public String skraning() {
		return "demo/authenticate";
	}
	
	@RequestMapping(value = "/verify")
	public String stadfesta(@RequestParam(value = "myradio", required = true)int chosen,
							@RequestParam(value = "id", required = true)int id,
							@RequestParam(value = "key", required = true)String key, Model model) {
		if (chosen == 1) {
			Banquet result = searchService.verifyBanquet(id, key);
			model.addAttribute("banquet", result);
			return "demo/breytaSal";
		} else {
			SportVenues result = searchService.verifySport(id, key);
			return "demo/breytaSal";
		}
	}
	
	@RequestMapping(value = "/eydaSal", method = RequestMethod.POST)
	public String remove(@RequestParam(value = "id")int id) {
		searchService.removeBanquet(id);
		return "demo/salEytt";
	}
}
