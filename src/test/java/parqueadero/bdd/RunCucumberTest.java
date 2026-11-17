package com.edu.parqueadero.bdd;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

/**
 * Ejecuta con Cucumber los escenarios de src/test/resources/features.
 * Los pasos se buscan en el paquete parqueadero.bdd.
 */
@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "parqueadero.bdd")
public class RunCucumberTest {
}
/** funciones y librerias que usa el lengujae
 * mvn test -Dtest='**/unitarias/*Test'    # unitarias + TDD (todo lo de unitarias/)
 * mvn test -Dtest=RunCucumberTest         # BDD (.feature + Steps)
 */
/**