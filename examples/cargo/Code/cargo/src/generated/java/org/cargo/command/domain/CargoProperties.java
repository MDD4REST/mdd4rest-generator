package org.cargo.command.domain;

import org.cargo.command.domain.Cargo;
import org.cargo.command.domain.TrackingIDProperties.TrackingIDProperty;
import org.sculptor.framework.domain.LeafProperty;
import org.sculptor.framework.domain.PropertiesCollection;
import org.sculptor.framework.domain.Property;

/**
 * This generated interface defines property names for all
 * attributes and associatations in
 * {@link org.cargo.command.domain.Cargo}.
 * <p>
 * These properties are useful when building
 * criteria with {@link org.sculptor.framework.accessapi.ConditionalCriteriaBuilder},
 * which can be used with findByCondition Repository operation.
 */
public class CargoProperties {

	private CargoProperties() {
	}

	private static final CargoPropertiesImpl<Cargo> sharedInstance = new CargoPropertiesImpl<Cargo>(Cargo.class);

	public static Property<Cargo> id() {
		return sharedInstance.id();
	}

	public static Property<Cargo> createdDate() {
		return sharedInstance.createdDate();
	}

	public static Property<Cargo> createdBy() {
		return sharedInstance.createdBy();
	}

	public static Property<Cargo> lastUpdated() {
		return sharedInstance.lastUpdated();
	}

	public static Property<Cargo> lastUpdatedBy() {
		return sharedInstance.lastUpdatedBy();
	}

	public static Property<Cargo> version() {
		return sharedInstance.version();
	}

	public static TrackingIDProperty<Cargo> trackingId() {
		return sharedInstance.trackingId();
	}

	/**
	 * This class is used for references to {@link org.cargo.command.domain.Cargo},
	 * i.e. nested property.
	 */
	public static class CargoProperty<T> extends CargoPropertiesImpl<T> implements Property<T> {
		private static final long serialVersionUID = 1L;

		public CargoProperty(String parentPath, String additionalPath, Class<T> owningClass) {
			super(parentPath, additionalPath, owningClass);
		}
	}

	protected static class CargoPropertiesImpl<T> extends PropertiesCollection {
		private static final long serialVersionUID = 1L;
		Class<T> owningClass;

		CargoPropertiesImpl(Class<T> owningClass) {
			super(null);
			this.owningClass = owningClass;
		}

		CargoPropertiesImpl(String parentPath, String additionalPath, Class<T> owningClass) {
			super(parentPath, additionalPath);
			this.owningClass = owningClass;
		}

		public Property<T> id() {
			return new LeafProperty<T>(getParentPath(), "id", false, owningClass);
		}

		public Property<T> createdDate() {
			return new LeafProperty<T>(getParentPath(), "createdDate", false, owningClass);
		}

		public Property<T> createdBy() {
			return new LeafProperty<T>(getParentPath(), "createdBy", false, owningClass);
		}

		public Property<T> lastUpdated() {
			return new LeafProperty<T>(getParentPath(), "lastUpdated", false, owningClass);
		}

		public Property<T> lastUpdatedBy() {
			return new LeafProperty<T>(getParentPath(), "lastUpdatedBy", false, owningClass);
		}

		public Property<T> version() {
			return new LeafProperty<T>(getParentPath(), "version", false, owningClass);
		}

		public TrackingIDProperty<T> trackingId() {
			return new TrackingIDProperty<T>(getParentPath(), "trackingId", owningClass);
		}
	}
}
