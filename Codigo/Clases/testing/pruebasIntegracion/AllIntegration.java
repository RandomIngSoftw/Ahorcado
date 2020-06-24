package pruebasIntegracion;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ IntegracionBotonJuegoRelax.class, IntegracionBotonTop10.class, integracionBotonJuegoNormal.class,
	IntegracionBotonEstadistica.class})
public class AllIntegration {

}
