package com.task.configue;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.EventListener;
import java.util.Map;
import java.util.Set;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterRegistration;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;
import jakarta.servlet.ServletRegistration.Dynamic;
import jakarta.servlet.SessionCookieConfig;
import jakarta.servlet.SessionTrackingMode;
import jakarta.servlet.descriptor.JspConfigDescriptor;

public class MockServletContext implements ServletContext {

	@Override
	public String getContextPath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ServletContext getContext(String uripath) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getMajorVersion() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMinorVersion() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getEffectiveMajorVersion() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getEffectiveMinorVersion() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getMimeType(String file) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<String> getResourcePaths(String path) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public URL getResource(String path) throws MalformedURLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InputStream getResourceAsStream(String path) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RequestDispatcher getRequestDispatcher(String path) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RequestDispatcher getNamedDispatcher(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Servlet getServlet(String name) throws ServletException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Enumeration<Servlet> getServlets() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Enumeration<String> getServletNames() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void log(String msg) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Exception exception, String msg) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(String message, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getRealPath(String path) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServerInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getInitParameter(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Enumeration<String> getInitParameterNames() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean setInitParameter(String name, String value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object getAttribute(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Enumeration<String> getAttributeNames() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAttribute(String name, Object object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeAttribute(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getServletContextName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dynamic addServlet(String servletName, String className) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dynamic addServlet(String servletName, Servlet servlet) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dynamic addServlet(String servletName, Class<? extends Servlet> servletClass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dynamic addJspFile(String servletName, String jspFile) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Servlet> T createServlet(Class<T> clazz) throws ServletException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ServletRegistration getServletRegistration(String servletName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, ? extends ServletRegistration> getServletRegistrations() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public jakarta.servlet.FilterRegistration.Dynamic addFilter(String filterName, String className) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public jakarta.servlet.FilterRegistration.Dynamic addFilter(String filterName, Filter filter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public jakarta.servlet.FilterRegistration.Dynamic addFilter(String filterName,
			Class<? extends Filter> filterClass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Filter> T createFilter(Class<T> clazz) throws ServletException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FilterRegistration getFilterRegistration(String filterName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, ? extends FilterRegistration> getFilterRegistrations() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SessionCookieConfig getSessionCookieConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSessionTrackingModes(Set<SessionTrackingMode> sessionTrackingModes) {
		// TODO Auto-generated method stub

	}

	@Override
	public Set<SessionTrackingMode> getDefaultSessionTrackingModes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<SessionTrackingMode> getEffectiveSessionTrackingModes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addListener(String className) {
		// TODO Auto-generated method stub

	}

	@Override
	public <T extends EventListener> void addListener(T t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addListener(Class<? extends EventListener> listenerClass) {
		// TODO Auto-generated method stub

	}

	@Override
	public <T extends EventListener> T createListener(Class<T> clazz) throws ServletException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JspConfigDescriptor getJspConfigDescriptor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClassLoader getClassLoader() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void declareRoles(String... roleNames) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getVirtualServerName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getSessionTimeout() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setSessionTimeout(int sessionTimeout) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getRequestCharacterEncoding() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setRequestCharacterEncoding(String encoding) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getResponseCharacterEncoding() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setResponseCharacterEncoding(String encoding) {
		// TODO Auto-generated method stub

	}

}
