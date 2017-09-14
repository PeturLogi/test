package is.hi.byrjun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Vilhjalmur Jonsson vij7@hi.is
 * 
 * Byrjunarcontroller sem styrir hvad er gert thegar notandi eda vidmot
 * setur inn skipun 
 */

@Controller
@RequestMapping("/demo") // Request Mapping er gerð fyrir klasann til að slóðin byrji á /demo fyrir allar skipanir 
public class DemoController {

	/**
	 * Þetta var adeins til að syna nemendum hvernig thetta virkar
	 * sja skjolun frá Ebbu
	 * 
	 *
	 */
	
    // Þar sem klasinn hefur slóðina "/demo", er þessi slóð "/demo/page"
    @RequestMapping("/page")
    public String demoPage(){
        return "demo/demo"; // skilar .jsp skrá sem er /webapp/WEB-INF/vefvidmot/demo/demo.jsp
                            // skoðið application.properties til að sjá hvernig slóðin er sett
    }
    
    /**
     * spyr hvad notandinn heitir
     * 
     * @return
     */
    
    @RequestMapping("/spyrjaNotanda")
    public String spyrjaNotandi () {
    	return "demo/hvadaNotandi";
    }
    
    /**
     * Tekur vid nafni fra notanda og birtir Godan daginn nafn
     * @param nafn Nafn a notanda
     * @param model Model med attributum
     * 
     * @return
     */
    
    @RequestMapping(value="/hver", method=RequestMethod.POST)
    public String hver(@RequestParam(value="nafn", required=false)
    		String nafn, ModelMap model) {
    	model.addAttribute("nafn", nafn);
    	return "demo/synaNotandi";
    }

}
