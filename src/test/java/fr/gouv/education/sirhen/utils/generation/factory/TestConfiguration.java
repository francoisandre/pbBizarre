package fr.gouv.education.sirhen.utils.generation.factory;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource({"classpath*:spring/client-context.xml", "classpath*:spring/ct-annuaire-service-junit-context.xml" })
public class TestConfiguration {

}