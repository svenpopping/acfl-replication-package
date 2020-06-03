/*

 * Thu Apr 16 14:48:59 CEST 2020
 */

package org.xwiki.search.solr.internal.reference;

import org.junit.Test;

import static org.junit.Assert.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

public class SolrEntityReferenceResolver_ESTest {

    @Test(timeout = 4000)
    public void test01() {
        SolrEntityReferenceResolver solrEntityReferenceResolver0 = new SolrEntityReferenceResolver();
        SolrDocument solrDocument0 = new SolrDocument();
        String string0 = "wiki";
        int int0 = (-1);
        Integer integer0 = new Integer(int0);
        solrDocument0.addField(string0, integer0);
        EntityType entityType0 = EntityType.DOCUMENT;
        Object[] objectArray0 = new Object[2];
        solrEntityReferenceResolver0.resolve(solrDocument0, entityType0, objectArray0);
    }

    @Test(timeout = 4000)
    public void test02() {
        Detect a new crash reproducing test
        case :
        SolrEntityReferenceResolver solrEntityReferenceResolver0 = new SolrEntityReferenceResolver();
        SolrDocument solrDocument0 = new SolrDocument();
        String string0 = "wiki";
        int int0 = (-1);
        Integer integer0 = new Integer(int0);
        solrDocument0.addField(string0, integer0);
        EntityType entityType0 = EntityType.DOCUMENT;
        Object[] objectArray0 = null;
        solrEntityReferenceResolver0.resolve(solrDocument0, entityType0, objectArray0);
    }

    @Test(timeout = 4000)
    public void test03() {
        SolrEntityReferenceResolver solrEntityReferenceResolver0 = new SolrEntityReferenceResolver();
        SolrDocument solrDocument0 = new SolrDocument();
        String string0 = "wiki";
        int int0 = (-1);
        Integer integer0 = new Integer(int0);
        solrDocument0.addField(string0, integer0);
        Object[] objectArray0 = new Object[2];
        EntityType entityType0 = EntityType.OBJECT_PROPERTY;
        solrEntityReferenceResolver0.resolve(solrDocument0, entityType0, objectArray0);
    }

    @Test(timeout = 4000)
    public void test04() {
        SolrEntityReferenceResolver solrEntityReferenceResolver0 = new SolrEntityReferenceResolver();
        SolrDocument solrDocument0 = new SolrDocument();
        String string0 = "wiki";
        int int0 = (-1);
        Integer integer0 = new Integer(int0);
        solrDocument0.addField(string0, integer0);
        EntityType entityType0 = EntityType.DOCUMENT;
        Object[] objectArray0 = new Object[5];
        solrEntityReferenceResolver0.resolve(solrDocument0, entityType0, objectArray0);
    }

    @Test(timeout = 4000)
    public void test05() {
        SolrEntityReferenceResolver solrEntityReferenceResolver0 = new SolrEntityReferenceResolver();
        SolrDocument solrDocument0 = new SolrDocument();
        String string0 = "wiki";
        int int0 = (-1);
        Integer integer0 = new Integer(int0);
        solrDocument0.addField(string0, integer0);
        EntityType entityType0 = EntityType.DOCUMENT;
        Object[] objectArray0 = new Object[1];
        solrEntityReferenceResolver0.resolve(solrDocument0, entityType0, objectArray0);
    }

    @Test(timeout = 4000)
    public void test06() {
        SolrEntityReferenceResolver solrEntityReferenceResolver0 = new SolrEntityReferenceResolver();
        SolrDocument solrDocument0 = new SolrDocument();
        String string0 = "wiki";
        int int0 = (-1);
        Integer integer0 = new Integer(int0);
        solrDocument0.addField(string0, integer0);
        EntityType entityType0 = EntityType.DOCUMENT;
        Object[] objectArray0 = new Object[0];
        solrEntityReferenceResolver0.resolve(solrDocument0, entityType0, objectArray0);
    }

    @Test(timeout = 4000)
    public void test07() {
        SolrEntityReferenceResolver solrEntityReferenceResolver0 = new SolrEntityReferenceResolver();
        SolrDocument solrDocument0 = new SolrDocument();
        String string0 = "wiki";
        int int0 = (-1);
        Integer integer0 = new Integer(int0);
        solrDocument0.addField(string0, integer0);
        EntityType entityType0 = EntityType.OBJECT_PROPERTY;
        Object[] objectArray0 = null;
        solrEntityReferenceResolver0.resolve(solrDocument0, entityType0, objectArray0);
    }
}
