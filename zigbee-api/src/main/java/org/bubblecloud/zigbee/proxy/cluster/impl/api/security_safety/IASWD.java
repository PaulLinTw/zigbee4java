/*
   Copyright 2008-2013 CNR-ISTI, http://isti.cnr.it
   Institute of Information Science and Technologies 
   of the Italian National Research Council 


   See the NOTICE file distributed with this work for additional 
   information regarding copyright ownership

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/

package org.bubblecloud.zigbee.proxy.cluster.impl.api.security_safety;

import org.bubblecloud.zigbee.proxy.cluster.impl.api.core.Attribute;
import org.bubblecloud.zigbee.proxy.cluster.impl.api.core.ZCLCluster;
import org.bubblecloud.zigbee.proxy.cluster.impl.api.core.ZigBeeClusterException;
import org.bubblecloud.zigbee.proxy.cluster.impl.api.security_safety.ias_wd.SquawkPayload;
import org.bubblecloud.zigbee.proxy.cluster.impl.api.security_safety.ias_wd.StartWarningPayload;

/**
 * @author <a href="mailto:stefano.lenzi@isti.cnr.it">Stefano "Kismet" Lenzi</a>
 * @author <a href="mailto:francesco.furfari@isti.cnr.it">Francesco Furfari</a>
 * @author <a href="mailto:manlio.bacco@isti.cnr.it">Manlio Bacco</a>
 * @version $LastChangedRevision: 799 $ ($LastChangedDate: 2013-08-06 19:00:05 +0300 (Tue, 06 Aug 2013) $)
 * @since 0.1.0
 */
public interface IASWD extends ZCLCluster {

    public static final short ID = 0x0502;
    static final String NAME = "IAS WD";
    static final String DESCRIPTION = "Attributes and commands for any Warning Device Equipment device.";

    static final byte START_WARNING = 0x00;
    static final byte SQUAWK = 0x01;

    public Attribute getAttributeMaxDuration();

    public void startWarning(StartWarningPayload payload) throws ZigBeeClusterException;

    public void squawk(SquawkPayload payload) throws ZigBeeClusterException;
}