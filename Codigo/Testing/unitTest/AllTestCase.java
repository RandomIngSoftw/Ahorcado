package unitTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestCaseVentanaMenuPrincipall.class, TestCaseBotonJuegoNormal.class, TestCaseBotonJuegoRelax.class,
	TestCaseAperturaDeObservadores.class, TestCaseBotonTop10.class, TestCaseModeloSingleton.class})
public class AllTestCase {

}
