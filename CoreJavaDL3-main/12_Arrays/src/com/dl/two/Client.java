package com.dl.two;

class UserProfile{
	
	int userId;
	String userName;
	long contactNo;
	String city;
	
	public UserProfile(int userId, String userName, long contactNo, String city) {
		this.userId = userId;
		this.userName = userName;
		this.contactNo = contactNo;
		this.city = city;
	}
	
}

class UserDetails{
	
	int userDetailsId;
	UserProfile[] userProfiles;
	
	public UserDetails(int userDetailsId, UserProfile[] userProfiles) {
		this.userDetailsId = userDetailsId;
		this.userProfiles = userProfiles;
	}
	
	public void getDeatils() {
		
		System.out.println("\t" + "User Details");
		System.out.println(userDetailsId);
		for (UserProfile userProfile : userProfiles) {
			System.out.println(userProfile.userId);
			System.out.println(userProfile.userName);
			System.out.println(userProfile.contactNo);
			System.out.println(userProfile.city);
		}
	}
	
}
public class Client {

	public static void main(String[] args) {
		
		UserProfile userProfile = new UserProfile(101, "Sai Kiran", 9876543210L, "Hyd");
		UserProfile[] profiles = {userProfile};
		UserDetails details = new UserDetails(1, profiles);
		details.getDeatils();
	}
}
