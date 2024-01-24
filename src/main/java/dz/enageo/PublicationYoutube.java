package dz.enageo;

import lombok.extern.slf4j.Slf4j;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

@Slf4j
public class PublicationYoutube implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
    
        log.info("Publication Youtube Ok.");
    }
}
