/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package jp.co.liferay.reservation.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.ShardedModel;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the PersistedPurpose service. Represents a row in the &quot;Reservation_PersistedPurpose&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>jp.co.liferay.reservation.model.impl.PersistedPurposeModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>jp.co.liferay.reservation.model.impl.PersistedPurposeImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PersistedPurpose
 * @generated
 */
@ProviderType
public interface PersistedPurposeModel
	extends BaseModel<PersistedPurpose>, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a persisted purpose model instance should use the {@link PersistedPurpose} interface instead.
	 */

	/**
	 * Returns the primary key of this persisted purpose.
	 *
	 * @return the primary key of this persisted purpose
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this persisted purpose.
	 *
	 * @param primaryKey the primary key of this persisted purpose
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this persisted purpose.
	 *
	 * @return the uuid of this persisted purpose
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this persisted purpose.
	 *
	 * @param uuid the uuid of this persisted purpose
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the external reference code of this persisted purpose.
	 *
	 * @return the external reference code of this persisted purpose
	 */
	@AutoEscape
	public String getExternalReferenceCode();

	/**
	 * Sets the external reference code of this persisted purpose.
	 *
	 * @param externalReferenceCode the external reference code of this persisted purpose
	 */
	public void setExternalReferenceCode(String externalReferenceCode);

	/**
	 * Returns the purpose ID of this persisted purpose.
	 *
	 * @return the purpose ID of this persisted purpose
	 */
	public long getPurposeId();

	/**
	 * Sets the purpose ID of this persisted purpose.
	 *
	 * @param purposeId the purpose ID of this persisted purpose
	 */
	public void setPurposeId(long purposeId);

	/**
	 * Returns the name of this persisted purpose.
	 *
	 * @return the name of this persisted purpose
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this persisted purpose.
	 *
	 * @param name the name of this persisted purpose
	 */
	public void setName(String name);

	/**
	 * Returns the company ID of this persisted purpose.
	 *
	 * @return the company ID of this persisted purpose
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this persisted purpose.
	 *
	 * @param companyId the company ID of this persisted purpose
	 */
	@Override
	public void setCompanyId(long companyId);

}