package jira.shrinkres.reproducer;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.gradle.archive.importer.embedded.EmbeddedGradleImporter;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author <a href="mailto:mjobanek@redhat.com">Matous Jobanek</a>
 */
@RunWith(Arquillian.class)
public class ReproducerTest {

    @Deployment
    public static WebArchive createDeployment() {
        EmbeddedGradleImporter importer = ShrinkWrap.create(EmbeddedGradleImporter.class);
        WebArchive war = importer.forThisProjectDirectory().importBuildOutput().as(WebArchive.class);
        return war;
    }

    @Test
    public void test() {
        System.err.println("all OK");
    }
}
