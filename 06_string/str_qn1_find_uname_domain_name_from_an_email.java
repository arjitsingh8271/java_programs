// Find if the email id is on gmail
// Find username and domain name from email

class str_qn1_find_uname_domain_name_from_an_email {
	
	public static void main(String[] args) {

		String s = "ankit@gmail.com";

		int i = s.indexOf("@");
		int i2 = s.indexOf(".");

		String userName = s.substring(0,i);
		String domainName = s.substring(i+1);

		String gmail = s.substring(i+1,i2);


		System.out.println("User Name: " +userName);
		System.out.println("Domain Name: " +domainName);
		System.out.println(gmail.compareTo("gmail"));

	}
}