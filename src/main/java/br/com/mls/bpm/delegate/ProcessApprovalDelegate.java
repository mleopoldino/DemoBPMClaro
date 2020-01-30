package br.com.mls.bpm.delegate;

import java.util.logging.Logger;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;


public class ProcessApprovalDelegate implements JavaDelegate {
	
	private final static Logger LOGGER = Logger.getLogger("ProcessApprovalDelegate");

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		// TODO Auto-generated method stub
		LOGGER.info("Processando a solicitação " + execution.getVariable("customerId") + "'...");
		System.out.println("Solicitação aprovada automaticamente pelo processo, Id da Tarefa: " + execution.getVariable("customerId"));
		
	}

}
