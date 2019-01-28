package com.pulsebeat_02.kingmammoth.errors;

import net.minecraft.client.main.Main;

public class ScanMainRunning {
	
    public static void main(String[] args) throws Exception {
    	
        java.lang.reflect.Method m = ClassLoader.class.getDeclaredMethod("net.minecraft.client.main.Main;", new Class[] { String.class });
        m.setAccessible(true);
        ClassLoader cl = ClassLoader.getSystemClassLoader();
        Object test1 = m.invoke(cl, "TestLoaded$ClassToTest");
        System.out.println(test1 != null);
        ClassToTest.reportLoaded();
        Object test2 = m.invoke(cl, "TestLoaded$ClassToTest");
        System.out.println(test2 != null);
        
   }
   
   static class ClassToTest {
   	
        static {
       	 
             System.out.println("Loading " + ClassToTest.class.getName());
             
        }
        
        static void reportLoaded() {
       	 
             System.out.println("Loaded");
        }
        
        
   }

}
