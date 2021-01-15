package org.cargo.command.domain;

import java.time.LocalDateTime;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;
import org.cargo.command.domain.TrackingID;
import org.sculptor.framework.domain.AbstractDomainObject;
import org.sculptor.framework.domain.AuditListener;
import org.sculptor.framework.domain.Auditable;
import org.sculptor.framework.domain.Identifiable;

/**
 * Entity representing Cargo.
 */

@Entity
@Table(name = "CARGO")
@EntityListeners({ AuditListener.class })
public class Cargo extends AbstractDomainObject implements Auditable, Identifiable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;

	@Column(name = "CREATEDDATE")
	private LocalDateTime createdDate;

	@Column(name = "CREATEDBY", length = 50)
	private String createdBy;

	@Column(name = "LASTUPDATED")
	private LocalDateTime lastUpdated;

	@Column(name = "LASTUPDATEDBY", length = 50)
	private String lastUpdatedBy;

	@Version
	@Column(name = "VERSION", nullable = false)
	private Long version;

	@ManyToOne(optional = false, cascade = CascadeType.ALL)
	@JoinColumn(name = "TRACKINGID", nullable = false, unique = true, foreignKey = @ForeignKey(name = "FK_CARGO_TRACKINGID"))
	@NotNull
	private TrackingID trackingId;

	protected Cargo() {
	}

	public Cargo(TrackingID trackingId) {
		super();
		this.trackingId = trackingId;
	}

	public Long getId() {
		return id;
	}

	/**
		* The id is not intended to be changed or assigned manually, but
		* for test purpose it is allowed to assign the id.
		*/
	protected void setId(Long id) {
		if ((this.id != null) && !this.id.equals(id)) {
			throw new IllegalArgumentException("Not allowed to change the id property.");
		}
		this.id = id;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;

	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;

	}

	public LocalDateTime getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(LocalDateTime lastUpdated) {
		this.lastUpdated = lastUpdated;

	}

	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;

	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;

	}

	public TrackingID getTrackingId() {
		return trackingId;
	}

	/**
	 * This reference can't be changed. Use constructor to assign value.
	 * However, some tools need setter methods and sometimes the
	 * referred object is not available at construction time. Therefore
	 * this method is visible, but the actual reference can't be changed
	 * once it is assigned.
	 */
	public void setTrackingId(TrackingID trackingId) {
		// it must be possible to set null when deleting objects
		if ((trackingId != null) && (this.trackingId != null) && !this.trackingId.equals(trackingId)) {
			throw new IllegalArgumentException("Not allowed to change the trackingId reference.");
		}
		this.trackingId = trackingId;
	}

	/**
	 * This method is used by equals and hashCode.
	 * @return {@link #getTrackingId}
	 */
	public Object getKey() {
		return getTrackingId();
	}

}
