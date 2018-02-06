/**
 */
package ajiML.provider;


import ajiML.AjiMLFactory;
import ajiML.AjiMLPackage;

import ajiMLT.AjiMLTFactory;
import ajiMLT.provider.AjiMLEditPlugin;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ajiML.System} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_System_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_System_name_feature", "_UI_System_type"),
				 AjiMLPackage.Literals.SYSTEM__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(AjiMLPackage.Literals.SYSTEM__SERVICES);
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
	 * This returns System.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/System"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ajiML.System)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_System_type") :
			getString("_UI_System_type") + " " + label;
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

		switch (notification.getFeatureID(ajiML.System.class)) {
			case AjiMLPackage.SYSTEM__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case AjiMLPackage.SYSTEM__SERVICES:
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
				(AjiMLPackage.Literals.SYSTEM__SERVICES,
				 AjiMLFactory.eINSTANCE.createFunctionalService()));

		newChildDescriptors.add
			(createChildParameter
				(AjiMLPackage.Literals.SYSTEM__SERVICES,
				 AjiMLFactory.eINSTANCE.createDiscoveryService()));

		newChildDescriptors.add
			(createChildParameter
				(AjiMLPackage.Literals.SYSTEM__SERVICES,
				 AjiMLFactory.eINSTANCE.createAPIService()));

		newChildDescriptors.add
			(createChildParameter
				(AjiMLPackage.Literals.SYSTEM__SERVICES,
				 AjiMLFactory.eINSTANCE.createConfigurationService()));

		newChildDescriptors.add
			(createChildParameter
				(AjiMLPackage.Literals.SYSTEM__SERVICES,
				 AjiMLFactory.eINSTANCE.createSecurityService()));

		newChildDescriptors.add
			(createChildParameter
				(AjiMLPackage.Literals.SYSTEM__SERVICES,
				 AjiMLFactory.eINSTANCE.createUserManagementService()));

		newChildDescriptors.add
			(createChildParameter
				(AjiMLPackage.Literals.SYSTEM__SERVICES,
				 AjiMLTFactory.eINSTANCE.createFunctionalServiceT()));

		newChildDescriptors.add
			(createChildParameter
				(AjiMLPackage.Literals.SYSTEM__SERVICES,
				 AjiMLTFactory.eINSTANCE.createDiscoveryServiceT()));

		newChildDescriptors.add
			(createChildParameter
				(AjiMLPackage.Literals.SYSTEM__SERVICES,
				 AjiMLTFactory.eINSTANCE.createAPIServiceT()));

		newChildDescriptors.add
			(createChildParameter
				(AjiMLPackage.Literals.SYSTEM__SERVICES,
				 AjiMLTFactory.eINSTANCE.createConfigurationServiceT()));

		newChildDescriptors.add
			(createChildParameter
				(AjiMLPackage.Literals.SYSTEM__SERVICES,
				 AjiMLTFactory.eINSTANCE.createSecurityServiceT()));

		newChildDescriptors.add
			(createChildParameter
				(AjiMLPackage.Literals.SYSTEM__SERVICES,
				 AjiMLTFactory.eINSTANCE.createUserManagementServiceT()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return AjiMLEditPlugin.INSTANCE;
	}

}
