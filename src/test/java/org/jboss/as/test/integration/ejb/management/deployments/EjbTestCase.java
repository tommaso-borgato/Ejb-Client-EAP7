package org.jboss.as.test.integration.ejb.management.deployments;

import org.junit.Ignore;
import org.junit.Test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.Hashtable;

/*

14:58:12,298 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ManagedStatelessBean' in deployment unit 'deployment "ejb-management.jar"' are as follows:

	java:global/ejb-management/ManagedStatelessBean!org.jboss.as.test.integration.ejb.management.deployments.BusinessInterface
	java:app/ejb-management/ManagedStatelessBean!org.jboss.as.test.integration.ejb.management.deployments.BusinessInterface
	java:module/ManagedStatelessBean!org.jboss.as.test.integration.ejb.management.deployments.BusinessInterface
	java:jboss/exported/ejb-management/ManagedStatelessBean!org.jboss.as.test.integration.ejb.management.deployments.BusinessInterface
	ejb:/ejb-management/ManagedStatelessBean!org.jboss.as.test.integration.ejb.management.deployments.BusinessInterface
	java:global/ejb-management/ManagedStatelessBean!org.jboss.as.test.integration.ejb.management.deployments.ManagedStatelessBean
	java:app/ejb-management/ManagedStatelessBean!org.jboss.as.test.integration.ejb.management.deployments.ManagedStatelessBean
	java:module/ManagedStatelessBean!org.jboss.as.test.integration.ejb.management.deployments.ManagedStatelessBean

14:58:12,298 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ManagedStatefulBean' in deployment unit 'deployment "ejb-management.jar"' are as follows:

	java:global/ejb-management/ManagedStatefulBean!org.jboss.as.test.integration.ejb.management.deployments.BusinessInterface
	java:app/ejb-management/ManagedStatefulBean!org.jboss.as.test.integration.ejb.management.deployments.BusinessInterface
	java:module/ManagedStatefulBean!org.jboss.as.test.integration.ejb.management.deployments.BusinessInterface
	java:jboss/exported/ejb-management/ManagedStatefulBean!org.jboss.as.test.integration.ejb.management.deployments.BusinessInterface
	ejb:/ejb-management/ManagedStatefulBean!org.jboss.as.test.integration.ejb.management.deployments.BusinessInterface?stateful
	java:global/ejb-management/ManagedStatefulBean!org.jboss.as.test.integration.ejb.management.deployments.ManagedStatefulBean
	java:app/ejb-management/ManagedStatefulBean!org.jboss.as.test.integration.ejb.management.deployments.ManagedStatefulBean
	java:module/ManagedStatefulBean!org.jboss.as.test.integration.ejb.management.deployments.ManagedStatefulBean

14:58:12,298 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ManagedStatefulBean2' in deployment unit 'deployment "ejb-management.jar"' are as follows:

	java:global/ejb-management/ManagedStatefulBean2!org.jboss.as.test.integration.ejb.management.deployments.BusinessInterface
	java:app/ejb-management/ManagedStatefulBean2!org.jboss.as.test.integration.ejb.management.deployments.BusinessInterface
	java:module/ManagedStatefulBean2!org.jboss.as.test.integration.ejb.management.deployments.BusinessInterface
	java:jboss/exported/ejb-management/ManagedStatefulBean2!org.jboss.as.test.integration.ejb.management.deployments.BusinessInterface
	ejb:/ejb-management/ManagedStatefulBean2!org.jboss.as.test.integration.ejb.management.deployments.BusinessInterface?stateful
	java:global/ejb-management/ManagedStatefulBean2!org.jboss.as.test.integration.ejb.management.deployments.ManagedStatefulBean2
	java:app/ejb-management/ManagedStatefulBean2!org.jboss.as.test.integration.ejb.management.deployments.ManagedStatefulBean2
	java:module/ManagedStatefulBean2!org.jboss.as.test.integration.ejb.management.deployments.ManagedStatefulBean2

14:58:12,298 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'NoTimerSingletonBean' in deployment unit 'deployment "ejb-management.jar"' are as follows:

	java:global/ejb-management/NoTimerSingletonBean!org.jboss.as.test.integration.ejb.management.deployments.BusinessInterface
	java:app/ejb-management/NoTimerSingletonBean!org.jboss.as.test.integration.ejb.management.deployments.BusinessInterface
	java:module/NoTimerSingletonBean!org.jboss.as.test.integration.ejb.management.deployments.BusinessInterface
	java:jboss/exported/ejb-management/NoTimerSingletonBean!org.jboss.as.test.integration.ejb.management.deployments.BusinessInterface
	ejb:/ejb-management/NoTimerSingletonBean!org.jboss.as.test.integration.ejb.management.deployments.BusinessInterface
	java:global/ejb-management/NoTimerSingletonBean!org.jboss.as.test.integration.ejb.management.deployments.NoTimerSingletonBean
	java:app/ejb-management/NoTimerSingletonBean!org.jboss.as.test.integration.ejb.management.deployments.NoTimerSingletonBean
	java:module/NoTimerSingletonBean!org.jboss.as.test.integration.ejb.management.deployments.NoTimerSingletonBean

14:58:12,298 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'ManagedSingletonBean' in deployment unit 'deployment "ejb-management.jar"' are as follows:

	java:global/ejb-management/ManagedSingletonBean!org.jboss.as.test.integration.ejb.management.deployments.ManagedSingletonBean
	java:app/ejb-management/ManagedSingletonBean!org.jboss.as.test.integration.ejb.management.deployments.ManagedSingletonBean
	java:module/ManagedSingletonBean!org.jboss.as.test.integration.ejb.management.deployments.ManagedSingletonBean
	java:global/ejb-management/ManagedSingletonBean!org.jboss.as.test.integration.ejb.management.deployments.BusinessInterface
	java:app/ejb-management/ManagedSingletonBean!org.jboss.as.test.integration.ejb.management.deployments.BusinessInterface
	java:module/ManagedSingletonBean!org.jboss.as.test.integration.ejb.management.deployments.BusinessInterface
	java:jboss/exported/ejb-management/ManagedSingletonBean!org.jboss.as.test.integration.ejb.management.deployments.BusinessInterface
	ejb:/ejb-management/ManagedSingletonBean!org.jboss.as.test.integration.ejb.management.deployments.BusinessInterface

14:58:12,299 INFO  [org.jboss.as.ejb3.deployment] (MSC service thread 1-2) WFLYEJB0473: JNDI bindings for session bean named 'NoTimerStatelessBean' in deployment unit 'deployment "ejb-management.jar"' are as follows:

	java:global/ejb-management/NoTimerStatelessBean!org.jboss.as.test.integration.ejb.management.deployments.NoTimerStatelessBean
	java:app/ejb-management/NoTimerStatelessBean!org.jboss.as.test.integration.ejb.management.deployments.NoTimerStatelessBean
	java:module/NoTimerStatelessBean!org.jboss.as.test.integration.ejb.management.deployments.NoTimerStatelessBean
	java:global/ejb-management/NoTimerStatelessBean!org.jboss.as.test.integration.ejb.management.deployments.BusinessInterface
	java:app/ejb-management/NoTimerStatelessBean!org.jboss.as.test.integration.ejb.management.deployments.BusinessInterface
	java:module/NoTimerStatelessBean!org.jboss.as.test.integration.ejb.management.deployments.BusinessInterface
	java:jboss/exported/ejb-management/NoTimerStatelessBean!org.jboss.as.test.integration.ejb.management.deployments.BusinessInterface
	ejb:/ejb-management/NoTimerStatelessBean!org.jboss.as.test.integration.ejb.management.deployments.BusinessInterface

 */
public class EjbTestCase {

    private BusinessInterface lookupEjb(String ejbLookupStr) throws NamingException {
        final Hashtable jndiProperties = new Hashtable();
        //jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY,  "org.wildfly.naming.client.WildFlyInitialContextFactory");
        jndiProperties.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
        jndiProperties.put(Context.PROVIDER_URL,"http-remoting://localhost:8080");
        final Context ctx = new InitialContext(jndiProperties);
        return (BusinessInterface) ctx.lookup(ejbLookupStr);
    }

    @Test
    public void lookupManagedStatelessBean() throws NamingException {
        BusinessInterface businessInterface = lookupEjb("ejb:/ejb-management/ManagedStatelessBean!org.jboss.as.test.integration.ejb.management.deployments.BusinessInterface");
        System.out.println("BEFORE");
        businessInterface.doIt();
        System.out.println("AFTER");
    }

    @Test
    public void lookupManagedStatefulBean() throws NamingException {
        BusinessInterface businessInterface = lookupEjb("ejb:/ejb-management/ManagedStatefulBean!org.jboss.as.test.integration.ejb.management.deployments.BusinessInterface?stateful");
        System.out.println("BEFORE");
        businessInterface.doIt();
        System.out.println("AFTER");
    }

    @Test
    public void lookupManagedStatefulBean2() throws NamingException {
        BusinessInterface businessInterface = lookupEjb("ejb:/ejb-management/ManagedStatefulBean2!org.jboss.as.test.integration.ejb.management.deployments.BusinessInterface?stateful");
        System.out.println("BEFORE");
        businessInterface.doIt();
        System.out.println("AFTER");
    }

    @Test
    public void lookupNoTimerSingletonBean() throws NamingException {
        BusinessInterface businessInterface = lookupEjb("ejb:/ejb-management/NoTimerSingletonBean!org.jboss.as.test.integration.ejb.management.deployments.BusinessInterface");
        System.out.println("BEFORE");
        businessInterface.doIt();
        System.out.println("AFTER");
    }

    @Test
    public void lookupManagedSingletonBean() throws NamingException {
        BusinessInterface businessInterface = lookupEjb("ejb:/ejb-management/ManagedSingletonBean!org.jboss.as.test.integration.ejb.management.deployments.BusinessInterface");
        System.out.println("BEFORE");
        businessInterface.doIt();
        System.out.println("AFTER");
    }

    @Test
    public void lookupNoTimerStatelessBean() throws NamingException {
        BusinessInterface businessInterface = lookupEjb("ejb:/ejb-management/NoTimerStatelessBean!org.jboss.as.test.integration.ejb.management.deployments.BusinessInterface");
        System.out.println("BEFORE");
        businessInterface.doIt();
        System.out.println("AFTER");
    }
}
