package org.arquillian.universe.test;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

//@Ignore("Only to compile api test")
@RunWith(Arquillian.class)
public class SimpleTestCase {

    @Deployment
    public static WebArchive test() {
        return ShrinkWrap.create(WebArchive.class);
    }

    @Test
    public void shouldX() {}
}
