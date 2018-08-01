package ajiML.editor.graphical;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import ajiML.Ability;
import ajiML.DataModel;
import ajiML.Entity;
import ajiMLT.CustomT;
import ajiMLT.EEntitySpecifier;
import ajiMLT.EntityT;
import ajiMLT.ServiceInterfaceT;

/**
 * The services class used by VSM.
 */
public class Services {
	//Default Constructor
    public Services() {
    	
    }
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    public EList<Entity> addInterfaceSubjects(EObject self, ServiceInterfaceT arg) {
     EList<Entity> returnValue = ((DataModel) self).getEntities();
     for (Ability a : arg.getAbilities()) {
    	EntityT subject = (EntityT) a.eGet(a.eClass().getEStructuralFeature("subject"));
    	subject.setType(EEntitySpecifier.PROXY);
    	if(!returnValue.contains(subject)) {
    		returnValue.add(subject);	
    	  }     	  
      }
      return returnValue;
    }
}
