package com.dub.spring.controller.utils;

import javax.servlet.http.HttpSession;

public interface OrderUtils {
	
	public String getActiveOrderId(HttpSession session);
	public void invalidActiveOrderId(HttpSession session);
}
