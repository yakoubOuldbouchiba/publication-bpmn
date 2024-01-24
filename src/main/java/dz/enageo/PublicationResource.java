package dz.enageo;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublicationResource {
    
    
    private PublicationService publicationService;
    
    public PublicationResource(PublicationService publicationService) {
        this.publicationService = publicationService;
    }
    
    @GetMapping("/demarer-process/{business-key}")
    public ResponseEntity<String> demarerProcess(@PathVariable(name = "business-key") String business_key){
        publicationService.demarerProcess(business_key);
        return ResponseEntity.ok("Le process a démarré");
    }
    
    
    @GetMapping("/video-editer/{business-key}")
    public ResponseEntity<String> notifierVideoEditer(@PathVariable(name = "business-key") String business_key){
        publicationService.notifierVideoEditer(business_key);
        return ResponseEntity.ok("La notification a été envoyée");
    }
}
