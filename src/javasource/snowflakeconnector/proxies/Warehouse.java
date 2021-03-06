// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package snowflakeconnector.proxies;

public class Warehouse
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject warehouseMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "SnowflakeConnector.Warehouse";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Name("Name"),
		State("State"),
		Size("Size"),
		RefreshSuccesful("RefreshSuccesful");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Warehouse(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "SnowflakeConnector.Warehouse"));
	}

	protected Warehouse(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject warehouseMendixObject)
	{
		if (warehouseMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("SnowflakeConnector.Warehouse", warehouseMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a SnowflakeConnector.Warehouse");

		this.warehouseMendixObject = warehouseMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Warehouse.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static snowflakeconnector.proxies.Warehouse initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return snowflakeconnector.proxies.Warehouse.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static snowflakeconnector.proxies.Warehouse initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new snowflakeconnector.proxies.Warehouse(context, mendixObject);
	}

	public static snowflakeconnector.proxies.Warehouse load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return snowflakeconnector.proxies.Warehouse.initialize(context, mendixObject);
	}

	public static java.util.List<snowflakeconnector.proxies.Warehouse> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<snowflakeconnector.proxies.Warehouse> result = new java.util.ArrayList<snowflakeconnector.proxies.Warehouse>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//SnowflakeConnector.Warehouse" + xpathConstraint))
			result.add(snowflakeconnector.proxies.Warehouse.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Name
	 */
	public final java.lang.String getName()
	{
		return getName(getContext());
	}

	/**
	 * @param context
	 * @return value of Name
	 */
	public final java.lang.String getName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Name.toString());
	}

	/**
	 * Set value of Name
	 * @param name
	 */
	public final void setName(java.lang.String name)
	{
		setName(getContext(), name);
	}

	/**
	 * Set value of Name
	 * @param context
	 * @param name
	 */
	public final void setName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String name)
	{
		getMendixObject().setValue(context, MemberNames.Name.toString(), name);
	}

	/**
	 * @return value of State
	 */
	public final java.lang.String getState()
	{
		return getState(getContext());
	}

	/**
	 * @param context
	 * @return value of State
	 */
	public final java.lang.String getState(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.State.toString());
	}

	/**
	 * Set value of State
	 * @param state
	 */
	public final void setState(java.lang.String state)
	{
		setState(getContext(), state);
	}

	/**
	 * Set value of State
	 * @param context
	 * @param state
	 */
	public final void setState(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String state)
	{
		getMendixObject().setValue(context, MemberNames.State.toString(), state);
	}

	/**
	 * Set value of Size
	 * @param size
	 */
	public final snowflakeconnector.proxies.Enum_WarehouseSize getSize()
	{
		return getSize(getContext());
	}

	/**
	 * @param context
	 * @return value of Size
	 */
	public final snowflakeconnector.proxies.Enum_WarehouseSize getSize(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Size.toString());
		if (obj == null)
			return null;

		return snowflakeconnector.proxies.Enum_WarehouseSize.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Size
	 * @param size
	 */
	public final void setSize(snowflakeconnector.proxies.Enum_WarehouseSize size)
	{
		setSize(getContext(), size);
	}

	/**
	 * Set value of Size
	 * @param context
	 * @param size
	 */
	public final void setSize(com.mendix.systemwideinterfaces.core.IContext context, snowflakeconnector.proxies.Enum_WarehouseSize size)
	{
		if (size != null)
			getMendixObject().setValue(context, MemberNames.Size.toString(), size.toString());
		else
			getMendixObject().setValue(context, MemberNames.Size.toString(), null);
	}

	/**
	 * @return value of RefreshSuccesful
	 */
	public final java.lang.Boolean getRefreshSuccesful()
	{
		return getRefreshSuccesful(getContext());
	}

	/**
	 * @param context
	 * @return value of RefreshSuccesful
	 */
	public final java.lang.Boolean getRefreshSuccesful(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.RefreshSuccesful.toString());
	}

	/**
	 * Set value of RefreshSuccesful
	 * @param refreshsuccesful
	 */
	public final void setRefreshSuccesful(java.lang.Boolean refreshsuccesful)
	{
		setRefreshSuccesful(getContext(), refreshsuccesful);
	}

	/**
	 * Set value of RefreshSuccesful
	 * @param context
	 * @param refreshsuccesful
	 */
	public final void setRefreshSuccesful(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean refreshsuccesful)
	{
		getMendixObject().setValue(context, MemberNames.RefreshSuccesful.toString(), refreshsuccesful);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return warehouseMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final snowflakeconnector.proxies.Warehouse that = (snowflakeconnector.proxies.Warehouse) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "SnowflakeConnector.Warehouse";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
