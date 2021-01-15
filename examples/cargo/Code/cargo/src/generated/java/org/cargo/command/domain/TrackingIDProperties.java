package org.cargo.command.domain;

import org.cargo.command.domain.TrackingID;
import org.sculptor.framework.domain.LeafProperty;
import org.sculptor.framework.domain.PropertiesCollection;
import org.sculptor.framework.domain.Property;

/**
 * This generated interface defines property names for all
 * attributes and associatations in
 * {@link org.cargo.command.domain.TrackingID}.
 * <p>
 * These properties are useful when building
 * criteria with {@link org.sculptor.framework.accessapi.ConditionalCriteriaBuilder},
 * which can be used with findByCondition Repository operation.
 */
public class TrackingIDProperties {

	private TrackingIDProperties() {
	}

	private static final TrackingIDPropertiesImpl<TrackingID> sharedInstance = new TrackingIDPropertiesImpl<TrackingID>(
			TrackingID.class);

	public static Property<TrackingID> id() {
		return sharedInstance.id();
	}

	/**
	 * This class is used for references to {@link org.cargo.command.domain.TrackingID},
	 * i.e. nested property.
	 */
	public static class TrackingIDProperty<T> extends TrackingIDPropertiesImpl<T> implements Property<T> {
		private static final long serialVersionUID = 1L;

		public TrackingIDProperty(String parentPath, String additionalPath, Class<T> owningClass) {
			super(parentPath, additionalPath, owningClass);
		}
	}

	protected static class TrackingIDPropertiesImpl<T> extends PropertiesCollection {
		private static final long serialVersionUID = 1L;
		Class<T> owningClass;

		TrackingIDPropertiesImpl(Class<T> owningClass) {
			super(null);
			this.owningClass = owningClass;
		}

		TrackingIDPropertiesImpl(String parentPath, String additionalPath, Class<T> owningClass) {
			super(parentPath, additionalPath);
			this.owningClass = owningClass;
		}

		public Property<T> id() {
			return new LeafProperty<T>(getParentPath(), "id", false, owningClass);
		}
	}
}
