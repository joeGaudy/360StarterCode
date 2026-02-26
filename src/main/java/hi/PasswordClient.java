package hi;

import org.springframework.web.client.RestClient;


public class PasswordClient
{
	
	public static void main(String[] args)
	{
		RestClient defaultClient = RestClient.create();
		
		String homeUri = "http://cs-hydra.centre.edu:9000";
		
		String reqPassword = defaultClient.get()
				.uri(homeUri + "/request/joegaudy")
				.retrieve()
				.body(String.class);
		
		String authPassword = defaultClient.get()
				.uri(homeUri + "/auth/joegaudy/" + reqPassword)
				.retrieve()
				.body(String.class);
				
		System.out.print(reqPassword);
		System.out.print(authPassword);
	}
}

