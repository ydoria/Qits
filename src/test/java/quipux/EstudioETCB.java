package quipux;


import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;
import quipux.utilidades.BeforeSuite;
import quipux.utilidades.DataToFeature;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;

@CucumberOptions (//features = "src/test/resources/feature/SOI/PA/CONSULTA_COTIZANTES", tags = {"@Escenario_33"}, monochrome= true, snippets= SnippetType.CAMELCASE)
		        // features = "src/test/resources/features/Proyecto/ProyectoTI.feature", monochrome= true, snippets= SnippetType.CAMELCASE)
		 features = "src/test/resources/features/Qits/Forms/EstudioTitulos.feature", tags = {"@EstudioTitulosConBien"}, snippets= SnippetType.CAMELCASE)
@RunWith(RunnerPersonalizado.class)
public class EstudioETCB {
	@BeforeSuite
	public static void test() throws InvalidFormatException, IOException {
			DataToFeature.overrideFeatureFiles("src/test/resources/features/Qits/Forms/EstudioTitulos.feature");
	}
}
