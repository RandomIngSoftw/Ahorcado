package unitTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestCaseAperturaDeObservadores.class, TestCaseBotonJuegoNormal.class, TestCaseBotonJuegoRelax.class,
		TestCaseBotonTop10.class, TestCaseVentanaMenuPrincipal.class })
public class AllTests {

}
