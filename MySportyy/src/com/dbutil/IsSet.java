package com.dbutil;

public  class IsSet {

private static int fromAdminUpdate=0;
private static String entity;

public static String getEntity() {
	return entity;
}

public static void setEntity(String entity) {
	IsSet.entity = entity;
}

public static int isFromAdminUpdate()
{
	
	return(fromAdminUpdate);
}

public static void  resetFromAdminUpdate()
{
	fromAdminUpdate=0;
}
	
public static void fromAdminUpdate()
{
	fromAdminUpdate=1;
}



}
