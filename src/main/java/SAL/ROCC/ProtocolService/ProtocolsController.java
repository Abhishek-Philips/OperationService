package SAL.ROCC.ProtocolService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProtocolsController {
	
	@RequestMapping(method=RequestMethod.GET, value="/getProtocols/{consoleVersion}")
	public String getProtocolsByConsoleVersion(@PathVariable String consoleVersion)
	{
		return "";
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/getProtocol/{protocolName}")
	public String getProtocolByProtocolName(@PathVariable String protocolName)
	{
		return "";
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/addProtocol")
	public String addProtocol(@RequestBody ProtocolModel protocol)
	{
		//Save ProtocolContent to S3 to get ID
		//Save id to metadata and save metadata to postgreSQL
		return "Protocol Saved Successfully";
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/updateProtocol/{protocolName}")
	public String updateProtocol(@PathVariable String protocolName, @RequestBody ProtocolModel protocol)
	{
		return "";
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/deleteProtocol/{protocolName}")
	public String deleteProtocolByProtocolName(@PathVariable String protocolName)
	{
		return "";
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/deleteProtocols/{consoleVersion}")
	public String deleteProtocolsByConsoleVersion(@PathVariable String consoleVersion)
	{
		return "";
	}

}
