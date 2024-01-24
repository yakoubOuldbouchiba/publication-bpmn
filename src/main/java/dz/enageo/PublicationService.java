package dz.enageo;

import org.camunda.bpm.engine.ProcessEngine;
import org.springframework.stereotype.Service;

@Service
public class PublicationService {
    
    private final ProcessEngine processEngine;
    
    public PublicationService(ProcessEngine processEngine) {
        this.processEngine = processEngine;
    }
    
    
    public void demarerProcess(String business_key){
        processEngine.getRuntimeService()
                .startProcessInstanceByMessage("NouvelleIdee" , business_key);
    
    }
    
    public void notifierVideoEditer(String business_key){
        processEngine.getRuntimeService()
                .correlateMessage("videoEditer" , business_key);
        
    }
}
