// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package snowflakeconnector.proxies;

public class SnowflakeConfiguration
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject snowflakeConfigurationMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "SnowflakeConnector.SnowflakeConfiguration";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		AccountName("AccountName"),
		User("User"),
		Password("Password"),
		Role("Role"),
		UsePrivateLink("UsePrivateLink");

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

	public SnowflakeConfiguration(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "SnowflakeConnector.SnowflakeConfiguration"));
	}

	protected SnowflakeConfiguration(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject snowflakeConfigurationMendixObject)
	{
		if (snowflakeConfigurationMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("SnowflakeConnector.SnowflakeConfiguration", snowflakeConfigurationMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a SnowflakeConnector.SnowflakeConfiguration");

		this.snowflakeConfigurationMendixObject = snowflakeConfigurationMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'SnowflakeConfiguration.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static snowflakeconnector.proxies.SnowflakeConfiguration initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return snowflakeconnector.proxies.SnowflakeConfiguration.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static snowflakeconnector.proxies.SnowflakeConfiguration initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new snowflakeconnector.proxies.SnowflakeConfiguration(context, mendixObject);
	}

	public static snowflakeconnector.proxies.SnowflakeConfiguration load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return snowflakeconnector.proxies.SnowflakeConfiguration.initialize(context, mendixObject);
	}

	public static java.util.List<snowflakeconnector.proxies.SnowflakeConfiguration> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<snowflakeconnector.proxies.SnowflakeConfiguration> result = new java.util.ArrayList<snowflakeconnector.proxies.SnowflakeConfiguration>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//SnowflakeConnector.SnowflakeConfiguration" + xpathConstraint))
			result.add(snowflakeconnector.proxies.SnowflakeConfiguration.initialize(context, obj));
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
	 * @return value of AccountName
	 */
	public final java.lang.String getAccountName()
	{
		return getAccountName(getContext());
	}

	/**
	 * @param context
	 * @return value of AccountName
	 */
	public final java.lang.String getAccountName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.AccountName.toString());
	}

	/**
	 * Set value of AccountName
	 * @param accountname
	 */
	public final void setAccountName(java.lang.String accountname)
	{
		setAccountName(getContext(), accountname);
	}

	/**
	 * Set value of AccountName
	 * @param context
	 * @param accountname
	 */
	public final void setAccountName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String accountname)
	{
		getMendixObject().setValue(context, MemberNames.AccountName.toString(), accountname);
	}

	/**
	 * @return value of User
	 */
	public final java.lang.String getUser()
	{
		return getUser(getContext());
	}

	/**
	 * @param context
	 * @return value of User
	 */
	public final java.lang.String getUser(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.User.toString());
	}

	/**
	 * Set value of User
	 * @param user
	 */
	public final void setUser(java.lang.String user)
	{
		setUser(getContext(), user);
	}

	/**
	 * Set value of User
	 * @param context
	 * @param user
	 */
	public final void setUser(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String user)
	{
		getMendixObject().setValue(context, MemberNames.User.toString(), user);
	}

	/**
	 * @return value of Password
	 */
	public final java.lang.String getPassword()
	{
		return getPassword(getContext());
	}

	/**
	 * @param context
	 * @return value of Password
	 */
	public final java.lang.String getPassword(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Password.toString());
	}

	/**
	 * Set value of Password
	 * @param password
	 */
	public final void setPassword(java.lang.String password)
	{
		setPassword(getContext(), password);
	}

	/**
	 * Set value of Password
	 * @param context
	 * @param password
	 */
	public final void setPassword(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String password)
	{
		getMendixObject().setValue(context, MemberNames.Password.toString(), password);
	}

	/**
	 * @return value of Role
	 */
	public final java.lang.String getRole()
	{
		return getRole(getContext());
	}

	/**
	 * @param context
	 * @return value of Role
	 */
	public final java.lang.String getRole(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Role.toString());
	}

	/**
	 * Set value of Role
	 * @param role
	 */
	public final void setRole(java.lang.String role)
	{
		setRole(getContext(), role);
	}

	/**
	 * Set value of Role
	 * @param context
	 * @param role
	 */
	public final void setRole(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String role)
	{
		getMendixObject().setValue(context, MemberNames.Role.toString(), role);
	}

	/**
	 * @return value of UsePrivateLink
	 */
	public final java.lang.Boolean getUsePrivateLink()
	{
		return getUsePrivateLink(getContext());
	}

	/**
	 * @param context
	 * @return value of UsePrivateLink
	 */
	public final java.lang.Boolean getUsePrivateLink(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.UsePrivateLink.toString());
	}

	/**
	 * Set value of UsePrivateLink
	 * @param useprivatelink
	 */
	public final void setUsePrivateLink(java.lang.Boolean useprivatelink)
	{
		setUsePrivateLink(getContext(), useprivatelink);
	}

	/**
	 * Set value of UsePrivateLink
	 * @param context
	 * @param useprivatelink
	 */
	public final void setUsePrivateLink(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean useprivatelink)
	{
		getMendixObject().setValue(context, MemberNames.UsePrivateLink.toString(), useprivatelink);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return snowflakeConfigurationMendixObject;
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
			final snowflakeconnector.proxies.SnowflakeConfiguration that = (snowflakeconnector.proxies.SnowflakeConfiguration) obj;
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
		return "SnowflakeConnector.SnowflakeConfiguration";
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
