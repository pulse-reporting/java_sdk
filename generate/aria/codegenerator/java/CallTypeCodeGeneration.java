package aria.codegenerator.java;

import java.io.IOException;
import aria.codegenerator.common.CodeGeneration;

/**
 * Generate dynamically the AriaBillingBuilder.java class code
 */
public class CallTypeCodeGeneration {
	private static final String		CLASS_SUB_PACKAGE	= "sdk/classes";
	private static final String		CLASS_NAME				= "CallType.java";
	private static StringBuilder	header;
	private static StringBuilder	footer;
	private String								wsdlUrl;
	private CodeGeneration				codeGeneration;

	public CallTypeCodeGeneration(String wsdlUrl, String generationRoot) {
		super();
		this.wsdlUrl = wsdlUrl;
	}

	/************************************ GETTERS AND SETTERS ****************************************/
	public CodeGeneration getCodeGeneration() {
		if (codeGeneration == null) {
			codeGeneration = CodeGeneration.getInstance();
		}
		return codeGeneration;
	}

	public String getWsdlUrl() {
		return wsdlUrl;
	}

	public static StringBuilder getHeader() {
		if (header == null) {
			header = new StringBuilder();
			header.append("package com.aria.sdk.classes;\n");
			header.append("\n");
			header.append("public enum CallType {\n");
			header.append("	SOAP, REST;\n");
			header.append("}\n");
		}
		return header;
	}

	public static StringBuilder getFooter() {
		if (footer == null) {
			footer = new StringBuilder();
			footer.append("");
		}
		return footer;
	}
	/********************************* END - GETTERS **********************************************/

	/********************************* MAIN **********************************************/
	public void build() throws IOException {
		StringBuilder resultString = new StringBuilder();
		resultString.append(getHeader());
		resultString.append(getFooter());
		getCodeGeneration().writeFile(CLASS_SUB_PACKAGE, CLASS_NAME, resultString.toString());
	}
	/********************************* END - MAIN **********************************************/
}
