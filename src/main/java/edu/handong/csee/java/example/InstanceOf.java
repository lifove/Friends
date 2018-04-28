package edu.handong.csee.java.example;

public class InstanceOf {

	public static void showWhatFriend(Friend friend){
		friend.writeDescriptuon();
	}
	
	public static void main(String[] args) {
		Friend friend1 = new Friend();
		Friend friend2 = new SchoolFriend();
		Friend friend3 = new ClassFriend();	
		
		InstanceOf.showWhatFriend(friend1);
		InstanceOf.showWhatFriend(friend2);
		InstanceOf.showWhatFriend(friend3);
	}

}
