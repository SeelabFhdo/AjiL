/**
 */
package ajiML.provider;


import ajiML.AjiMLFactory;
import ajiML.AjiMLPackage;
import ajiML.FunctionalService;

import ajiMLT.AjiMLTFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ajiML.FunctionalService} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionalServiceItemProvider extends MicroserviceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalServiceItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addServiceDependenciesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Service Dependencies feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServiceDependenciesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FunctionalService_serviceDependencies_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FunctionalService_serviceDependencies_feature", "_UI_FunctionalService_type"),
				 AjiMLPackage.Literals.FUNCTIONAL_SERVICE__SERVICE_DEPENDENCIES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(AjiMLPackage.Literals.FUNCTIONAL_SERVICE__DOMAIN);
			childrenFeatures.add(AjiMLPackage.Literals.FUNCTIONAL_SERVICE__PROVIDED_INTERFACES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns FunctionalService.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FunctionalService"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((FunctionalService)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_FunctionalService_type") :
			getString("_UI_FunctionalService_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(FunctionalService.class)) {
			case AjiMLPackage.FUNCTIONAL_SERVICE__DOMAIN:
			case AjiMLPackage.FUNCTIONAL_SERVICE__PROVIDED_INTERFACES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(AjiMLPackage.Literals.FUNCTIONAL_SERVICE__DOMAIN,
				 AjiMLFactory.eINSTANCE.createDataModel()));

		newChildDescriptors.add
			(createChildParameter
				(AjiMLPackage.Literals.FUNCTIONAL_SERVICE__DOMAIN,
				 AjiMLTFactory.eINSTANCE.createDataModelT()));

		newChildDescriptors.add
			(createChildParameter
				(AjiMLPackage.Literals.FUNCTIONAL_SERVICE__PROVIDED_INTERFACES,
				 AjiMLFactory.eINSTANCE.createServiceInterface()));

		newChildDescriptors.add
			(createChildParameter
				(AjiMLPackage.Literals.FUNCTIONAL_SERVICE__PROVIDED_INTERFACES,
				 AjiMLTFactory.eINSTANCE.createServiceInterfaceT()));
	}

}
