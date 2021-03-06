package snmp;

class Config {

static final String[] STANDARD_MIBS = 
{"ACCOUNTING-CONTROL-MIB",
"ADSL-LINE-EXT-MIB",
"ADSL-LINE-MIB",
"ADSL-TC-MIB",
"ADSL2-LINE-MIB",
"ADSL2-LINE-TC-MIB",
"AGENTX-MIB",
"AGGREGATE-MIB",
"ALARM-MIB",
"APM-MIB",
"APPC-MIB",
"APPLETALK-MIB",
"APPLICATION-MIB",
"APPN-DLUR-MIB",
"APPN-MIB",
"APPN-TRAP-MIB",
"APS-MIB",
"ARC-MIB",
"ATM-ACCOUNTING-INFORMATION-MIB",
"ATM-MIB",
"ATM-TC-MIB",
"ATM2-MIB",
"BGP4-MIB",
"BLDG-HVAC-MIB",
"BRIDGE-MIB",
"CHARACTER-MIB",
"CIRCUIT-IF-MIB",
"CLNS-MIB",
"COFFEE-POT-MIB",
"COPS-CLIENT-MIB",
"DECNET-PHIV-MIB",
"DIAL-CONTROL-MIB",
"DIFFSERV-CONFIG-MIB",
"DIFFSERV-DSCP-TC",
"DIFFSERV-MIB",
"DIRECTORY-SERVER-MIB",
"DISMAN-EVENT-MIB",
"DISMAN-EXPRESSION-MIB",
"DISMAN-NSLOOKUP-MIB",
"DISMAN-PING-MIB",
"DISMAN-SCHEDULE-MIB",
"DISMAN-SCRIPT-MIB",
"DISMAN-TRACEROUTE-MIB",
"DLSW-MIB",
"DNS-RESOLVER-MIB",
"DNS-SERVER-MIB",
"DOCS-BPI-MIB",
"DOCS-CABLE-DEVICE-MIB",
"DOCS-IETF-BPI2-MIB",
"DOCS-IETF-CABLE-DEVICE-NOTIFICATION-MIB",
"DOCS-IETF-QOS-MIB",
"DOCS-IETF-SUBMGT-MIB",
"DOCS-IF-MIB",
"DOT12-IF-MIB",
"DOT12-RPTR-MIB",
"DOT3-EPON-MIB",
"DOT3-OAM-MIB",
"DS0-MIB",
"DS0BUNDLE-MIB",
"DS1-MIB",
"DS3-MIB",
"DSA-MIB",
"DSMON-MIB",
"EBN-MIB",
"EFM-CU-MIB",
"ENTITY-MIB",
"ENTITY-SENSOR-MIB",
"ENTITY-STATE-MIB",
"ENTITY-STATE-TC-MIB",
"ETHER-CHIPSET-MIB",
"ETHER-WIS",
"EtherLike-MIB",
"FC-MGMT-MIB",
"FCIP-MGMT-MIB",
"FDDI-SMT73-MIB",
"FIBRE-CHANNEL-FE-MIB",
"Finisher-MIB",
"FLOW-METER-MIB",
"FR-ATM-PVC-SERVICE-IWF-MIB",
"FR-MFR-MIB",
"FRAME-RELAY-DTE-MIB",
"FRNETSERV-MIB",
"FRSLD-MIB",
"GMPLS-LABEL-STD-MIB",
"GMPLS-LSR-STD-MIB",
"GMPLS-TC-STD-MIB",
"GMPLS-TE-STD-MIB",
"GSMP-MIB",
"HC-ALARM-MIB",
"HC-PerfHist-TC-MIB",
"HC-RMON-MIB",
"HCNUM-TC",
"HDSL2-SHDSL-LINE-MIB",
"HOST-RESOURCES-MIB",
"HOST-RESOURCES-TYPES",
"HPR-IP-MIB",
"HPR-MIB",
"IANA-ITU-ALARM-TC-MIB",
"IF-CAP-STACK-MIB",
"IF-INVERTED-STACK-MIB",
"IF-MIB",
"IFCP-MGMT-MIB",
"IGMP-STD-MIB",
"INET-ADDRESS-MIB",
"INTEGRATED-SERVICES-GUARANTEED-MIB",
"INTEGRATED-SERVICES-MIB",
"INTERFACETOPN-MIB",
"IP-FORWARD-MIB",
"IP-MIB",
"IPATM-IPMC-MIB",
"IPMCAST-MIB",
"IPMROUTE-STD-MIB",
"IPOA-MIB",
"IPS-AUTH-MIB",
"IPSEC-SPD-MIB",
"IPV6-FLOW-LABEL-MIB",
"IPV6-ICMP-MIB",
"IPV6-MIB",
"IPV6-MLD-MIB",
"IPV6-TC",
"IPV6-TCP-MIB",
"IPV6-UDP-MIB",
"ISCSI-MIB",
"ISDN-MIB",
"ISIS-MIB",
"ISNS-MIB",
"ITU-ALARM-MIB",
"ITU-ALARM-TC-MIB",
"Job-Monitoring-MIB",
"L2TP-MIB",
"LANGTAG-TC-MIB",
"LMP-MIB",
"MALLOC-MIB",
"MAU-MIB",
"MIDCOM-MIB",
"MIOX25-MIB",
"MIP-MIB",
"MOBILEIPV6-MIB",
"Modem-MIB",
"MPLS-FTN-STD-MIB",
"MPLS-L3VPN-STD-MIB",
"MPLS-LC-ATM-STD-MIB",
"MPLS-LC-FR-STD-MIB",
"MPLS-LDP-ATM-STD-MIB",
"MPLS-LDP-FRAME-RELAY-STD-MIB",
"MPLS-LDP-GENERIC-STD-MIB",
"MPLS-LDP-STD-MIB",
"MPLS-LSR-STD-MIB",
"MPLS-TC-STD-MIB",
"MPLS-TE-STD-MIB",
"MSDP-MIB",
"MTA-MIB",
"NAT-MIB",
"NETWORK-SERVICES-MIB",
"NHRP-MIB",
"NOTIFICATION-LOG-MIB",
"OPT-IF-MIB",
"OSPF-MIB",
"OSPF-TRAP-MIB",
"P-BRIDGE-MIB",
"PARALLEL-MIB",
"PerfHist-TC-MIB",
"PIM-MIB",
"PIM-STD-MIB",
"PINT-MIB",
"PKTC-IETF-MTA-MIB",
"PKTC-IETF-SIG-MIB",
"POLICY-BASED-MANAGEMENT-MIB",
"POWER-ETHERNET-MIB",
"PPP-BRIDGE-NCP-MIB",
"PPP-IP-NCP-MIB",
"PPP-LCP-MIB",
"PPP-SEC-MIB",
"Printer-MIB",
"PTOPO-MIB",
"Q-BRIDGE-MIB",
"RADIUS-ACC-CLIENT-MIB",
"RADIUS-ACC-SERVER-MIB",
"RADIUS-AUTH-CLIENT-MIB",
"RADIUS-AUTH-SERVER-MIB",
"RADIUS-DYNAUTH-CLIENT-MIB",
"RADIUS-DYNAUTH-SERVER-MIB",
"RAQMON-MIB",
"RDBMS-MIB",
"RFC-1212",
"RFC-1215",
"RFC1065-SMI",
"RFC1155-SMI",
"RFC1158-MIB",
"RFC1213-MIB",
"RFC1229-MIB",
"RFC1231-MIB",
"RFC1243-MIB",
"RFC1253-MIB",
"RFC1269-MIB",
"RFC1271-MIB",
"RFC1285-MIB",
"RFC1315-MIB",
"RFC1316-MIB",
"RFC1381-MIB",
"RFC1382-MIB",
"RFC1398-MIB",
"RFC1406-MIB",
"RFC1407-MIB",
"RFC1414-MIB",
"RIPv2-MIB",
"RMON-MIB",
"RMON2-MIB",
"ROHC-MIB",
"ROHC-RTP-MIB",
"ROHC-UNCOMPRESSED-MIB",
"RS-232-MIB",
"RSTP-MIB",
"RSVP-MIB",
"RTP-MIB",
"SCSI-MIB",
"SCTP-MIB",
"SFLOW-MIB",
"SIP-COMMON-MIB",
"SIP-MIB",
"SIP-SERVER-MIB",
"SIP-TC-MIB",
"SIP-UA-MIB",
"SLAPM-MIB",
"SMON-MIB",
"SNA-NAU-MIB",
"SNA-SDLC-MIB",
"SNMP-COMMUNITY-MIB",
"SNMP-FRAMEWORK-MIB",
"SNMP-MPD-MIB",
"SNMP-NOTIFICATION-MIB",
"SNMP-PROXY-MIB",
"SNMP-REPEATER-MIB",
"SNMP-TARGET-MIB",
"SNMP-USER-BASED-SM-MIB",
"SNMP-USM-AES-MIB",
"SNMP-USM-DH-OBJECTS-MIB",
"SNMP-VIEW-BASED-ACM-MIB",
"SNMPv2-CONF",
"SNMPv2-MIB",
"SNMPv2-PDU",
"SNMPv2-SMI",
"SNMPv2-TC",
"SNMPv2-TM",
"SNMPv2-USEC-MIB",
"SONET-MIB",
"SOURCE-ROUTING-MIB",
"SSPM-MIB",
"SYSAPPL-MIB",
"T11-FC-FABRIC-ADDR-MGR-MIB",
"T11-FC-FABRIC-CONFIG-SERVER-MIB",
"T11-FC-FABRIC-LOCK-MIB",
"T11-FC-FSPF-MIB",
"T11-FC-NAME-SERVER-MIB",
"T11-FC-ROUTE-MIB",
"T11-FC-RSCN-MIB",
"T11-FC-VIRTUAL-FABRIC-MIB",
"T11-FC-ZONE-SERVER-MIB",
"T11-TC-MIB",
"TCP-ESTATS-MIB",
"TCP-MIB",
"TCPIPX-MIB",
"TE-LINK-STD-MIB",
"TE-MIB",
"TIME-AGGREGATE-MIB",
"TN3270E-MIB",
"TN3270E-RT-MIB",
"TOKEN-RING-RMON-MIB",
"TOKENRING-MIB",
"TOKENRING-STATION-SR-MIB",
"TRANSPORT-ADDRESS-MIB",
"TRIP-MIB",
"TRIP-TC-MIB",
"TUNNEL-MIB",
"UDP-MIB",
"UDPLITE-MIB",
"UPS-MIB",
"URI-TC-MIB",
"VDSL-LINE-EXT-MCM-MIB",
"VDSL-LINE-EXT-SCM-MIB",
"VDSL-LINE-MIB",
"VPN-TC-STD-MIB",
"VRRP-MIB",
"WWW-MIB",

"IANA-ADDRESS-FAMILY-NUMBERS-MIB",
"IANA-CHARSET-MIB",
"IANA-FINISHER-MIB",
"IANA-GMPLS-TC-MIB",
"IANA-IPPM-METRICS-REGISTRY-MIB",
"IANA-ITU-ALARM-TC-MIB",
"IANA-LANGUAGE-MIB",
"IANA-MALLOC-MIB",
"IANA-MAU-MIB",
"IANA-PRINTER-MIB",
"IANA-RTPROTO-MIB",
"IANAifType-MIB",
"IANATn3270eTC-MIB"};
	
	
}
