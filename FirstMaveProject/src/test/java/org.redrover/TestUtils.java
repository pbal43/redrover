package org.redrover;

import org.apache.commons.lang3.StringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestUtils { // нет main, но можно запустить (есть в testNG)

    @Test // исп. testNG
    public void testSum() {
        Assert.assertEquals(Utils.sum(2, 4), 6, " 6 != 6");
    }

    @Test
    public void testAbbr() {
        Assert.assertEquals(StringUtils.abbreviate("Hello world!", 5), "Hello");
    }


}
