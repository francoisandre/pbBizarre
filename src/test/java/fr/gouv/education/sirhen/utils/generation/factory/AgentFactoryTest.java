package fr.gouv.education.sirhen.utils.generation.factory;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.gouv.education.sirhen.ct.commun.transverse.exception.FonctionnelleException;
import fr.gouv.education.sirhen.ct.commun.transverse.exception.TechniqueException;
import fr.gouv.education.sirhen.gin.gestionindividu.etatcivilexterne.mas.ws.client.types.ParametresCreationAgentExterne;
import fr.gouv.education.sirhen.gin.gestionindividu.etatcivilexterne.mas.ws.client.types.ResultatCreationAgentExterne;
import fr.gouv.education.sirhen.gin.gestionindividu.mas.ws.client.etatcivilexterneservice.IEtatCivilExterneService;

@ContextConfiguration(classes = TestConfiguration.class)
@RunWith(value = SpringJUnit4ClassRunner.class)
public class AgentFactoryTest {

	@Autowired
	IEtatCivilExterneService etatCivilExterne;

	@Test
	public void TestRecherche() throws TechniqueException, FonctionnelleException {
		ParametresCreationAgentExterne parametres1 = new ParametresCreationAgentExterne();
		parametres1.setCivilite("M");
		parametres1.setNomFamille("CELEREE");
		parametres1.setDateNaissance(new GregorianCalendar(1975, Calendar.JANUARY, 24));
		parametres1.setPrenom("JACQUES");

		List < ParametresCreationAgentExterne > aux = new ArrayList <>();
		aux.add(parametres1);
		List < ResultatCreationAgentExterne > creerAgents = etatCivilExterne.creerAgents(aux);
		System.out.println("coucou");

	}

}
