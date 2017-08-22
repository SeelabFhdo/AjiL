/*******************************************************************************
 * Copyright (c) 2017 Jonas Sorgalla.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package ajil.generator.egl;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;

import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.egl.EglFileGeneratingTemplateFactory;
import org.eclipse.epsilon.egl.EgxModule;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.eol.models.IRelativePathResolver;

/**
 * EGL-based M2T Generator for the Aji Modeling Language.
 * This setup is based on the standalone egl example by Dimitrios Kolovos
 * @author Jonas Sorgalla 
 */
public class AjilEglGenerator {
	public static void main(String[] args) throws Exception {
		AjilEglGenerator yolo = new AjilEglGenerator();
	    // Parse main.egx
	    EgxModule module = new EgxModule(new EglFileGeneratingTemplateFactory());
	    module.parse(new File("src/ajil/generator/templates/main.egx").getAbsoluteFile());
	    
	    if (!module.getParseProblems().isEmpty()) {
	      System.out.println("Syntax errors found. Exiting.");
	      return;
	    }
	    IModel model = yolo.createEmfModel("Model", "src/ajil/generator/model/MeinSystem.ajil", "src/ajil/generator/metamodel/ajil.ecore", true, true);
	    model.load();
	    module.getContext().getModelRepository().addModel(model);
	    module.execute();
	}
	public EmfModel createEmfModel(String name, String model, 
			String metamodel, boolean readOnLoad, boolean storeOnDisposal) 
					throws EolModelLoadingException, URISyntaxException {
		EmfModel emfModel = new EmfModel();
		StringProperties properties = new StringProperties();
		properties.put(EmfModel.PROPERTY_NAME, name);
		properties.put(EmfModel.PROPERTY_FILE_BASED_METAMODEL_URI,
				getFileURI(metamodel).toString());
		properties.put(EmfModel.PROPERTY_MODEL_URI, 
				getFileURI(model).toString());
		properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad + "");
		properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, 
				storeOnDisposal + "");
		emfModel.load(properties, (IRelativePathResolver) null);
		return emfModel;
	}
	public URI getFileURI(String fileName) throws URISyntaxException {
		URI uri = new URI(fileName);
		return uri;
	}
}
