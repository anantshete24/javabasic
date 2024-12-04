package com.example;

import java.security.Permission;

//Supporting class for AccessControlDemo
public class DoNotTerminate {

	public static class ExitTrappedException extends SecurityException{
	private static final long serialVersionUID = 1L;
	}
	public static void forbidExit()
	{
		@SuppressWarnings("deprecation")
		final SecurityManager securityManager=new SecurityManager()
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
