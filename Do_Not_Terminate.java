package com.example;

import java.security.Permission;

public class Do_Not_Terminate {

	public static class ExitTrappedException extends SecurityException
	{
	//	private static long lL;
		private static final long serialVersionUID=1L;
	}
	public static void forbidExit()
	{
		final SecurityManager securityManager = new SecurityManager()
		{
			@Override
			public void checkPermission(Permission permission)
			{
				if(permission.getName().contains("exitVM"))
				{
					throw new ExitTrappedException();
				}
			}
		};
		
		System.setSecurityManager(securityManager);
	}
}
