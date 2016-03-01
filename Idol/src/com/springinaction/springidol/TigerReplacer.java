package com.springinaction.springidol;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class TigerReplacer implements MethodReplacer
{

	@Override
	public Object reimplement(Object target, Method methof, Object[] arg2) throws Throwable {
		
		return "A ferocious tiger";
	}
	

}
