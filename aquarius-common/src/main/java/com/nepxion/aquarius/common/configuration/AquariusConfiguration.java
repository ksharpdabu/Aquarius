package com.nepxion.aquarius.common.configuration;

/**
 * <p>Title: Nepxion Aquarius</p>
 * <p>Description: Nepxion Aquarius</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @version 1.0
 */

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.nepxion.aquarius.common.context" })
public class AquariusConfiguration {
    static {
        String logoShown = System.getProperty("nepxion.logo.shown", "true");
        if (Boolean.valueOf(logoShown)) {
            System.out.println("");
            System.out.println("╔═══╗");
            System.out.println("║╔═╗║");
            System.out.println("║║ ║╠══╦╗╔╦══╦═╦╦╗╔╦══╗");
            System.out.println("║╚═╝║╔╗║║║║╔╗║╔╬╣║║║══╣");
            System.out.println("║╔═╗║╚╝║╚╝║╔╗║║║║╚╝╠══║");
            System.out.println("╚╝ ╚╩═╗╠══╩╝╚╩╝╚╩══╩══╝");
            System.out.println("      ║║");
            System.out.println("      ╚╝");
            System.out.println("Nepxion Aquarius  v2.0.8");
            System.out.println("");
        }
    }
}