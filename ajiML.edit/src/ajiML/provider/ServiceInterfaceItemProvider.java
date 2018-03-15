/**
 */
package ajiML.provider;


import ajiML.AjiMLFactory;
import ajiML.AjiMLPackage;
import ajiML.ServiceInterface;

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
 * This is the item provider adapter for a {@link ajiML.ServiceInterface} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceInterfaceItemProvider 
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
	public ServiceInterfaceItemProvider(AdapterFactory adapterFactory) {
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
			addVersionPropertyDescriptor(object);
			addExposedToGatewaysPropertyDescriptor(object);
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
				 getString("_UI_ServiceInterface_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceInterface_name_feature", "_UI_ServiceInterface_type"),
				 AjiMLPackage.Literals.SERVICE_INTERFACE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceInterface_version_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceInterface_version_feature", "_UI_ServiceInterface_type"),
				 AjiMLPackage.Literals.SERVICE_INTERFACE__VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Exposed To Gateways feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExposedToGatewaysPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceInterface_exposedToGateways_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceInterface_exposedToGateways_feature", "_UI_ServiceInterface_type"),
				 AjiMLPackage.Literals.SERVICE_INTERFACE__EXPOSED_TO_GATEWAYS,
				 false,
				 false,
				 false,
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
			childrenFeatures.add(AjiMLPackage.Literals.SERVICE_INTERFACE__ABILITIES);
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
	 * This returns ServiceInterface.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ServiceInterface"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ServiceInterface)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ServiceInterface_type") :
			getString("_UI_ServiceInterface_type") + " " + label;
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

		switch (notification.getFeatureID(ServiceInterface.class)) {
			case AjiMLPackage.SERVICE_INTERFACE__NAME:
			case AjiMLPackage.SERVICE_INTERFACE__VERSION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case AjiMLPackage.SERVICE_INTERFACE__ABILITIES:
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
				(AjiMLPackage.Literals.SERVICE_INTERFACE__ABILITIES,
				 AjiMLFactory.eINSTANCE.createCreate()));

		newChildDescriptors.add
			(createChildParameter
				(AjiMLPackage.Literals.SERVICE_INTERFACE__ABILITIES,
				 AjiMLFactory.eINSTANCE.createRead()));

		newChildDescriptors.add
			(createChildParameter
				(AjiMLPackage.Literals.SERVICE_INTERFACE__ABILITIES,
				 AjiMLFactory.eINSTANCE.createMultiRead()));

		newChildDescriptors.add
			(createChildParameter
				(AjiMLPackage.Literals.SERVICE_INTERFACE__ABILITIES,
				 AjiMLFactory.eINSTANCE.createUpdate()));

		newChildDescriptors.add
			(createChildParameter
				(AjiMLPackage.Literals.SERVICE_INTERFACE__ABILITIES,
				 AjiMLFactory.eINSTANCE.createDelete()));

		newChildDescriptors.add
			(createChildParameter
				(AjiMLPackage.Literals.SERVICE_INTERFACE__ABILITIES,
				 AjiMLFactory.eINSTANCE.createCustom()));

		newChildDescriptors.add
			(createChildParameter
				(AjiMLPackage.Literals.SERVICE_INTERFACE__ABILITIES,
				 AjiMLTFactory.eINSTANCE.createCreateT()));

		newChildDescriptors.add
			(createChildParameter
				(AjiMLPackage.Literals.SERVICE_INTERFACE__ABILITIES,
				 AjiMLTFactory.eINSTANCE.createReadT()));

		newChildDescriptors.add
			(createChildParameter
				(AjiMLPackage.Literals.SERVICE_INTERFACE__ABILITIES,
				 AjiMLTFactory.eINSTANCE.createUpdateT()));

		newChildDescriptors.add
			(createChildParameter
				(AjiMLPackage.Literals.SERVICE_INTERFACE__ABILITIES,
				 AjiMLTFactory.eINSTANCE.createDeleteT()));

		newChildDescriptors.add
			(createChildParameter
				(AjiMLPackage.Literals.SERVICE_INTERFACE__ABILITIES,
				 AjiMLTFactory.eINSTANCE.createMultiReadT()));

		newChildDescriptors.add
			(createChildParameter
				(AjiMLPackage.Literals.SERVICE_INTERFACE__ABILITIES,
				 AjiMLTFactory.eINSTANCE.createCustomT()));
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
