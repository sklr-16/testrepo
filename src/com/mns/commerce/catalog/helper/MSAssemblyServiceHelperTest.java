package com.mns.commerce.catalog.helper;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import junit.framework.Assert;

@RunWith(PowerMockRunner.class)
@PrepareForTest({MSAssemblyServiceHelper.class})
public class MSAssemblyServiceHelperTest {

    private static final String CLASS_NAME = MSAssemblyServiceHelperTest.class.getName();


    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void generateRequestTokenWithTimeStampTest_start(){
        String token = MSAssemblyServiceHelper.generateRequestTokenWithTimeStamp("constant","START");
        Assert.assertTrue(token.startsWith("constant"));
    }
    
    @Test
    public void generateRequestTokenWithTimeStampTest_end(){
        String token = MSAssemblyServiceHelper.generateRequestTokenWithTimeStamp("constant","END");
        Assert.assertTrue(token.endsWith("constant"));
    }
    
    @Test
    public void generateRequestTokenWithTimeStampTest_invalid(){
        String token = MSAssemblyServiceHelper.generateRequestTokenWithTimeStamp("constant","ABC");
        Assert.assertTrue("".equals(token));
    }
    
    @Test
    public void addTwoNumbers_a(){
        int c = MSAssemblyServiceHelper.addTwoNumbers(5,2);
        Assert.assertEquals(3,c);
    }


}