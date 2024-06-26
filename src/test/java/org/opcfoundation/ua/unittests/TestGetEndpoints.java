 /* ========================================================================
 * Copyright (c) 2005-2015 The OPC Foundation, Inc. All rights reserved.
 *
 * OPC Foundation MIT License 1.00
 * 
 * Permission is hereby granted, free of charge, to any person
 * obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without
 * restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following
 * conditions:
 * 
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 *
 * The complete license agreement can be found here:
 * http://opcfoundation.org/License/MIT/1.00/
 * ======================================================================*/

package org.opcfoundation.ua.unittests;

import org.opcfoundation.ua.core.EndpointDescription;
import org.opcfoundation.ua.utils.EndpointUtil;


/*
public class TestGetEndpoints extends EndpointsTestBench {
*/
/* Issue 2495 in mantis. In case the endpoints are bound to some addresses only,
 * it should be ensured that they are only returned for endpoint requests coming from that interface. *//*

	*/
/*public void testGetHttpsEndpoints() {
		try {

			String hostname = EndpointUtil.getHostname();
			EndpointDescription[] endpoints = client.discoverEndpoints("https://" + hostname + ":8443");

			//Check that there's expected number of results
			assertEquals(1, endpoints.length);
			//Check results in more detail
			for(int i = 0; i < endpoints.length; i++) {
				EndpointDescription ed = endpoints[i];
				assertEquals("https://" + hostname + ":8443/UAExample", ed.getEndpointUrl());
				assertEquals("http://opcfoundation.org/UA/SecurityPolicy#None", ed.getSecurityPolicyUri());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void testGetOpcTcpEndpoints() {
		try {
			String hostname = EndpointUtil.getHostname();
			EndpointDescription[] endpoints = client.discoverEndpoints("opc.tcp://127.0.0.1:8666");

			//Check that there's expected number of results
			assertEquals(3, endpoints.length);
			//Check results in more detail
			for(int i = 0; i < endpoints.length; i++) {
				EndpointDescription ed = endpoints[i];
				assertEquals("opc.tcp://" + hostname + ":8666/UAExample", ed.getEndpointUrl());
				//EndpointsTestBench configured to use BASIC128RSA15_SIGN, BASIC128RSA15_SIGN_ENCRYPT and NONE, which go to indexes 0,1 and 2:
				if(i == 0 || i == 1) {
					assertEquals("http://opcfoundation.org/UA/SecurityPolicy#Basic128Rsa15", ed.getSecurityPolicyUri());
				}
				else {
					assertEquals("http://opcfoundation.org/UA/SecurityPolicy#None", ed.getSecurityPolicyUri());
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}*//*


}*/
