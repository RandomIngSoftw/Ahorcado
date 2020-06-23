package pruebasIntegracion;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ IntegracionBotonEstadistica.class, IntegracionBotonJuegoNormal.class, IntegracionBotonJuegoRelax.class,
		IntegracionTop10.class })
public class AllTests {

}
