/**
 */
package ajiMLT.provider;


import ajiML.provider.SecurityServiceItemProvider;

import ajiMLT.AjiMLTPackage;
import ajiMLT.SecurityServiceT;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ajiMLT.SecurityServiceT} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SecurityServiceTItemProvider extends SecurityServiceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityServiceTItemProvider(AdapterFactory adapterFactory) {
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

			addGeneratorPropertyDescriptor(object);
			addCertificatePathPropertyDescriptor(object);
			addCertificatePasswordPropertyDescriptor(object);
			addKeyPairNamePropertyDescriptor(object);
			addPublicKeyPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Generator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGeneratorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GeneratorDescriptor_generator_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GeneratorDescriptor_generator_feature", "_UI_GeneratorDescriptor_type"),
				 AjiMLTPackage.Literals.GENERATOR_DESCRIPTOR__GENERATOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Certificate Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCertificatePathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SecurityServiceT_certificatePath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SecurityServiceT_certificatePath_feature", "_UI_SecurityServiceT_type"),
				 AjiMLTPackage.Literals.SECURITY_SERVICE_T__CERTIFICATE_PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Certificate Password feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCertificatePasswordPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SecurityServiceT_certificatePassword_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SecurityServiceT_certificatePassword_feature", "_UI_SecurityServiceT_type"),
				 AjiMLTPackage.Literals.SECURITY_SERVICE_T__CERTIFICATE_PASSWORD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Key Pair Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKeyPairNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SecurityServiceT_KeyPairName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SecurityServiceT_KeyPairName_feature", "_UI_SecurityServiceT_type"),
				 AjiMLTPackage.Literals.SECURITY_SERVICE_T__KEY_PAIR_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Public Key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPublicKeyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SecurityServiceT_publicKey_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SecurityServiceT_publicKey_feature", "_UI_SecurityServiceT_type"),
				 AjiMLTPackage.Literals.SECURITY_SERVICE_T__PUBLIC_KEY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns SecurityServiceT.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SecurityServiceT"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SecurityServiceT)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SecurityServiceT_type") :
			getString("_UI_SecurityServiceT_type") + " " + label;
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

		switch (notification.getFeatureID(SecurityServiceT.class)) {
			case AjiMLTPackage.SECURITY_SERVICE_T__GENERATOR:
			case AjiMLTPackage.SECURITY_SERVICE_T__CERTIFICATE_PATH:
			case AjiMLTPackage.SECURITY_SERVICE_T__CERTIFICATE_PASSWORD:
			case AjiMLTPackage.SECURITY_SERVICE_T__KEY_PAIR_NAME:
			case AjiMLTPackage.SECURITY_SERVICE_T__PUBLIC_KEY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
