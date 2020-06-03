/*

 * Thu Apr 16 15:06:38 CEST 2020
 */

package org.xwiki.search.solr.internal.reference;

import org.junit.Test;

import static org.junit.Assert.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xwiki.search.solr.internal.reference.SolrEntityReferenceResolver;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class SolrEntityReferenceResolver_ESTest extends SolrEntityReferenceResolver_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test01() {
        SolrEntityReferenceResolver solrEntityReferenceResolver0 = new SolrEntityReferenceResolver();
        EntityType entityType0 = EntityType.ATTACHMENT;
        String string0 = "wiki";
        ExplicitStringEntityReferenceResolver explicitStringEntityReferenceResolver0 = new ExplicitStringEntityReferenceResolver();
        SolrDocument solrDocument0 = new SolrDocument();
        solrDocument0.put(string0, (Object) solrEntityReferenceResolver0);
        Object[] objectArray0 = null;
        solrEntityReferenceResolver0.resolve(solrDocument0, entityType0, objectArray0);
    }

    @Test(timeout = 4000)
    public void test01() {
        SolrEntityReferenceResolver solrEntityReferenceResolver0 = new SolrEntityReferenceResolver();
        SolrDocument solrDocument0 = new SolrDocument();
        String string0 = "wiki";
        ExplicitStringEntityReferenceResolver explicitStringEntityReferenceResolver0 = new ExplicitStringEntityReferenceResolver();
        solrDocument0.put(string0, (Object) explicitStringEntityReferenceResolver0);
        Object[] objectArray0 = null;
        EntityType entityType0 = EntityType.OBJECT_PROPERTY;
    }

    @Test(timeout = 4000)
    public void test01() {
        SolrEntityReferenceResolver solrEntityReferenceResolver0 = new SolrEntityReferenceResolver();
        SolrDocument solrDocument0 = new SolrDocument();
        EntityType entityType0 = EntityType.OBJECT;
        String string0 = "wiki";
        ExplicitStringEntityReferenceResolver explicitStringEntityReferenceResolver0 = new ExplicitStringEntityReferenceResolver();
        solrDocument0.put(string0, (Object) explicitStringEntityReferenceResolver0);
        Object[] objectArray0 = null;
        solrEntityReferenceResolver0.resolve(solrDocument0, entityType0, objectArray0);
    }

    @Test(timeout = 4000)
    public void test01() {
        SolrEntityReferenceResolver solrEntityReferenceResolver0 = new SolrEntityReferenceResolver();
        EntityType entityType0 = EntityType.ATTACHMENT;
        String string0 = "wiki";
        SolrDocument solrDocument0 = new SolrDocument();
        solrDocument0.put(string0, (Object) solrEntityReferenceResolver0);
        Object[] objectArray0 = null;
        solrEntityReferenceResolver0.resolve(solrDocument0, entityType0, objectArray0);
    }

    @Test(timeout = 4000)
    public void test01() {
        SolrEntityReferenceResolver solrEntityReferenceResolver0 = new SolrEntityReferenceResolver();
        String string0 = "wiki";
        ExplicitStringEntityReferenceResolver explicitStringEntityReferenceResolver0 = new ExplicitStringEntityReferenceResolver();
        SolrDocument solrDocument0 = new SolrDocument();
        solrDocument0.put(string0, (Object) explicitStringEntityReferenceResolver0);
        Object[] objectArray0 = null;
        EntityType entityType0 = EntityType.OBJECT;
        solrEntityReferenceResolver0.resolve(solrDocument0, entityType0, objectArray0);
    }

    @Test(timeout = 4000)
    public void test01() {
        SolrEntityReferenceResolver solrEntityReferenceResolver0 = new SolrEntityReferenceResolver();
        SolrDocument solrDocument0 = new SolrDocument();
        EntityType entityType0 = EntityType.DOCUMENT;
        String string0 = "wiki";
        ExplicitStringEntityReferenceResolver explicitStringEntityReferenceResolver0 = new ExplicitStringEntityReferenceResolver();
        solrDocument0.put(string0, (Object) explicitStringEntityReferenceResolver0);
        Object[] objectArray0 = null;
        solrEntityReferenceResolver0.resolve(solrDocument0, entityType0, objectArray0);
    }

    @Test(timeout = 4000)
    public void test01() {
        SolrEntityReferenceResolver solrEntityReferenceResolver0 = new SolrEntityReferenceResolver();
        SolrDocument solrDocument0 = new SolrDocument();
        EntityType entityType0 = EntityType.ATTACHMENT;
        String string0 = "wiki";
        ExplicitStringEntityReferenceResolver explicitStringEntityReferenceResolver0 = new ExplicitStringEntityReferenceResolver();
        solrDocument0.put(string0, (Object) explicitStringEntityReferenceResolver0);
        Object[] objectArray0 = null;
        solrEntityReferenceResolver0.resolve(solrDocument0, entityType0, objectArray0);
    }
}
