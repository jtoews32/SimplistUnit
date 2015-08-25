package org.su.SimplistUnit;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Set;
 
import org.reflections.Reflections;
import org.reflections.scanners.MethodAnnotationsScanner;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;

import org.su.annotations.*;
 
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
		try {
			Reflections reflections = new Reflections(new ConfigurationBuilder().setUrls( 
					ClasspathHelper.forPackage("com.annotations")).setScanners(
							new MethodAnnotationsScanner()));
			
			Set<Method> methods = reflections.getMethodsAnnotatedWith(Test.class);

			for(Method method: methods) {
				
				System.out.println(method.getDeclaringClass().getName() );

				Test annotation = 
						method.getAnnotation(Test.class);
				
				System.out.println(" # name: " + annotation.name());
				System.out.println(" # description: " + annotation.description());
				
				// method.getDeclaringClass().newInstance();
				// method.invoke( , , , ); etc.
			}
		} catch(Exception e) {
			
		}
 
			
    	
    	/*
		try {
			Reflections reflections = new Reflections(new ConfigurationBuilder().setUrls( 
					ClasspathHelper.forPackage("com.annotations")).setScanners(
							new MethodAnnotationsScanner()));
			
			Set<Method> methods = reflections.getMethodsAnnotatedWith(MyAnnotation.class);

			for(Method method: methods) {
				
				System.out.println(method.getDeclaringClass().getName() );

				MyAnnotation annotation = 
						method.getAnnotation(MyAnnotation.class);
				
				System.out.println(" # name: " + annotation.name());
				System.out.println(" # description: " + annotation.description());
				
				// method.getDeclaringClass().newInstance();
				// method.invoke( , , , ); etc.
			}
			
			
			
			
				PDFMediaTypeBundle clas = (PDFMediaTypeBundle) method.getDeclaringClass().newInstance();
				clas.initialize(this.testRecord, this.itextParser, this.itextReader, this.taggedXMLEntity, this.pdfBoxDocument);

				List<PDPage> pages = this.pdfBoxDocument.getDocumentCatalog().getAllPages();
				
				for (int i = 1; i <= this.getItextReader().getNumberOfPages(); i++) {
					method.invoke(clas, new PageObject(i, pages.get(i-1),  this.getItextReader().getPageResources(i)  )); 
			
					this.testRecord = clas.getTestRecord();
				} * / 
			}

		} catch(IllegalAccessException e4) {
			LOGGER.info(e4.toString());
			e4.printStackTrace();
		} catch(InstantiationException e5) {
			LOGGER.info(e5.toString()); 
		} catch(InvocationTargetException e6) {
			LOGGER.info(e6.toString());
		}finally {
		}	
		*/
    }
}
