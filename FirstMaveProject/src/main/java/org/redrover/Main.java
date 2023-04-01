package org.redrover;

import org.apache.commons.lang3.StringUtils;

public class Main {

    private static void testAbbr() { // тестирование функции ассертом, можно исп трай- уетчер (обработчик ошибок) - но он для другого
        if (!"He../.".equals(StringUtils.abbreviate("Hello world!", 5))) {
            System.out.println("bug");
        }

        }

    }

